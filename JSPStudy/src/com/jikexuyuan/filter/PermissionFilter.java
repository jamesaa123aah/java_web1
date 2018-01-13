package com.jikexuyuan.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PermissionFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public PermissionFilter() {
		// TODO Auto-generated constructor stub
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("---init");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("---dofilter");
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;

//		String servletPath = req.getServletPath();

		HttpSession session = req.getSession();
		String flag = (String) session.getAttribute("flag");
		System.out.println("flag:--"+flag);
		if (session.getAttribute("flag")!=null && session.getAttribute("flag").equals("login_success")) {
			chain.doFilter(request, response);
		}else {
			RequestDispatcher rp = req.getRequestDispatcher("/19/login.jsp");
			rp.forward(req, resp);
		}
		
		
		
//		if (servletPath != null && (servletPath.equals("/19/login.jsp") || servletPath.equals("/19/index.jsp")
//				|| servletPath.equals("/LoginServlet19"))) {
//			chain.doFilter(request, response);
//		} else {
//			if (flag != null && flag.equals("login_success")) {
//				chain.doFilter(request, response);
//			} else if (flag != null && flag.equals("error_login")) {
//				req.setAttribute("msg", "登录失败-重新登录");
//				req.setAttribute("return_url", servletPath);
//				RequestDispatcher rp = req.getRequestDispatcher("/19/login.jsp");
//				rp.forward(req, resp);
//			} else {
//				req.setAttribute("msg", "您尚未登录");
//				req.setAttribute("return_url", servletPath);
//				RequestDispatcher rp = req.getRequestDispatcher("/19/login.jsp");
//				rp.forward(req, resp);
//			}
//		}

	}

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("---destroyed");
	}

}