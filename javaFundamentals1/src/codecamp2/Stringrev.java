package codecamp2;

import java.util.Scanner;

public class Stringrev {
	

		public static void main(String[] args) {
			String string[]=new String[10];
			System.out.println("Enter 10 Strings");
				Scanner sc=new Scanner(System.in);
				for(int i=0;i<10;i++)
				{
					string[i]=sc.next();
				}
				for(int i=0;i<10;i++)
				{
				System.out.println("The length of string is "+string[i].length());
				StringBuilder s=new StringBuilder(string[i]);
				System.out.println("The reverse of string is "+s.reverse().toString());
				}
			}


	}

