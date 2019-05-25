package cn.xulei.day29.jdbc;

import cn.xulei.day29.domain.emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JDBCDemo2 {
    public static void main(String[] args) {
        List<emp> list = new JDBCDemo2().findAll();
        Iterator<emp> iterator = list.iterator();
        while(iterator.hasNext())
        {
            emp s = iterator.next();
            System.out.println(s);
        }
    }

    public List<emp> findAll() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<emp> list = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///test", "root", "mysql");
            String sql = "select * from user";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            //遍历结果集，封装数据，装载集合
            emp emp = null;
            list = new ArrayList<>();
            while (rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                String companyname = rs.getString("companyname");
                String address = rs.getString("address");
                String tel = rs.getString("tel");
                String email = rs.getString("email");
                int superuserint = rs.getInt("superuserint");
                emp = new emp(username, password, companyname, address, tel, email, superuserint);

                list.add(emp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
}
