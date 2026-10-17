package com.banking.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	private static String url = "jdbc:mysql://localhost:3306/database";
	private static String user = "root";
	private static String password = System.getenv("DB_PASSWORD");
	private static Connection con;
	
	public static Connection getConnection() {
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        con = DriverManager.getConnection(url, user, password);
	        return con;
	    } catch(Exception e) {
	        System.out.println("Database connection failed!");
	        e.printStackTrace();
	    }
	    return null;
	}

}
