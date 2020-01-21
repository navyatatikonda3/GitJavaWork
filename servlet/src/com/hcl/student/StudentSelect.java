package com.hcl.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class StudentSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String studId=request.getParameter("sid");
		int stId=Integer.parseInt(studId);
		
		PrintWriter out=response.getWriter();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
   			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","navya","nav");
   			PreparedStatement ps=con.prepareStatement("select * from student where stu_id=?");
   			ps.setInt(1, stId);
   			ResultSet rs=ps.executeQuery();
   			if(rs.next())
   			{
   			
   				con.commit();
   				out.print(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getDate(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7));
   			}
   			else
   			{
   				response.sendRedirect("StudentSelect.html");
   			}
   		}
   		catch (ClassNotFoundException c) {
			System.out.println(c);
		}
   		catch (SQLException s) {
			System.out.println(s);
		}
		
		catch(NumberFormatException n)
		{
			System.out.println(n);
		}
		
	}
}

