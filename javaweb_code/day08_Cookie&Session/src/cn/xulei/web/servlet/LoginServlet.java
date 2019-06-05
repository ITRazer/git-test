package cn.xulei.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        //获取参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String checkcode = request.getParameter("checkcode");
        //获取生成的验证码
        HttpSession session = request.getSession();
        String checkcode_session = (String) session.getAttribute("checkcode_session");
        //删除验证码
        session.removeAttribute("checkcode_session");
        //判断验证码是否正确 忽略大小写
        if (checkcode_session != null && checkcode_session.equalsIgnoreCase(checkcode)){
            //判断用户名和密码是否一致
            if ("xulei".equals(username) && "123".equals(password)){
                //存储用户信息
                session.setAttribute("user",username);
                //重定向success.jsp
                response.sendRedirect(request.getContextPath()+"/success.jsp");
            }else{
                //登陆失败
                request.setAttribute("login_error","用户名或密码错误");
                request.getRequestDispatcher("/login.jsp").forward(request,response);
            }
        }else{
            //验证码不一致
            //存储提示信息
            request.setAttribute("cc_error","验证码错误");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
