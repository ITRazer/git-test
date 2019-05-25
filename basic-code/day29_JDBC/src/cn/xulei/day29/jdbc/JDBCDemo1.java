package cn.xulei.day29.jdbc;

import java.sql.*;

public class JDBCDemo1 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //建立连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost/bank", "root", "mysql");
            String sql = "select * from account";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next())
            {
                String name = rs.getString(2);
                double money = rs.getDouble(3);
                System.out.println(name +"----" + money);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (rs != null){
                try{
                    rs.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (ps != null){
                try {
                    ps.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (conn != null)
            {
                try{
                    conn.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
