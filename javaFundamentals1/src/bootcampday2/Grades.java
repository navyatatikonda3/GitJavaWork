package bootcampday2;

import java.util.Scanner;

public class Grades {
	static int scholarId;
	static String name;
	static int marks[]=new int[5];
	
	static double percentage=0.0;
	static char grade;
	static Scanner sc=new Scanner(System.in);
	Grades()
	{
		
	}
   
	public Grades(int scholarId, String name, int[] marks) {
		super();
		this.scholarId = scholarId;
		this.name = name;
		this.marks = marks;
		
	}
	
	
       public void display()
           {
    	   
          
    	   System.out.print("Scholar id," +scholarId +" name " +name);
    	 
           }


	public static void main(String[] args) {
        
        
         System.out.println("Enter Scholar ID:");
          scholarId=sc.nextInt();
          System.out.println("Enter Name:");
          name=sc.next();
          System.out.println("Enter Marks:");
          double sum=0;
          for(int i=0; i<marks.length; i++)
          {
          marks[i] = sc.nextInt();
          
          
          sum = sum + marks[i];
	       }
         
          
          Grades g=new Grades(scholarId, name,marks);
          g.display();
          percentage=(sum/500)*100;
          if(percentage>=90)
          {
        	  
        	 System.out.println(" Grade A");
          }else if(percentage >=80)
          {
        	  
        	  System.out.print(" Grade B");
          }
          else if(percentage>=70)
          {
        	  System.out.print(" Grade C");
          }else if(percentage >=60)
          {
        	  System.out.print(" Grade D");
          }else if(percentage>=40)
          {
        	  System.out.print(" Grade E");
          }
          else 
        	  System.out.print(" Grade F");
          
          
          
         
          
         }

}
