package cn.xulei.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/responseDemo1")
public class ResponseDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //访问/responseDemo1,会自动跳转到responseDemo1
        System.out.println("demo1...");
        //1.设置状态码
        //response.setStatus(302);
        //2.设置响应头location
        //response.setHeader("location","/day07/responseDemo2");

        //重定向
        response.sendRedirect("/day07/responseDemo2");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
