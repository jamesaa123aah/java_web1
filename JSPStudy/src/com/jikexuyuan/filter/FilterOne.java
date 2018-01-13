package com.jikexuyuan.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


public class FilterOne implements Filter {

    /**
     * Default constructor. 
     */
    public FilterOne() {
        System.out.println("===构造函数===");
    }
    
	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		
		System.out.println("===初始化函数===");
		String string = fConfig.getInitParameter("param");
		System.out.println("param="+string);
	}



	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("===开始执行 do_filter===");
		chain.doFilter(request, response);
		System.out.println("===结束do_filter===");
	}

	
	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {

		// TODO Auto-generated method stub
		System.out.println("===销毁函数===");
	}
}
