package myebox;

public class PrivilegeCustomer extends Customer{
	 double amount=0.0;
	   public double generateBillAmount(double amount)
	   {
	      return amount = amount - (0.3*amount);
	   }
}
