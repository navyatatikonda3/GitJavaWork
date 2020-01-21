package myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleGettingData {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","navya","nav");
			
			System.out.println("success");
			
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from emp");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			}
			con.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
