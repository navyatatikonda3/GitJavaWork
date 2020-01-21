package com.hcl.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class StudentUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String studId=request.getParameter("sid");
		int stId=Integer.parseInt(studId);
		String studName=request.getParameter("sname");
		String studMarks=request.getParameter("smarks");
		int stMarks=Integer.parseInt(studMarks);
		PrintWriter out=response.getWriter();
		try {
		String studDob=request.getParameter("sdob");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date ud=sdf.parse(studDob);
		java.sql.Date ds=new java.sql.Date(ud.getTime());
		
		
		String studAddress=request.getParameter("saddress");
		String studMobileno=request.getParameter("smobileno");
		long stMobile=Long.parseLong(studMobileno);
		String studEmail=request.getParameter("semailid");
		String password=request.getParameter("pwd");
		
		
	   			Class.forName("oracle.jdbc.driver.OracleDriver");
	   			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
	   			PreparedStatement ps=con.prepareStatement("update student set stu_marks=? where stu_id=?");
	   			
	   			
	   			ps.setInt(1, stMarks);
	   			ps.setInt(2, stId);
	   			int res=ps.executeUpdate();
	   			if(res>0)
	   			{
	   				con.commit();
	   				out.println("Updated Successfully.");
	   			}
	   		}
	   		catch (ClassNotFoundException c) {
				System.out.println(c);
			}
	   		catch (SQLException s) {
				System.out.println(s);
			}
	   		catch(ParseException p)
			{
				System.out.println(p);
			}
	}

}

