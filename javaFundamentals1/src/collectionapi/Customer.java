package collectionapi;

public class Customer {
	private int customerId;
	private String customerName;
	private Address address;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", address=" + address + "]";
	}
	@Override
	public boolean equals(Object obj) {
		Customer c =(Customer)obj;
		if(this.customerId==c.customerId&&this.customerName.equals(c.customerName))
		{
			return true;
		}else
		{
			return false;
		}
		
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (int)Math.random();
	}
	

}
