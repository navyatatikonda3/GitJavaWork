package innerclasses;

public class AddressBook {
	private String name;
	private Address tempAdd;
	private Address permAdd;
	
	private long phonenumber;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	


	


	public Address getTempAdd() {
		return tempAdd;
	}


	public void setTempAdd(Address tempAdd) {
		this.tempAdd = tempAdd;
	}


	public Address getPermAdd() {
		return permAdd;
	}


	public void setPermAdd(Address permAdd) {
		this.permAdd = permAdd;
	}


	public long getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}


	public class Address
	{
		private String housename;
		private String street;
		private String address;
		private String state;
		private String city;
		public String getHousename() {
			return housename;
		}
		public void setHousename(String housename) {
			this.housename = housename;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		@Override
		public String toString() {
			return "AddressBook [name=" + name + ", tempAdd=" + tempAdd + ", permAdd=" + permAdd + ", phonenumber="
					+ phonenumber + "]";
		}
		
	}


	
	
	

}
