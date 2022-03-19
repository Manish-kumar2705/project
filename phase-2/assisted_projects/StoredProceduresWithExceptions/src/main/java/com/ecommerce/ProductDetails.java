package com.ecommerce;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.*;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductDetails
 */
@WebServlet("/list")
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
			Connection conn=con.getConnection();
			CallableStatement st = conn.prepareCall("{call add_procedure(?, ?)}");
			st.setString(1, "new product");
            st.setBigDecimal(2, new BigDecimal(1900.50));
            st.executeUpdate();
            out.println("Stored procedure has been executed.<Br>");//can check mysql db to see the changes
            st.close();
            out.print("</body></html>");
            con.closeConnection();
		 } catch (ClassNotFoundException e) {
             e.printStackTrace();
     } catch (SQLException e) {
             e.printStackTrace();
     }

            		
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
