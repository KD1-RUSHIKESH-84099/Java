package com.sunbeam.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbutil {
	

	private static final String DB_URL = "jdbc:mysql://localhost:3306/dac_db";
	private static final String USERNAME = "KD1_84099";
	private static final String PASSWORD = "kd1_84099";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(DB_URL , USERNAME , PASSWORD);
	}
}
