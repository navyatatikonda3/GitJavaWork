package bootcampday2;

public class MaxMinValues {

	 public static void main(String args[]){
		    int array[] = {10, 4, 5, 4, 8, 10};
		 
		    // Calling getMax() method for getting max value
		    int max = getMax(array);
		    System.out.print("Max = "+max +" & ");
		 
		    // Calling getMin() method for getting min value
		    int min = getMin(array);
		    System.out.println("Min = "+min);
		  }
		 
		  // Method for getting the maximum value
		  public static int getMax(int[] inputArray){ 
		    int maxVal = inputArray[0]; 
		    for(int i=1;i < inputArray.length;i++){ 
		    	if(inputArray[i] > maxVal){ 
			         maxVal = inputArray[i]; 
			      } 
			    } 
			    return maxVal; 
			  }
			 
			  // Method for getting the minimum value
			  public static int getMin(int[] inputArray){ 
			    int minVal = inputArray[0]; 
			    for(int i=1;i<inputArray.length;i++){ 
			      if(inputArray[i] < minVal){ 
			        minVal = inputArray[i]; 
			      } 
			    } 
			    return minVal;
		    }

	}


