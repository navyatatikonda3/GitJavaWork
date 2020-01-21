package bootcamp;
import java.util.Scanner;
public class BiggestOfThree {
     public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter three friends age ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
	    int oldest=(a>b)?((a>c)?a:c):((b >c)?b:c); 
        System.out.println("Oldest friend:" +oldest);
     
        int youngest = (a<b)?((a<c)?a:c):((b<c)?b:c);
        System.out.println("Youngest friend:" +youngest);
		}
}
