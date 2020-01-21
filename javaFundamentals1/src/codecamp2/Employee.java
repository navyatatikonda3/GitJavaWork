package codecamp2;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Employee {


		public static void main(String[] args) {
			 DecimalFormat df=new DecimalFormat("#.00");
		     int basicSalary=0;
		     double grossSalary=0.0, HRA=0.0,DA=0.0;
		     Scanner sc=new Scanner(System.in);
		     System.out.println("Enter the name of the Employee:");
		   	 String s=sc.next();
		   	 System.out.println("Enter the basicsalary of the employee:");
		     basicSalary= sc.nextInt();
		     System.out.println("Basic Salary:" +basicSalary);
		     System.out.print("Gross Salary:");
		       
		        if(basicSalary<1500)
		        {
		            HRA=(0.10f*basicSalary);
		            DA=(0.9f*basicSalary);
		            grossSalary=(basicSalary+HRA+DA);
		            System.out.println(df.format(grossSalary));
		          
		        }
		        else//(basicsalary>=1500)
		        	
		        {
		            HRA=500;
		            DA=0.98f*basicSalary;
		            grossSalary=basicSalary+HRA+DA;
		            System.out.println(df.format(grossSalary));
		           
		        }
		  	}
		}


