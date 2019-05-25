package cn.xulei.datasource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * 测试最大连接数
 * 默认10个
 */
public class C3P0Demo2 {
    public static void main(String[] args) throws SQLException {
     /*   DataSource ds = new ComboPooledDataSource();
        for (int i = 1; i <=11; i++) {
            Connection conn = ds.getConnection();
            System.out.println(i + ":" + conn);

            if (i == 5){
                conn.close();//归还连接
            }*/
        testNameConfig();
        }

    public static void testNameConfig() throws SQLException {
        //1.使用指定名称配置
        DataSource ds = new ComboPooledDataSource("otherc3p0");
        for (int i = 1; i <=10; i++) {
            Connection conn = ds.getConnection();
            System.out.println(i + ":" + conn);
        }
    }
}



