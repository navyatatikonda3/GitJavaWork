package polyMorph;

import java.util.Scanner;
import static java.lang.System.out;

import java.text.DecimalFormat;
public class polyDemo {
	
  static Scanner sc=new Scanner(System.in);
  static DecimalFormat df=new DecimalFormat("##.00");
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0,y=0;
		float a=0.0f,b=0.0f;
		double result=0.0;
		int choice=0;
		
		
		out.println("1. Add two integers \n 2.Add two real numbers \n3.Exit");
		out.println("Enter your choice(1-3):");
		choice =sc.nextInt();
		switch(choice)
		{
		case 1: result=add(x,y);
		out.println(df.format(result));
		break;
		case 2: result=add(a,b);
		out.println(df.format(result));
		break;
		case 3:
		break;
		}//end switch block
		
		} //main end
	
	public static int add(int x,int y)
	{
		out.println("Enter first Integer");
		x=sc.nextInt();
		out.println("Enter first Integer");
		y=sc.nextInt();
		return x+y;
	}
	public static float add(float a,float b)
	{
		out.println("Enter first number");
		a=sc.nextFloat();
		out.println("Enter first number");
		b=sc.nextFloat();
		return a+b;
	}
}
