package codecamp2;
import java.util.Scanner;
public class Absolutemaximum {

		
		public static void main(String[] args) {
			
			int array[] = new int[]{12, 19, 96, 95, 12, 8};
			int max = getMax(array);
	         System.out.println("Max= "+max);
	} 
	    public static int getMax(int[] inputArray) {
	        int maxValue = inputArray[0];
	        for(int i=1;i < inputArray.length;i++)
	        {
	          if(inputArray[i] > maxValue){
	             maxValue = inputArray[i];
	          }
	        }
	        return maxValue;
	      }

	}

