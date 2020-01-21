package com.hcl.demopackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GreetingServlet
 */
@WebServlet(
description = "Greets the visitor", 
urlPatterns = { "/greeting" }, 
initParams = { 
@WebInitParam(name = "greeting", value = "Good Morning", description = "Morning greeting")
})
public class GreetingServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException

{
java.util.Date currDate=new java.util.Date();
java.io.PrintWriter out=response.getWriter();
response.setContentType("text/html");
out.println("<body>Hello "+currDate+"</body></html>");
response.getWriter().append("Served at: ").append(request.getContextPath());
}
    
}

