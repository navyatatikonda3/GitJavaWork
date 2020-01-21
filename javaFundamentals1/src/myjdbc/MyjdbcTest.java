package myjdbc;
import java.sql.*;
public class MyjdbcTest {

	public static void main(String[] args)  {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","navya","nav");
			System.out.println("success");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		catch(SQLException e)
		{
			
		}
		
	}

}
