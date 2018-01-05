package com.jikexuyuan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCTest2 {

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
	
	public static void insert() {
		Connection conn = getConnection();
		try {
			String sql = "insert into tbl_user(id,name,password,email)"
					+ "values(3,'yy','yy','@bjtu')";
			Statement statement = conn.createStatement();
			int count = statement.executeUpdate(sql);
			System.out.println("插入了"+count+"条记录");
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void update() {
		Connection conn = getConnection();
		try {
			String sql = "update tbl_user set email = 'gavinaa123aah@163.com' where id =3";
			Statement statement = conn.createStatement();
			int count = statement.executeUpdate(sql);
			System.out.println("更新了"+count+"条记录");
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void delete() {
		Connection conn = getConnection();
		try {
			String sql = "delete from tbl_user where id =3";
			Statement statement = conn.createStatement();
			int count = statement.executeUpdate(sql);
			System.out.println("删除了"+count+"条记录");
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//insert();
		//update();
		delete();
	}

}