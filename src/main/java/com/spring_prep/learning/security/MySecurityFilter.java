package com.spring_prep.learning.security;

import jakarta.servlet.*;

import java.io.IOException;
//
public class MySecurityFilter implements Filter {
//public class MySecurityFilter{
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("before");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("after");
    }
}
