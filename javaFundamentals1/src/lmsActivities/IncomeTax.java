package lmsActivities;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int income;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter income");
		income=sc.nextInt();
		int tax;
		if(income<=180000)
		{
			System.out.println("No tax");
		}else if((income>=180001)&&(income<=500000))
		{
			tax=income/10;
					System.out.println(tax);
					
		}else if((income>=500000)&&(income<=800000))
		{
			tax=income*(20/100);
			System.out.println(tax);
		}else
		{
			tax=income*(30/100);
			System.out.println(tax);
		}
		

	}

}
