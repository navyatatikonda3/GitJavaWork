import java.util.Scanner;
import static java.lang.System.out;
import java.text.DecimalFormat;
public class Main {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemType it=new ItemType();
		Scanner sc=new Scanner(System.in);
		out.println("Enter the Item Type Name");
		it.setName(sc.nextLine());
		out.println("Enter the Deposit Amount");
		it.setDeposit(sc.nextDouble());
		out.println("Enter the Cost per day of the Item Type");
		it.setCostPerDay(sc.nextDouble());
		
		display(it);
		
	}
	public static void display(ItemType it)
	{
		DecimalFormat df=new DecimalFormat("####.0");
		out.println("Item Name:" +it.getName());
		out.println("Deposit Amount:" +df.format(it.getDeposit()));
		out.println("Cost Per Day:" +df.format(it.getCostPerDay()));
	}

}
