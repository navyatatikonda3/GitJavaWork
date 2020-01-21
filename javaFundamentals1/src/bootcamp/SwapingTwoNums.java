package bootcamp;
import java.util.Scanner;
public class SwapingTwoNums {
      public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int first=0,second=0;
	    System.out.println("Enter two Numbers");
	    first=sc.nextInt();
	    second=sc.nextInt();
	    System.out.println("pre swap " +first +" " +second);
	    first=first-second;
	    second=first+second;
	    first=second-first;
	    System.out.println("post swap " +first +" " +second);
	}
}
