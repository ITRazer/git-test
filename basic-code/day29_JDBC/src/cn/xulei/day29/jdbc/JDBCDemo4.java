package cn.xulei.day29.jdbc;

import cn.xulei.day29.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCDemo4 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps1 = null,ps2 = null;
        try {
            //1.获取连接
             conn = JDBCUtil.getConn();
             //2.开启事务
             conn.setAutoCommit(false);
             //张三  -  500
             String sql1 = "update account set money = money - ? where id = ?";
            //李四  +  500
            String sql2 = "update account set money = money - ? where id = ?";
            ps1 = conn.prepareStatement(sql1);
            ps2 = conn.prepareStatement(sql2);

            //设置参数
            ps1.setDouble(1,500);
            ps1.setInt(2,1);

            ps2.setDouble(1,-500);
            ps2.setInt(2,2);

            ps1.executeUpdate();
            int i = 3/0;
            ps2.executeUpdate();

            conn.commit();
        }catch (SQLException e){
            try {
                if (conn != null)
                {
                    conn.rollback();
                }

            } catch (Exception e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            JDBCUtil.resease(conn,ps1,null);
            JDBCUtil.resease2(conn,ps2);
        }
    }
}
