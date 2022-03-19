package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Interface
 */
@WebServlet("/Interface")
public class Interface  implements  Servlet { //servlet is the main parent interface which consist of generic and httpservlet classes and more.
	ServletConfig config=null;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("in the destroy method");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		
		return "copyright 2022";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config=config;
		System.out.println("service is initialised"); // output of sysout is in console
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<html><body>");
       
  
		out.print("in service method");
        out.print("</body>");
        out.print("</html>");
    

		
	}
		
}
