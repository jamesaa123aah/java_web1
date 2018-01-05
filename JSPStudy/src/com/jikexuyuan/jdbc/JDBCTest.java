package com.jikexuyuan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.sun.crypto.provider.RC2Parameters;

public class JDBCTest {
	public static void main(String[] args) {
		String sql = "select * from tbl_user";
		Connection conn = null;
		Statement st = null;
		ResultSet resultSet = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db", "root", "");
			st = conn.createStatement();
			resultSet = st.executeQuery(sql);
			while (resultSet.next()) {
				System.out.print(resultSet.getInt("id") + " ");
				System.out.print(resultSet.getString("name") + " ");
				System.out.print(resultSet.getString("password") + " ");
				System.out.print(resultSet.getString("email") + " ");
				System.out.println();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {

			try {
				resultSet.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				st.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}
	}
}