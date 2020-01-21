package bootcampday4;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	
		System.out.println("Enter customer details");
		String account_no = sc.next();
		String customer_name= sc.next();
		String trans_type = sc.next();
		double balanceamount = sc.nextDouble();
		double trans_amount = sc.nextDouble();
		Bank b ;
		b=new SbiBank(account_no,customer_name,trans_type,balanceamount,trans_amount);
		b.display();
		
		System.out.println("Enter 2nd customer details");
		String account_no1 = sc.next();
		String customer_name1= sc.next();
		String trans_type1 = sc.next();
		double balanceamount1 = sc.nextDouble();
		double trans_amount1 = sc.nextDouble();
		
		b = new HdfcBank(account_no1,customer_name1,trans_type1,balanceamount1,trans_amount1);
	     b.display();
	 
	 System.out.println("Enter 3rd customer details");
	 String account_no2 = sc.next();
		String customer_name2= sc.next();
		String trans_type2 = sc.next();
		double balanceamount2 = sc.nextDouble();
		double trans_amount2 = sc.nextDouble();
	 
		 b = new BobBank(account_no2,customer_name2,trans_type2,balanceamount2,trans_amount2);
		b.display();

		
		}

}
