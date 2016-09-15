package cn.hncu.utils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * Servlet的基类，继承HttpServlet
 * 对其中的方法用类反射进行加强
 * 动态调用用户指定的方法
 * 判断地址栏"?"号后cmd带的是什么参数值,如果不传cmd默认为execute方法
 * @author 陈浩翔
 * 2016-9-10
 */
@SuppressWarnings("serial")
public abstract class BaseServlet extends HttpServlet{
	private Logger log = Logger.getLogger(BaseServlet.class);
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String cmd = req.getParameter("cmd");
		if(cmd==null || cmd.trim().equals("")){
			cmd="execute";
		}
		try {
			Method method = this.getClass().getMethod(cmd, HttpServletRequest.class,HttpServletResponse.class);
			//此处的this对象，就是调用此基类的方法的子类
			method.invoke(this, req,resp);//原对象，可变参数
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
			log.error("请求的方法为:"+cmd+",没有此方法，异常信息为:"+e);
		} catch (SecurityException e) {
			e.printStackTrace();
			log.error("请求的方法为:"+cmd+",不允许所请求的访问权，异常信息为:"+e);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			log.error("请求的方法为:"+cmd+",你可能访问了一个私有的方法，异常信息为:"+e);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			log.error("请求的方法为:"+cmd+",彻底了不合法的参数，异常信息为:"+e);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			log.error("请求的方法为:"+cmd+",目标方法执行失败，异常信息为:"+e);
		}
	}
	/**
	 * 请求Servlet时，url不带cmd参数时请求的页面
	 * @param requset
	 * @param response
	 */
	public abstract void execute(HttpServletRequest requset, HttpServletResponse response);
}
