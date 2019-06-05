package cn.xulei.web.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * Servlet方法
 */
public class ServletDemo2 implements Servlet{
    /**
     * 初始化方法
     * 在servlet被创建时执行，只执行一次
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init...");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 服务停供方法
     * 当一次Servlet被访问时执行 执行多次
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service...");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 服务器关闭时执行，执行一次
     */
    @Override
    public void destroy() {
        System.out.println("destory");
    }
}
