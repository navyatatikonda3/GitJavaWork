package labexam;

import java.util.Scanner;

public class PrintSeries {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
        int n;
        System.out.println("Enter a number ");
        n = keyboard.nextInt();
        for (int i=0; i < n; i++){
        	
            System.out.print(series(i) +" ");
        }   
    }
	public static int series(int num) {
        if (num == 0) {
            return 0;
        }
        else if(num==1)
        {
        	return 3;
        }
     
       return series(num-1) +5  ;
    }
		
		
}


