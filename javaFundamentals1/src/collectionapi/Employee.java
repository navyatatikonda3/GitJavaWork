package collectionapi;

public class Employee {

	 String firstName;
	 String lastName;
	 String mobileNumber;
	 String emailAddress;
	 String address;
	
	public Employee()
	{
		
		
	}
	public Employee(String firstName,String lastName,String mobileNumber,String emailAddress,String address)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.mobileNumber=mobileNumber;
		this.emailAddress=emailAddress;
		this.address=address;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
