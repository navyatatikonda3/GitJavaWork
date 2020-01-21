package collectionapi;
import java.util.*;
import java.util.regex.Pattern;
public class MainEmploye {

	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();
		Employee e=new Employee();
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter The Number of Employees");
		 n=sc.nextInt();
		 String firstName,lastName,mobileNumber,emailAdd,address;
		 for(int i=0;i<n;i++)
		 {
			 System.out.println("Enter Employee "+(i+1) +" Details:");
			 System.out.println("Enter the Firstname");
			 firstName=sc.next();
			 lastName=sc.next();
			 mobileNumber=sc.next();
			 emailAdd=sc.next();
			
			 address=sc.nextLine();
			 Employee e1=new Employee(firstName,lastName,mobileNumber,emailAdd,address);
			 al.add(e1);
			 
		 }
		 
		 System.out.println("Employee List:");
		 System.out.format("%-15s %-15s %-15s %-30s %-15s\n","Firstname","Lastname","Mobile","Email","Address");
		 for(Employee s:al)
		 {
			 System.out.format("%-15s %-15s %-15s %-30s %-15s\n",s.firstName ,s.lastName ,s.mobileNumber ,s.emailAddress ,s.address  );
		 }
		 
		
	}

}
