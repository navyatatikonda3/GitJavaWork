package bootcampday4;

public class SbiBank extends Bank {
	
	public SbiBank(String account_no,String customer_name,String trans_type,double balanceamount,double trans_amount)
	
	{
		super(account_no,customer_name,trans_type,balanceamount,trans_amount);
		
	}
  double calculate_Interest()
  { double interestamount=0;
  balanceamount=this.balanceamount;
	  interestamount = (balanceamount * 6.5)/100;
	return balanceamount+interestamount;
	  
  }
  public void display()
  {
	  super.display();
	  System.out.println("bakName is:" +"SBI");
	  System.out.println("Interest amount: Rs." +calculate_Interest());
	  if (trans_type.equals("deposit")) {  
		  balanceamount = balanceamount + trans_amount;
		  System.out.println("New Balance: " +balanceamount);
			
		}
  }
  
}
