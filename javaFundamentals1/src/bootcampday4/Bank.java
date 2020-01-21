package bootcampday4;

public abstract class Bank {
	String account_no;
	String customer_name;
	String trans_type ;
	double balanceamount;
	//String bankName;
	double trans_amount;
	
	public Bank(String account_no, String customer_name, String trans_type, double balanceamount, double trans_amount) {
		super();
		this.account_no = account_no;
		this.customer_name = customer_name;
		this.trans_type = trans_type;
		this.balanceamount = balanceamount;
		this.trans_amount = trans_amount;
	}

	abstract double calculate_Interest();
	public void display()
	  {
		  
		  System.out.println("Account no: " +account_no);
		  System.out.println("Customer Name: " +customer_name);
		  //System.out.println("Bank name: " +bankName);
		  System.out.println("Transaction type" +trans_type);
		  System.out.println("Transaction amount" +trans_amount);
		  System.out.println("Balance amount: Rs" +balanceamount);
		 
		 
		
		  }
	

}
