package cn.xulei.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//浏览器直接请求index.jsp时，该过滤器会被执行
//@WebFilter(value = "/index.jsp", dispatcherTypes = DispatcherType.REQUEST)
//只有转发访问index.jsp时，过滤器执行
//@WebFilter(value = "/index.jsp", dispatcherTypes = DispatcherType.FORWARD)
//浏览器直接请求index.jsp时或者转发访问index.jsp时，过滤器执行
@WebFilter(value = "/index.jsp", dispatcherTypes ={DispatcherType.FORWARD,DispatcherType.REQUEST} )
public class FilterDemo2 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("FilterDemo2");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
