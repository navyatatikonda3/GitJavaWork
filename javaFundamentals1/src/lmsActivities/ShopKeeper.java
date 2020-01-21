package lmsActivities;

import java.util.Scanner;

public class ShopKeeper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char productCode;
		//float price;
		int productNo;
		int quantity;
		 
		Scanner sc=new Scanner(System.in);
		double totalRetail=0;
		
		while(true)
		{
			System.out.println("1.product code A,22.50");
			System.out.println("2.product code B,44.50");
			System.out.println("3.product code C,9.98");
			System.out.println("4.exit");
			System.out.println("enter product number");
			
			productNo=sc.nextInt();
			//productCode=sc.next().charAt(0);
			
			if(productNo==4)
			{
				break;
			}
			
			
			
		
		System.out.println("Enter quantity sold");
		quantity=sc.nextInt();
		
		switch(productNo)
		{
		case 1:totalRetail+=quantity*22.50;
		       System.out.println(totalRetail);
			break;
		case 2:totalRetail+=quantity*44.50;
	       System.out.println(totalRetail);
			break;
		case 3:totalRetail+=quantity*9.98;
	       System.out.println(totalRetail);
			break;
		default:break;
			
		}
		
		System.out.println("The total retail value of all products sold"+totalRetail);

	}
	}

}
