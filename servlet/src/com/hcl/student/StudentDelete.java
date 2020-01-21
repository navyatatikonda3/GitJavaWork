package com.hcl.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class StudentDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String studId=request.getParameter("sid");
		int stId=Integer.parseInt(studId);
		PrintWriter out=response.getWriter();
		try {
		
		
	   			Class.forName("oracle.jdbc.driver.OracleDriver");
	   			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
	   			PreparedStatement ps=con.prepareStatement("delete from student where stu_id=?");
	   			
	   			

	   			ps.setInt(1, stId);
	   			int res=ps.executeUpdate();
	   			if(res>0)
	   			{
	   				con.commit();
	   				out.println("Deleted Successfully.");
	   			}
	   			else
	   			{
	   				response.sendRedirect("StudentDelete.html");
	   			}
	   		}
	   		catch (ClassNotFoundException c) {
				System.out.println(c);
			}
	   		catch (SQLException s) {
				System.out.println(s);
			}
	   		
	}

}
