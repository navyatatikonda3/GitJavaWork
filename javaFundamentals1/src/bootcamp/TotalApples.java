package bootcamp;
import java.util.Scanner;
public class TotalApples {
	public static void main(String[] args) {
		int xor, and, temp,n=0,m=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of apples:");
		n=sc.nextInt();
		System.out.println("Number of apples to be added:");
		m=sc.nextInt();
		and = n & m;
		xor = n ^ m; 

		while(and != 0 )
		{
		and <<= 1; 
		temp = xor ^ and;
		and &= xor; 
		xor = temp; 
		}
		System.out.println("Total number of apples:" +xor);
     
	}
}
