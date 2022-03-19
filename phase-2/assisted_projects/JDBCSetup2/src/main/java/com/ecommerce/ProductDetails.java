package com.ecommerce;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ProductDetails
 */
@WebServlet("/ProductDetails")
public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		InputStream in = getServletContext().getResourceAsStream("WEB-INF/config.properties");
		Properties prop = new Properties();
		prop.load(in);
		try {
			DBConnection con= new DBConnection(prop.getProperty("url"),prop.getProperty("username"), prop.getProperty("pass"));
			Connection conn=con.getConnection(); //calling dbconnection fn here 
			Statement st =conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);//scroll adn updatable will allow to scroll and if db is updated it will be reflected in the rs;
			
			 st.executeUpdate("insert into eproduct(fname,price,date_added) values('new product',17800.00,now())");
			//we dont to store it so no result rs object, and also this statement returns int
			 ResultSet rs = st.executeQuery("select * from eproduct");
			 
			 while(rs.next()) {
				 out.print(rs.getInt("ID") +":" +rs.getString("fname")+"<br>");
				
				 }
			 out.print("</html></body>");
			 st.close();
			 con.closeConnection();
			
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
