package com.hcl.customer;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustomerBean
 */
public class CustomerBean extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("Name");
		String address=request.getParameter("Address");
		String state=request.getParameter("State");
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			System.out.println("Connection established");
			PreparedStatement ps=con.prepareStatement("UPDATE customer SET C_NAME=?,C_ADDRESS=? WHERE C_STATE=?");
			ps.setString(1,name);
			ps.setString(2,address);
			ps.setString(3,state);
			
			int result=ps.executeUpdate();
			Customervo obj=new Customervo();
			if(result>0)
			{
				PrintWriter out=response.getWriter();
				
				con.commit();
				//obj.setCname(result.getString(1));
				//obj.setCaddress(result.getString(2));
				//obj.setCstate(result.getString(3));
				//obj.setCpn(result.getLong(4));
				//obj.setCemail(result.getString(5));
				//obj.setCpw(result.getString(6));
				//obj.setCdov(result.getDate(7));
				//obj.setCinc(result.getString(8));
				request.setAttribute("Ckey",state);
				RequestDispatcher rd=request.getRequestDispatcher("Customer.jsp");
				rd.forward(request, response);
				
				out.println("selected successfully");
				}
			else
			{
				response.sendRedirect("CusBeanUp.html");
			}
		
		}catch(ClassNotFoundException ce)
		{
			System.out.println(ce);
		} 
		catch(SQLException se) {
			// TODO Auto-generated catch block
			se.printStackTrace();
		}
		
		
	}
}

