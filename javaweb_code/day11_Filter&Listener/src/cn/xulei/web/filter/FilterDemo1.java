package cn.xulei.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter("/*")//访问所有资源之前，都会执行该过滤器
public class FilterDemo1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }
    /**
     * 每一次请求被拦截资源时，执行
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //对request请求消息增强
        System.out.println("filter执行了...");
        //放行
        filterChain.doFilter(servletRequest,servletResponse);
        //对resopnse消息增强
        System.out.println("filter回来了...");
    }

    @Override
    public void destroy() {

    }
}
