package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private Connection connection;
	public DBConnection(String url, String username, String pass) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		this.connection = DriverManager.getConnection(url,username,pass);
	}
	 public Connection getConnection(){
		 return this.connection;
		 
	 }
	 public void closeConnection() throws SQLException
	 {
		 if(this.connection!=null)
		this.connection.close();
	 }
}
