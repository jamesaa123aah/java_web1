package com.jikexuyuan.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("=====init without parameter====");
		super.init();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("=====init with parameter====");
		super.init(config);
	}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("=====service====");
		PrintWriter printWriter = response.getWriter();
		printWriter.println("hello world!");
		printWriter.close();
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("=====destroy====");
		super.destroy();
	}



}
