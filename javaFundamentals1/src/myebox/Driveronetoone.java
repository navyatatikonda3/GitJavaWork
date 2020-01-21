package myebox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Driveronetoone {
	
	public static void main(String[] args) throws IOException {
		
		User u= new User();
		String userDetail=new String();
		String contactDetail=new String();
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
	    System.out.println("Enter the User detail");
	    userDetail=br.readLine();
	     String userDetailArray[] =userDetail.split(",");
	     
	     u.setName(userDetailArray[0]);
	     u.setUsername(userDetailArray[1]);
	     u.setPassword(userDetailArray[2]);
	     
	    
	    
	    
		System.out.println("Enter the contact details");
		contactDetail = br.readLine();
		String contactDetailArray[]=contactDetail.split(",");
		
		ContactDetail cd = new ContactDetail();
		cd.setMobile(contactDetailArray[0]);
		cd.setAlternateMobile(contactDetailArray[1]);
		cd.setLandLine(contactDetailArray[2]);
		cd.setEmail(contactDetailArray[3]);
		cd.setAddress(contactDetailArray[4]);
		
		u.setContactDetail(cd);
		
		System.out.println(u);
		
	}

}
