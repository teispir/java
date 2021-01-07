package org.example;
 
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/HelloWorld") 
public class HelloWorld extends HttpServlet
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        //response.setContentType("text/html");
        //response.setStatus(HttpServletResponse.SC_OK);
		response.getWriter().println("<head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">");
		response.getWriter().println("<title>Servlet Hello World</title>");
		response.getWriter().println("</head>");
		response.getWriter().println("<html><body>");
        response.getWriter().println("<h1>Servlet Hello World</h1>");
		response.getWriter().println("</body></html>");
    }
}