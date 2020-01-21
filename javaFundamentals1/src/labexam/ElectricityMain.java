package labexam;
import java.util.Scanner;
public class ElectricityMain {

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Units ");
		int units = sc.nextInt();
		ElectricityBill eb = new ElectricityBill();
		eb.generateAmount(units);
		
		}

}
