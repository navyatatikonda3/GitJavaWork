package lmsActivities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Test {


	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of passengers in First friday flight from Chennai to Coimbatore");
        int num,num1,num2,count;
        //String name;
        num=sc.nextInt();
        System.out.println("Enter the passengers Names");
        ArrayList<String> al = new ArrayList<String>();
       // ArrayList<String> al1 = new ArrayList<String>();
        //ArrayList<String> al2 = new ArrayList<String>();
       for(int i=0;i<num;i++)
       {
    	   al.add(sc.next());
       }
       System.out.println("Enter the number of passengers in Second friday flight from Chennai to Coimbatore");
       num1=sc.nextInt();
       System.out.println("Enter the passengers Names");
       for(int i=0;i<num1;i++)
       {
    	   al.add(sc.next());
    	   
       }
       System.out.println("Enter the number of passengers in third friday flight from Chennai to Coimbatore");
       num2=sc.nextInt();
       System.out.println("Enter the passengers Names");
       for(int i=0;i<num2;i++)
       {
    	   al.add(sc.next());
    	   
       }
       
       
       System.out.println("Selected passengers for discount:");
       HashSet<String> hsUnique = new HashSet<String>(al);
       List<String> list = new ArrayList<String>(hsUnique); 
       Collections.sort(list);
      for(String s :list)
      {
    	 
    	   count=Collections.frequency(al, s);
    	  if(count==3)
    	  {
    		  
    		 System.out.println(s); 
    	  }
      }
       
	}

}
