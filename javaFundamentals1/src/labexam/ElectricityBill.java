package labexam;
import java.util.Scanner;
public class ElectricityBill {
	
	final int meterAmount = 250;
	double cost=0.0,serviceTax=0.0,totalBill=0.0;
	int units;
	public void generateAmount(int units)
	{
		if(units==100)
		{
			cost = 3.25 *units;
			serviceTax = 0.1475*cost;
			System.out.println("electricity bill for " +units + " is" +cost);
			System.out.println("Service Tax for "+"units" +" is "+serviceTax);
			totalBill=serviceTax + cost;
			System.out.println("Total bill is " +totalBill);
			
		}
		else if(units>=100 && units <=300)
		{
			cost = 4.75 * units;
			serviceTax = 0.1475*cost;
			System.out.println("electricity bill for " +units + " is" +cost);
			System.out.println("Service Tax for "+"units" +" is "+serviceTax);
			totalBill=serviceTax + cost;
			System.out.println("Total bill is " +totalBill);
		}
		else
		{
			cost  = 6.35 * units;
			serviceTax = 0.1475*cost;
			System.out.println("electricity bill for " +units + " is" +cost);
			System.out.println("Service Tax for "+"units" +" is "+serviceTax);
			totalBill=serviceTax + cost;
			System.out.println("Total bill is " +totalBill);
		}
	}
	
	

}
