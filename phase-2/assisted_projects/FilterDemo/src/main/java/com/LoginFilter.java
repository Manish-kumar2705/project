package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter(filterName ="/LoginFilter" , urlPatterns = {"/dashboard","/profile"})
public class LoginFilter extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public LoginFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
			PrintWriter out = response.getWriter();
			out.println();
			out.print("filtering code execution");
			out.println();
			//String s = request.getParameter("userId");
			if(request.getParameter("userId").equals("manish kumar") && request.getParameter("userId")!=null) {
				out.print("before filtering");
				out.println();
				chain.doFilter(request, response); //this is take us to the server if no further filter exist,
				// then after servlet processing it will come back here
				out.println();
				out.print("after filtering");
				out.println();
				
			}
	
			
			
				
				
				
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
