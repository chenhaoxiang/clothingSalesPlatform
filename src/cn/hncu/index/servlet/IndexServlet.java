package cn.hncu.index.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.support.WebApplicationContextUtils;

import cn.hncu.domain.clothing.Clothing;
import cn.hncu.domain.clothing.Types;
import cn.hncu.domain.users.Users;
import cn.hncu.index.service.IIndexService;
import cn.hncu.index.service.IndexServiceImpl;
import cn.hncu.utils.BaseServlet;

@Controller
public class IndexServlet extends BaseServlet {
	private IIndexService service = new IndexServiceImpl() ;
	public IIndexService getService() {
		return service;
	}
	public void setService(IIndexService service) {
		this.service = service;
	}
	
	@Override
	public void init() throws ServletException {
		//获取Web中的spring容器
		ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
		this.service = ctx.getBean(IIndexService.class);
	}
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("请求IndexServlet...");
		Users user = (Users) request.getSession().getAttribute("user");
		if(user!=null){
			List<Clothing> usersClothing = service.findUsersClothing(user);
			request.getSession().setAttribute("usersClothing", usersClothing);
		}
		//查询所有的服装类型
		List<Types> types = service.findAllTypes();
//		for(Types t :types){
//			System.out.println(t);
//		}
		List<Types> types1 = new ArrayList<Types>();
		List<Types> types2 = new ArrayList<Types>();
		List<Types> types3 = new ArrayList<Types>();
		for(Types t:types){
			System.out.println(t);
			if(t.getGrade().equals("1")){
				types1.add(t);
			}else if(t.getGrade().equals("2")){
				types2.add(t);
			}else if(t.getGrade().equals("3")){
				types3.add(t);
			}
		}
		request.getSession().setAttribute("types1", types1);
		request.getSession().setAttribute("types2", types2);
		request.getSession().setAttribute("types3", types3);
		
		//大众化推荐
		List<Clothing> massesClothing =  service.findMassesRecommendClothing();
		request.getSession().setAttribute("massesClothing", massesClothing);

		//管理员推荐
		List<Clothing> adminClothing =  service.findAdminRecommendClothing();
		request.getSession().setAttribute("adminClothing", adminClothing);
		
		//转发
		try {
			String index = getInitParameter("index");
			request.getRequestDispatcher(index).forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
