package bootcampday3;

import java.util.Scanner;

public class InsertDelete {
	public static void main(String[] args) 
    {
		int size, insert, i, pos, del,count=0;
		  int arr[] = new int[50];
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter Array Size : ");
		  size = sc.nextInt();
		  System.out.print("Enter Array Elements : ");
		  for (i = 0; i < size; i++) {
		   arr[i] = sc.nextInt();
		  }
		  System.out.print("Enter Element to be Insert : ");
		  insert = sc.nextInt();
		  System.out.print("At Which Position ? (Enter Index Number ) : ");
		  pos = sc.nextInt();
		  for (i = size; i > pos; i--) {
		   arr[i] = arr[i - 1];
		  }
		  arr[pos] = insert;
		  System.out.print("Element inserted Successfully..!!\n");
		  System.out.print("Now the New Array is :\n");
		  for (i = 0; i < size + 1; i++) {
		   System.out.print(arr[i] + " ");
		  }
		  System.out.print("Enter Element to be Delete : ");
	        del = sc.nextInt();
	        for(i=0; i<size ; i++)
	        {
	            if(arr[i] == del)
	            {
	            	
	            	 for(int j=i; j<(size-1); j++)
		                {
		                    arr[j] = arr[j+1];
		                }
		                count++;
		                break;
		            }
		        }
		        if(count==0)
		        {
		            System.out.print("Element Not Found..!!");
		        }
		        else
		        {
		            System.out.print("Element Deleted Successfully..!!");
		            System.out.print("\nNow the New Array is :\n");
		            for(i=0; i<(size-1); i++)
		            {
		                System.out.print(arr[i]+ " ");
		            }
	  }
    }
}
