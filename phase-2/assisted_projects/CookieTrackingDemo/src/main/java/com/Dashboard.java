package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Dashboard
 */
@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dashboard() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s="null";
		
		PrintWriter	out=response.getWriter();
		
		Cookie cookies[]=request.getCookies();
		if(cookies!=null) {
			for (int i =0 ;   i<cookies.length; i++) {
				if(cookies[i].getName().equals("key") && cookies[i].getName()!=null) {
					s=cookies[i].getValue(); //space character is not allowed in cookie string// cant type manish kumar
					out.print("<html><body><h1>hello ");
					out.print(s);
					out.print("</h1></body></html>");
					break;
				}
			
			}
		}
		else {
			out.print("cookies not found! please login");
		}	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
