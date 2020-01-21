package myjdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UpdateQueryJdbc {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","navya","nav");
			PreparedStatement ps=con.prepareStatement("insert into emp(firstname,lastname,emp_code) values(?,?,?)");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
			
		/*	ps.setString(1,"dubey");
			ps.setString(2, "navya");
			ps.setString(3, "E003");
			
			int i =ps.executeUpdate();
			
		System.out.println(i +"records inserted");
		con.commit();
		con.close(); */
			do{  
				System.out.println("Enter first name:");  
				String firstname=br.readLine();  
				System.out.println("Enter last name:");  
				String name=br.readLine();  
				System.out.println("Enter employee id:");  
				String emp_code=br.readLine();  
				  
				ps.setString(1,firstname);  
				ps.setString(2,name);  
				ps.setString(3,emp_code);  
				int i=ps.executeUpdate();  
				System.out.println(i+" records affected");  
				  
				System.out.println("Do you want to continue: y/n");  
				String s=br.readLine();  
				if(s.startsWith("n")){  
				break;  
				}  
				}while(true);  
				  
				con.close();  
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
