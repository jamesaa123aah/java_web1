package com.jikexuyuan.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

//	@Override
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//	
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
//		
//		System.out.println("用户名："+username);
//		System.out.println("密码："+password);
//		
//		
//	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("====进入Doget====");
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("====进入Dopost====");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		System.out.println("用户名："+username);
		System.out.println("密码："+password);
		
		String forward = null;
		
		if (username.equals("123") && password.equals("123")) {
			//请求转发
			forward = "/17/success.jsp";
			RequestDispatcher requestDispatcher = req.getRequestDispatcher(forward);
			requestDispatcher.forward(req, resp);
			
			//请求重定向
//			resp.sendRedirect(req.getContextPath()+"/17/success.jsp");
		}else {
			//请求转发
			forward = "/17/success.jsp";
			RequestDispatcher requestDispatcher = req.getRequestDispatcher(forward);
			requestDispatcher.forward(req, resp);
			
			//请求重定向
			//resp.sendRedirect(req.getContextPath()+"/17/error.jsp");
		}
	}
	
	
}
