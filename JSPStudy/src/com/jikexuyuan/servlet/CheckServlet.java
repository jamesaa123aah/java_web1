package com.jikexuyuan.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jikexuyuan.entity.User;
import com.jikexuyuan.service.CheckUserService;

public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CheckServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String  username = request.getParameter("username");
		String password = request.getParameter("password");
		
		RequestDispatcher requestDispatcher = null;
		String forward = null;
		
		if (username == null || password == null) {
			
			request.setAttribute("msg", "用户名或密码为空");
			requestDispatcher = request.getRequestDispatcher("/17/error.jsp");
			requestDispatcher.forward(request, response);
		}else {
			User user = new User();
			user.setName(username);
			user.setPassword(password);
			CheckUserService checkUserService = new CheckUserService();
			boolean bool = checkUserService.check(user);
			
			if (bool) {
				forward = "/18/success.jsp";
			}else {
				request.setAttribute("msg", "用户名或密码输入错误");
				forward = "/18/error.jsp";
			}
			
			requestDispatcher = request.getRequestDispatcher(forward);
			requestDispatcher.forward(request, response);
		}
	}

}