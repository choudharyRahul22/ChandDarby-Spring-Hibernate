package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
	
	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/spring?useSSL=false";
		String user = "admin";
		String password = "admin";
		
		
		try {
			System.out.println("Connecting to DB" + jdbcUrl);
			
			Connection connection = DriverManager.getConnection(jdbcUrl,user,password);
			
			System.out.println("Connection successful! : **** " + connection);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
