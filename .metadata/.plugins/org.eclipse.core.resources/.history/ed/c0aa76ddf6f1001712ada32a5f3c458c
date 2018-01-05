package com.jikexuyuan.test;

import java.sql.Connection;

import com.jikexuyuan.util.ConnectionFacory;

public class ConnectionFactoryTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		ConnectionFacory connectionFacory = ConnectionFacory.getInstance();
		Connection connection = connectionFacory.makeConnection();
		System.out.println(connection.getAutoCommit());
	}

}
