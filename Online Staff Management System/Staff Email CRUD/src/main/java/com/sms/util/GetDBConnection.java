package com.sms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetDBConnection {

	private static String url = "jdbc:mysql://localhost:3306/login";
	private static String username = "root";
	private static String password = "mathushan@1";
	private static Connection con;
	
	public static Connection getConnection() {
		
		try {
			con = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Database connection is not success!!!");
		}
		return con;
	}
	
}