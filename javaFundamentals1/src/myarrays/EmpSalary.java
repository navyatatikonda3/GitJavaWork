package myarrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmpSalary {
	static String emp_name[]= {"Navya","Navy","Nav"};
	static float emp_sal[]= {55555.00f,5555.00f,555.00f};
	static int emp_age[];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		emp_age=new int[3];
		 
		 
		 //to accept data into age array we need to create input stream reader object
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 
		 for(int i=0;i<emp_age.length;i++)
		 {
			 System.out.println("Enter age of " +emp_name[i]);
			 emp_age[i] =Integer.parseInt(br.readLine());
		 }
		 display();                                                                                 
		 
	}
	 public static void display()
	 {
		 System.out.println("Employee Names");
		for(String ename:emp_name) 
		{
			System.out.println(ename);
		}
		System.out.println("Employee Salaries:");
		for(float esalary:emp_sal)
		{
			System.out.println(esalary);
		}
		System.out.println("Employee ages");
		for(int age:emp_age)
		{
			System.out.println(age);
		}
	 }
		 
		 
}
