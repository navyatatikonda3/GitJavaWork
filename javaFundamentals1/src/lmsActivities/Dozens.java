package lmsActivities;
import java.util.Scanner;
public class Dozens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eggs=0;
		int dozens;
		int extras;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How many eggs do you have?");
		eggs =sc.nextInt();
		
		dozens=eggs/12;
		extras=eggs%12;
		
		System.out.println("Your number of eggs is " +dozens +" dozens and " +extras +"extras");
		
		
		
		

	}

}
