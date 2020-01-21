package myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Logindemo {

	public static void main(String[] args) throws ClassNotFoundException ,SQLException{
		LoginFrame lf=new LoginFrame();
		//search for the appropriate driver for database
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//create connection
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","navya","nav");
		Statement s =con.createStatement();
		
		//create result set object to get input from database 
		ResultSet rs=s.executeQuery("select * from product");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" " +rs.getString(2)+" " +rs.getFloat(3)+" " +rs.getInt(4));
		}
		
	}
   
}
