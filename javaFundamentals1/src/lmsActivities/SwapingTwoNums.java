package lmsActivities;

import java.util.Scanner;

public class SwapingTwoNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int first=0,second=0;
	System.out.println("Enter two Numbers");
	first=sc.nextInt();
	 second=sc.nextInt();
	
	/*int temp;
	temp=i;
	i=j;
	j=temp;
	
	System.out.println(i);
	System.out.println(j);*/
	
	
	
	first=first-second;
	second=first+second;
	first=second-first;
	System.out.println(first);
	System.out.println(second);
	
	    

	}

}
