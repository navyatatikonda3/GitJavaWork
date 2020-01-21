package bootcamp;
import java.util.Scanner;
public class AvgPositiveInt {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int positive = 0, total = 0, count = 0;  
		int number;
		float average;
System.out.println("Enter the number: ");
		     do { 
		    	 number = sc.nextInt();
		     total += number;
		        count++;  
		           if(number > 0){
		           positive++;
		        }
		            
		    }
		     while(number != 0);

		     average = total / count;

		System.out.println(average);
		}
}
