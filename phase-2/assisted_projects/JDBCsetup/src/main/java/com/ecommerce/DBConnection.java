package com.ecommerce;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;
public class DBConnection {
		
	private Connection con;
	
	 public DBConnection(String url, String userid, String pass) throws ClassNotFoundException, SQLException {
//	 String url= "jdbc:mysql://localhost:3306/student";
//	 String username ="root";
//	 String pass="password";
//	 String query="select name from student where rollNo=2";
	 
	 Class.forName("com.mysql.cj.jdbc.Driver"); //we dont need to rewrite this everytime we just need to provide values to the constructor then callthe getconnection function below
	 
	 this.con = DriverManager.getConnection(url,userid,pass); 
	 	//since constructor doesnt have return type there to made a new fn below to return the this.con
	 }
	 
	 public Connection getConnection() {   //call this fn to get the instance of the current Connection in your servlet.
		 return this.con;
	 }
	 
     public void closeConnection() throws SQLException {
         if (this.con != null)
                 this.con.close();
 }

}
