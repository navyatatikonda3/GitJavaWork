package bootcampday2;

import java.util.Arrays;
import java.util.Scanner;
public class DuplicatesRemove {

		public static int DuplicateRemoval(int array[], int n){  
	        if (n==0 || n==1){  
	            return n;  
	        }    
	        int k = 0;
	        for (int i=0; i < n-1; i++){  
	            if (array[i] != array[i+1]){  
	                array[k++] = array[i];  
	            }  
	        }  
	        array[k++] = array[n-1];  
	        return k;  
	    }  

	public static void main(String[] args) {
		  
		Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=input.nextInt();
        
        int array[]=new int[n]; 
        System.out.print("Enter the elements:");
        for (int s=0;s<array.length;s++){
            array[s]=input.nextInt();
        }
        Arrays.sort(array);
        int return_value= DuplicateRemoval(array, array.length);  
        System.out.println("Array after removing the Duplicate Elements:");
        for (int i=0; i<return_value; i++)  
           System.out.print(array[i]+" ");  

	}

}
