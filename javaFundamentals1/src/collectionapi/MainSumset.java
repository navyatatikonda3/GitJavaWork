package collectionapi;

import java.util.Scanner;

public class MainSumset {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	NumberSet ns=new NumberSet();
	int num;
	System.out.println("Enter number of integers:");
	num=sc.nextInt();
	for(int i=0;i<num;i++)
	{
		ns.insertElement(sc.nextInt());
	}
ns.getSumDigits();
	}

}
