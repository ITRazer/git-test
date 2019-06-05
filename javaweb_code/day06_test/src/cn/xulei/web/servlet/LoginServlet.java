package cn.xulei.web.servlet;

import cn.xulei.dao.UserDao;
import cn.xulei.domain.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

       /* String username = req.getParameter("username");
        String password = req.getParameter("password");

        //封装user对象
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);*/

       //获取所有请求参数
        Map<String, String[]> map = req.getParameterMap();
        User user = new User();
        //使用BeanUtil封装
        try {
            BeanUtils.populate(user,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        UserDao dao = new UserDao();
        User login = dao.login(user);
        if (login == null)
        {
            req.getRequestDispatcher("/failServlet").forward(req,resp);
        }else
        {
            //存储数据
            req.setAttribute("user",user);
            req.getRequestDispatcher("/successServlet").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
