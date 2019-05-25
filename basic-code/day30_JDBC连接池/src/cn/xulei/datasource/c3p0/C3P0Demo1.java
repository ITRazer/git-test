package cn.xulei.datasource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3P0Demo1 {
    public static void main(String[] args) throws SQLException {
        //1.导入jar包
        //2.定义配置文件
        //3.创建数据库连接池对象 使用默认配置
        DataSource ds = new ComboPooledDataSource();

        //4.获取连接对象
        Connection conn = ds.getConnection();
        System.out.println(conn);
    }
}
