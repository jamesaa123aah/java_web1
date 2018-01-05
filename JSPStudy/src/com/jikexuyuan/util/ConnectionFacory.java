package com.jikexuyuan.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;



public class ConnectionFacory {

	private static String driver;
	private static String dburl;
	private static String user;
	private static String password;
	
	private static final ConnectionFacory facory = new ConnectionFacory();
	private Connection conn;
	
	static{
		Properties properties = new Properties();
		InputStream inputStream = ConnectionFacory.class.
				getClassLoader().getResourceAsStream("dbconfig.properties");
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("配置文件读取错误");
			e.printStackTrace();
		}
		driver = properties.getProperty("driver");
		dburl = properties.getProperty("dburl");
		user = properties.getProperty("user");
		password = properties.getProperty("password");

	}
	
	private ConnectionFacory(){
		
		
	}
	
	public static ConnectionFacory getInstance() {
		
		return facory;
		
	}
	
	public Connection makeConnection() {
		try {
			
			Class.forName(driver);
			
			conn = DriverManager.getConnection(dburl,user,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return conn;
		
	}
}