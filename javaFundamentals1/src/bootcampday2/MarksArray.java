package bootcampday2;

import java.util.Scanner;

public class MarksArray {

	public static void main(String[] args) {
		int marks[]= new int[10];
		int totalMarks=0,element,position,size;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		size=sc.nextInt();
		System.out.println("Enter marks: ");
		
		
		for(int i=0;i<size;i++)
		{
			 marks[i]=sc.nextInt();
		}
		
		System.out.println("Total Marks Before");
		for(int i=0;i<marks.length;i++)
		{
			totalMarks=totalMarks+marks[i];
		}
		System.out.println(totalMarks);
		
		System.out.println("Enter element to be insert");
		element=sc.nextInt();
		System.out.println("Enter index number");
		position = sc.nextInt();
		
		//creating a space at the required position
		for(int i=size;i>position;i--)
		{
			marks[i] = marks[i-1];
		}
		
		marks[position] = element;
		
		System.out.println("New Marks After Insertion: ");
		totalMarks=0;
		for(int i =0;i<size+1;i++)
		{
			
			totalMarks=totalMarks+marks[i];
		}
		System.out.println(totalMarks);
		

	}

}
