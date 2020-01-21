package bootcamp;
import java.util.Scanner;
public class Fibonacci {
public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
        int n;
        System.out.println("n=");
        n = keyboard.nextInt();
        for (int i=0; i < n; i++){
        	
            System.out.print(fibonacci(i) +" ");
        }   
    }
	public static int fibonacci(int num) {
        if (num == 0) {
            return 0;
        }
        else if(num == 1)
        {
            return 1;
        }
     
       return fibonacci(num-1) + fibonacci(num-2);
    }
}


