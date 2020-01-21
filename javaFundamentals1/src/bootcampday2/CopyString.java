package bootcampday2;

import java.util.Scanner;

public class CopyString {

	public static void main(String[] args) {
		Character ch;
		Scanner sc=new Scanner(System.in);
		String[] name=new String[10];
		System.out.println("Input the string for the array:");
		for(int i=0;i<5;i++)
		{
		name[i]=sc.next();
		}
		System.out.println("Array1 elements are:");
		{
		for(int i=0;i<5;i++)
		{
		System.out.println(name[i]);
		}
		}
		System.out.println("Array2 elements are:");
		for(int i=0;i<5;i++)
		{
		ch=name[i].charAt(0);
		int value=ch.compareTo('S');
		if(value==0)
		{
		System.out.println(name[i]);
		}
		}
	}

}
