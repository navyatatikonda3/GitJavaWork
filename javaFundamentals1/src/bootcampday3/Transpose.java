package bootcampday3;

import java.util.Scanner;

public class Transpose {
	public static void main(String args[])
	   {
	       int i, j=0,k;
	       int arr[][] = new int[3][3];
	       int arr1[][]=new int[3][3];
	       int arrt[][] = new int[3][3];
	       int arrm[][]=new int[3][3];
	       Scanner scan = new Scanner(System.in);
	    
	       System.out.print("Enter 3*3 Array1 Elements : ");
	       for(i=0; i<3; i++)
	       {
	           for(j=0; j<3; j++)
	           {
	               arr[i][j] = scan.nextInt();
	           }
	       }
	       System.out.print("Enter 3*3 Array2 Elements : ");
	       for(i=0; i<3; i++)
	       {
	           for(j=0; j<3; j++)
	           {
	               arr1[i][j] = scan.nextInt();
	           }
	       }
	       for(i=0; i<3; i++)
	       {
	           for(j=0; j<3; j++)
	           {
	               arrt[i][j] = arr[j][i];
	           }
	       }
	       System.out.print("Transpose of the first Matrix is :\n");
	     
	       for(int[] y:arrt)
	       {
	    	   for(int ele :y)
	    	   {
	    		   System.out.print(ele +" ");
	    	   }
	    	   System.out.print("\n");
	       }
	    // Multiplying two matrices
	       System.out.println("Two marix multiplication is");
	       for (i = 0; i < 3; i++) {
	           for (j = 0; j < 3; j++) {
	               for (k = 0; k < 3; k++) {
	                   arrm[i][j] += arr[i][k] * arr1[k][j];
	               }
	           }
	       }
	       
	       for(int[] x :arrm)
	       {
	    	   for(int ele :x)
	    	   {
	    		   System.out.print(ele +" ");
	    	   }
	    	   System.out.print("\n");
	       }
	      
	   }
}
