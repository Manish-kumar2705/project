package com;

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
			DBConnection con= new DBConnection(prop.getProperty("url"),prop.getProperty("username"),prop.getProperty("pass"));
			Connection conn =	con.getConnection();
			Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			st.executeUpdate("insert into eproduct (fname, price, date_added) values ('New Product', 17800.00, now())");
			out.print("executed an insertion operation<br>");
			st.executeUpdate("update eproduct set price=2000 where fname = 'New Product'");
			out.print("executing an update operation<br>");
			st.executeUpdate("delete from eproduct where fname = 'New Product'");
			out.print("executed a delete opertion");
            out.println("</body></html>");
			st.close();
			con.closeConnection();
			conn.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
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
