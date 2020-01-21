package myebox;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		User1 u= new User1();
		Hall h=new Hall();
		int users,noOfHalls;
		System.out.println("Enter the number of users:");
		users=sc.nextInt();
		User1 uarray[]=new User1[users];
		for(int i=0;i<users;i++)
		{
			System.out.println("User" +(i+1));
			System.out.println("Name:");
			u.setName(sc.next());
			System.out.println("contact number:");
			u.setContactNumber(sc.next());
			uarray[i]=u;
		}
		System.out.println("Enter the number of halls:");
		noOfHalls = sc.nextInt();
		for(int i=0;i<noOfHalls;i++)
		{
			System.out.println("Hall" +(i+1));
			System.out.println("Name:");
			h.setName(sc.next());
			h.setCostPerDay(sc.nextInt());
			h.setOwnerName(sc.next());
			uarray[i].addToHallList(h);
		}
		
		for(User1 u1:uarray)
		{
			
		System.out.println("Owner Name:" +u.getName());
		System.out.println("Hall " +u.getHallList());
		System.out.println("Name:"+h.getName());
		System.out.println("Cost per day:"+h.getCostPerDay());
		}
		
		

	}

}
