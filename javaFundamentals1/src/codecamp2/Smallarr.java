package codecamp2;

import java.util.Scanner;

public class Smallarr {



		public static void main(String[] args) 
		{
			int[] array=new int[10];
			int temp=0;
				
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter array elements");
			for(int i=0;i<10;i++)
			{
				array[i]=sc.nextInt();
			}
			for(int i=0;i<10;i++)
			{
				for(int j=i+1;j<10;j++)
				{
					if(array[i]>=array[j])
					{
						temp=array[i];
						array[i]=array[j];
						array[i]=temp;
					}
				}
			}
			System.out.println(array[array.length]);
		}
	}






