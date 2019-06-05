package cn.xulei.web.servlet;

import cn.xulei.domain.User;
import cn.xulei.service.UserService;
import cn.xulei.service.impl.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        //1.获取数据
        //1.1获取验证码
        String verifycode = request.getParameter("verifycode");
        Map<String, String[]> map = request.getParameterMap();
        //2.校验验证码
        HttpSession session = request.getSession();
        String checkcode_server = (String) session.getAttribute("CHECKCODE_SERVER");
        session.removeAttribute("checkcode_server");
        if (!checkcode_server.equalsIgnoreCase(verifycode))
        {
            //验证码不正确
            request.setAttribute("login_msg","验证码不正确");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
            return;
        }
        //3.封装数据
        User user = new User();
        try {
            BeanUtils.populate(user,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        //4.调用Service查询
        UserService service = new UserServiceImpl();
        User loginUser = service.login(user);
        System.out.println(loginUser);
        if (loginUser != null){
            //登录成功
            //将用户存入session

            session.setAttribute("user",loginUser);
            //没有共享数据用重定向
            response.sendRedirect(request.getContextPath()+"/index.jsp");
        }else{
            request.setAttribute("login_msg","用户名或密码错误");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
