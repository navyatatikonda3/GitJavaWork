package collectionapi;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		HashSet<String> al=new HashSet<String>();
		HashSet<String> al1=new HashSet<String>();
		//HashSet<String> al1=new HashSet<String>();
		Scanner sc=new Scanner(System.in);
		int num,num1;
		System.out.println("Enter the number of passengers in the list:");
		num=sc.nextInt();
		System.out.println("Enter the passengers names:");
		for(int i=0;i<num;i++)
	       {
	    	   al.add(sc.next());
	    	   
	       }
		System.out.println("Enter the number of passengers who have not arrived to the airport on time");
		num1=sc.nextInt();
		System.out.println("Enter the passenger who are not arrived airport on time:");
		for(int i=0;i<num1;i++)
	       {
	      al1.add(sc.next());
	    	   
	       }
		
		System.out.println("New passengers list:");
		List<String> l=new ArrayList<String>(al);
		Collections.sort(l);
	    
		HashSet<String> hs=new HashSet<String>(al1);
		
		 
		for(String s :hs)
	      {
	    	 l.remove(s);
	    	 System.out.println(l);
	    	
	      }
		
		
	}

}
