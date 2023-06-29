package com.example.day84thymeleafdemo._03_scope;

import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
@WebFilter(filterName = "FirstFilter", urlPatterns = "/*")
public class SecondFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("FirstFilter catch the request for " + ((HttpServletRequest)request).getServletPath());
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}


}