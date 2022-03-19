package com;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
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
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		int id=Integer.parseInt(request.getParameter("id"));
		PrintWriter out= response.getWriter();
		InputStream in  =  getServletContext().getResourceAsStream("WEB-INF/config.properties");
		Properties prop = new Properties();
		prop.load(in);
		
		
		try {
			DBConnection con= new DBConnection(prop.getProperty("url"), prop.getProperty("username"), prop.getProperty("pass"));
			Connection conn=con.getConnection();
			//to get total no. of rows and printing error id value is invalid
			String query = "select count(*) from eproduct";
			Statement stmt = conn.createStatement();
			ResultSet r = stmt.executeQuery(query);
			r.next();
		    int count = r.getInt(1);
		    out.print("Number of records in eproduct is : "+count+"<br>");
		    
		    if(id<=0 || id>count) {
		    	out.print("record doesn't exist, enter valid product id.<br>");
		    	throw new Exception("record doesn't exist, enter valid product id.");
		    }
		    // executing prepared statement
			PreparedStatement st=conn.prepareStatement("select * from eproduct where ID=?");
			st.setInt(1, id);
			ResultSet rs=st.executeQuery();
			rs.next();
			out.print("<h1>Product Details</h1><br>");
			out.print("<table border='1'><tr><th>ID</th><th>fname</th><th>price</th><th>date_added</th></tr>");
			out.print("<tr><th>"+rs.getInt(1)+"</th><th>"+rs.getString(2)+"</th><th>"+rs.getFloat(3)+"</th><th>"+rs.getTime(4)+"</th></tr>");
			out.print("</table");
			
			stmt.close();
			st.close();
			conn.close();
			con.closeConnection();
		}
		catch(Exception e){
			System.out.println("error detected "+ e.getMessage());	
			
		}
		
	}

}
