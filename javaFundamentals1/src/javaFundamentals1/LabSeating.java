package javaFundamentals1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LabSeating {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int k,i=0,num,n=0,sqr,dig=0,sum=0,sumfinal;
		DecimalFormat df= new DecimalFormat("#.00");
		k=s.nextInt();
		num=k;
		sqr=num*num;
		while(k!=0)
		{
			dig=k%10;
			k=k/10;
			n++;
		}
		while(dig==n)
		{
			dig=sqr%10;
			sqr=sqr/10;
			sum=sum +(int)(dig*Math.pow(10, i));
			i++;
			n--;
			
		}
		sumfinal=sum+sqr;
		if(sum==k)
		{
			System.out.println("Karpekar num");
		}
		else
		{
			System.out.println("not a karpk num");
		}
		
		
}
}

