package basicsandoopsjava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		String day1,month1,year1,day2,year2,month2;
		System.out.println("Enter date1");
		System.out.println("Enter day");
		day1=sc.next();
		int a=Integer.parseInt(day1);
		System.out.println("Enter month");
		month1=sc.next();
		int b=Integer.parseInt(month1);
		System.out.println("Enter year");
		year1=sc.next();
		String y=day1+month1+year1;
		System.out.println("Enter date2");
		System.out.println("Enter day");
		day2 = sc.nextLine();
		int d=Integer.parseInt(day2);
		System.out.println("Enter month2");
		month2=sc.nextLine();
		int m=Integer.parseInt(month2);
		System.out.println("Enter year2");
		year2=sc.nextLine();
		String y2=day2+month2+year2;
		
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
		Date d1=sdf.parse(y);
		Date d2=sdf.parse(y2);
		
		long diff=d2.getTime()-d1.getTime();
		
		

	}

}
