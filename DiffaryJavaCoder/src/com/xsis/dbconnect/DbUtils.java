package com.xsis.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbUtils {
	private static Connection conn = null;
	private static final String USERNAME = "hr";
	private static final String PASSWORD = "hr";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";

	public static Connection getConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Connection Failed~!");
		}
		return conn;
	}

	public static PreparedStatement getPreparedStatement(String sql, Connection connect) {
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connect.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return preparedStatement;
	}
}