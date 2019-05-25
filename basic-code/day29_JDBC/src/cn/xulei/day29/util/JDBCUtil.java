package cn.xulei.day29.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class JDBCUtil {
	static String driverClass = null;
	static String url = null;
	static String name = null;
	static String password =null;
	
	static {
		try {
		Properties properties = new Properties();
		
		//使用类加载器 去读取src下的资源文件
		InputStream is = JDBCUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
		
		properties.load(is);

		driverClass = properties.getProperty("driverClass");
		url = properties.getProperty("url");
		name= properties.getProperty("name");
		password = properties.getProperty("password");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConn() {
		Connection conn = null;
		try {
			
			Class.forName(driverClass);

			conn = DriverManager.getConnection(url,name,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	

	public static void resease(Connection conn,Statement st,ResultSet rs)
	{
		closeConn(conn);
		closeRs(rs);
		closeSt(st);
	}
	public static void resease2(Connection conn,Statement st)
	{
		closeConn(conn);
		closeSt(st);
	}
	private static void closeRs(ResultSet rs)
	{
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			rs = null;
		}
	}
	private static void closeSt(Statement st)
	{
		try {
			if (st != null) {
				st.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			st = null;
		}
	}
	private static void closeConn(Connection conn)
	{
		try {
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			conn = null;
		}
	}
}
