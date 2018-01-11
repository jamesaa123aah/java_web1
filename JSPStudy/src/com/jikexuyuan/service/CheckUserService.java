package com.jikexuyuan.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jikexuyuan.dao.UserDao;
import com.jikexuyuan.dao.impl.UserDaoImpl;
import com.jikexuyuan.entity.User;
import com.jikexuyuan.util.ConnectionFacory;

public class CheckUserService {
	
	private UserDao userDao= new UserDaoImpl();
	
	public boolean check(User user) {
		Connection connection = null;
		try {
			
			
			connection = ConnectionFacory.getInstance().makeConnection();
			connection.setAutoCommit(false);
			
			ResultSet resultSet = userDao.get(connection, user);
			
			while (resultSet.next()) {
				return true;
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
			
			
		}finally {
			
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return false;
	}
}
