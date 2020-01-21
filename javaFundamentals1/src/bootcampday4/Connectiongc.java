package bootcampday4;

import java.io.IOException;
import java.util.Scanner;

class Connection {
        String databseURL;
        String userName;
        String password;
		public String getDatabseURL() {
			return databseURL;
		}
		public void setDatabseURL(String databseURL) {
			this.databseURL = databseURL;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
        
 
}

public class Connectiongc
{
	public static void main(String args[])throws IOException
	{
		boolean flag=true;
		char reply= 'y';
		int conncetionCounter = 0;
		Connection  con= new Connection();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username:");
		con.setUserName(sc.nextLine());
		System.out.println("enter password:");
		
		while(flag)
		{
			
			conncetionCounter ++;
			
		}
		
		
		
	}
}
