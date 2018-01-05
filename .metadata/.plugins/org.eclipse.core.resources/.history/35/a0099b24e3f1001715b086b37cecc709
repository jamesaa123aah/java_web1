package com.jikexuyuan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransactionTest {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db", "root", "");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
		
	}
	public static void insertUserData() {
		Connection conn = getConnection();
		try {
			String sql = "insert into tbl_user(id,name,password,email)"
					+ "values(10,'tom','yy','1430@bjtu')";
			Statement statement = conn.createStatement();
			int count = statement.executeUpdate(sql);
			System.out.println("向用户表插入了"+count+"条记录");
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void insertAddressData() {
		Connection conn = getConnection();
		try {
			String sql = "insert into tbl_address(id,city,country,userid)"
					+ "values(1,'shanghai','china','10')";
			Statement statement = conn.createStatement();
			int count = statement.executeUpdate(sql);
			System.out.println("向地址表插入了"+count+"条记录");
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		insertUserData();
		insertAddressData();
	}
}
