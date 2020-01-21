package com.hcl.demopackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/servlet/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 res.setContentType("text/html");           
         String usname=req.getParameter("t1"); 
         String pass=req.getParameter("t2"); 
         PrintWriter pw=res.getWriter(); 
         pw.println("USERNAME IS : "+usname); 
         pw. println (" PASSWORD IS : "+pass) ; 
         pw.close(); 
		res.getWriter().append("Served at: ").append(req.getContextPath());
	}

}
