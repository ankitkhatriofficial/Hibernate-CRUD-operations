package com.Spring.Hibernate.Spring.HibernateDemo.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	private static String url = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
	private static String username = "hbstudent";
	private static String password = "hbstudent";
	
	public static void main(String[] args) {
		
		try {
			Connection connection = DriverManager.getConnection(url,username,password);
			System.out.println("Connection is Successful!");
		}
		catch(Exception e) {
			System.out.println("Exception : "+e);
		}
		
	}
	
}
