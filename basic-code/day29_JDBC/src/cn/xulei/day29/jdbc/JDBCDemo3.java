package cn.xulei.day29.jdbc;

import cn.xulei.day29.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * 键盘录入用户名和密码从数据库中判断是否存在
 */
public class JDBCDemo3 {
    public static void main(String[] args) {
        System.out.println("请输入用户名:");
        String username = new Scanner(System.in).nextLine();
        System.out.println("请输入密码:");
        String password = new Scanner(System.in).nextLine();

        boolean flag = new JDBCDemo3().login(username, password);
        if (flag)
        {
            System.out.println("登陆成功");
        }else {
            System.out.println("用户名和密码错误");
        }
    }

    /**
     * 登录方法
     */
    public boolean login(String username,String password)
    {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (username == null || password == null){
            return false;
        }
        try {
            //连接数据库判断
            conn = JDBCUtil.getConn();
            String sql = "select * from user where username = '"+username+"' and password = '"+password+"'";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            return rs.next();//如果有下一行，则返回true
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.resease(conn,ps,rs);
        }
        return false;
    }
}
