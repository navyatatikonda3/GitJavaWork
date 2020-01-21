package myebox;

import java.util.ArrayList;
import java.util.List;

public class User1 {
	private String name;
	private String contactNumber;
	private List<Hall> hallList;
	public User1()
	{
		hallList=new ArrayList<Hall>();
	}
	public User1(String name, String contactNumber, List<Hall> hallList) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.hallList = hallList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public List<Hall> getHallList() {
		return hallList;
	}
	public void setHallList(List<Hall> hallList) {
		this.hallList = hallList;
	}
	
	public void addToHallList(Hall hall) {
		
		
		hallList.add(hall);
		
		
	}
	

}
