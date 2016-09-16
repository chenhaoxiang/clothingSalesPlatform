package cn.hncu.user.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.parser.JSONToken;

import cn.hncu.utils.BaseServlet;

/**
 * 用户注册的Servlet
 * @author 陈浩翔
 *
 * 2016-9-14
 */

public class RegisterServlet extends BaseServlet {
	private Logger log = Logger.getLogger(getClass());

	@Override
	public void execute(HttpServletRequest requset, HttpServletResponse response) {
		response.setContentType("text/html");
		
		String name = requset.getParameter("name");
		String password = requset.getParameter("password");
		String email = requset.getParameter("email");
		PrintWriter out=null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			//str=str+"code=3";
			e.printStackTrace();
		}
		if(name==null||name.trim().equals("")
			||password==null||password.trim().equals("")
			||email==null||email.trim().equals("")
			){
		}
		out.print("1");
		log.error(name+","+password+","+email);
	}

}
