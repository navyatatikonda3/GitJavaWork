package lmsActivities;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any year :");
		int year=sc.nextInt();
		
		boolean leapYear=false;
		
		if(year %4==0)
		{
			if(year % 100==0)
			{
				if(year % 400==0)
					leapYear=true;
				else
					leapYear=false;
			}
			else
				leapYear=true;
		}
		else
			leapYear=false;
		if(leapYear)
			System.out.println(year +"leap year");
		else
			System.out.println(year +"not a leap year");
	}
	
		
}
