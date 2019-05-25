package cn.xulei.datasource.druid;

import cn.xulei.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DruidDemo2 {
    public static void main(String[] args) {
        /**
         * 完成添加操作 给account添加纪录
         */
        Connection conn = null;
        PreparedStatement pstemt = null;
        try {
            conn = JDBCUtils.getConn();
            String sql = "insert into account values(null,?,?)";
            pstemt = conn.prepareStatement(sql);
            //赋值
            pstemt.setString(1,"liuye");
            pstemt.setDouble(2,3000);
            int count = pstemt.executeUpdate();
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstemt,conn);
        }

    }
}
