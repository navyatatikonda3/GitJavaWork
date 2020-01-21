package bootcampday2;

import java.util.Scanner;

public class Oranges {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of oranges");
		int e=sc.nextInt();                                                                                                                                                                                                                                                                                   
		int gross=e/144;
		int g=e%144;
		int dozen=g/12;
		int extra = e%12;
		System.out.println("Your number of oranges is "+gross+" gross , " +dozen +" dozen and "+extra);

	}

}
