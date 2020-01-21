package student;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of students ");
		int num=sc.nextInt();
		
		int rollNo[]=new int[5];
		String name[]=new String[5];
		int age[] = new int[5];
		
		Student s[];
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter student " +(i+1) +"details");
			rollNo[i]=sc.nextInt();
			name[i] = sc.next();
			age[i] = sc.nextInt();
			s[i]=new Student(rollNo,name,age);
			
		}
		
		
}

}
