

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        PrintWriter out = response.getWriter();
        String s= request.getParameter("userid");
        out.println("<html><body>");
        out.print("<form action='Dashboard' name='form'method='Post' >"); //single collons here
        out.print("<input type='hidden' name='userid2' value="+s+">");
        out.println("<button type='submit' value='submit' >pass the hidden form to next servlet</button>");
        out.println("</form>");
        out.println("</body></html>");
        
        //THIS below script will automatically submit the current form. form[0] means submit 1st form out of many if exist.
        //u dont even need to submit this form manually
        out.println("<script>document.forms[0].submit();</script>"); //js

        		

	}

}
