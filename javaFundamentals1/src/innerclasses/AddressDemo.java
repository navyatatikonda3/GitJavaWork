package innerclasses;

public class AddressDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressBook ab=new AddressBook();
		AddressBook.Address address=new AddressBook().new Address();
		address.setHousename("Shanti");
		address.setStreet("mee seva street");
		address.setCity("vijayawada");
		address.setState("Ap");
		
		//set values to attributes of outer class
		ab.setTempAdd(address);
		
		AddressBook.Address paddress = new AddressBook().new Address();
		paddress.setHousename("srinivas nivas");
		paddress.setStreet("bhavanipuram");
		paddress.setCity("vjwd");
		paddress.setState("ap");
		
		ab.setPermAdd(paddress);

		
		System.out.println(ab.getTempAdd());
		System.out.println(ab.getPermAdd());
	}

}
