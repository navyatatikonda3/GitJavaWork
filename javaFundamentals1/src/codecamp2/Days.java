package codecamp2;
import java.util.Scanner;
public class Days {
	

			public static void main(String[] args) 
			{
				Scanner sc=new Scanner(System.in);
				System.out.print("Input number of days: ");
				long days=sc.nextLong();
				int years=(int)(days/365);
				int temp=(int)(days%365);
				int months=temp/30;
				int nodays=temp%30;
				System.out.print("Number of years: "+years+", Number of months: "+ months+" and Number of days: "+nodays);	
			}

		}




