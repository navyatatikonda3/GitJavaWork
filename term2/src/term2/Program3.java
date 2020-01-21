package term2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Program3")
public class Program3 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("uname");
		long aadharId=Long.parseLong(request.getParameter("aid"));
		String city=request.getParameter("city");
		String state=request.getParameter("state");
		int pincode=Integer.parseInt(request.getParameter("pincode"));
		int noOfDependents=Integer.parseInt(request.getParameter("noofdep"));
		String occupation=request.getParameter("occupation");
		String s4=request.getParameter("salary");
		double salary=Double.parseDouble(s4);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cname=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
			PreparedStatement ps=cname.prepareStatement("insert into program values(?,?,?,?,?,?,?,?)");

			ps.setString(1,userName );
			ps.setLong(2,aadharId );
			ps.setString(3, city);
			ps.setString(4, state);
			ps.setInt(5, pincode);
			ps.setInt(6,noOfDependents );
			ps.setString(7, occupation);
			ps.setDouble(8, salary);
			int result=ps.executeUpdate();
			if(result>0)
			{
				cname.commit();
				PrintWriter out=response.getWriter();
				out.println("registration done "+userName);

			}

		}
		catch(ClassNotFoundException c)
		{
			System.out.println(c);
		}
		catch(SQLException s)
		{
			System.out.println(s);
		}


	}



}


