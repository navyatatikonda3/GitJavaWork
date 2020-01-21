package labexam;
public class BubbleSort {
	  public static void main(String args[])
	{  
	    int i, j,temp;   
	    int a[] = { 101, 11, 89, 1, 93, 44, 12, 78, 34, 23};   
	    for(i = 0; i<10; i++)  
	    {  
	        for(j = i+1; j<10; j++)  
	        {  
	            if(a[j] > a[i])  
	            {  
	                temp = a[i];  
	                a[i] = a[j];  
	                a[j] = temp;   
	            }   
	        }   
	    }   
	   System.out.println("Printing Elements in a sorted order using bubble sort....");  
	    for(int x : a)  
	    {  
	    System.out.println(x);
}
	}
}
	
	
