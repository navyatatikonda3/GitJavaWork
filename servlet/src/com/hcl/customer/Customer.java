package com.hcl.customer;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Customer
 */
@WebServlet("/Customer")  
public class Customer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("Name");
		String address=request.getParameter("Address");
		String state=request.getParameter("State");
		String p=request.getParameter("Phonenumber");
		long pn=Long.parseLong(p);
		String email=request.getParameter("Email");
		String pw=request.getParameter("preferredway");
		String dov=request.getParameter("dov");
		String inc=request.getParameter("incident");
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","navya","nav");
			System.out.println("Connection established");
			
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date ud=sdf.parse(dov);
			java.sql.Date sd=new java.sql.Date(ud.getTime());
			PreparedStatement ps=con.prepareStatement("INSERT INTO customer VALUES(?,?,?,?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, address);
			ps.setString(3, state);
			ps.setLong(4,pn);
			ps.setString(5, email);
			ps.setString(6, pw);
			ps.setDate(7, sd);
			ps.setString(8, inc);
			int result=ps.executeUpdate();
			if(result>0)
			{
				PrintWriter out=response.getWriter();
				out.println("values inserted successfully");
				con.commit();
			}
			
		}catch(ClassNotFoundException ce)
		{
			System.out.println(ce);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException se) {
			// TODO Auto-generated catch block
			se.printStackTrace();
		}
		
	}

}


