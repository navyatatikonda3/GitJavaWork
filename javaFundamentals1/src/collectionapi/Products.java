package collectionapi;

import java.util.ArrayList;

public class Products {
	private int pcode;
	private String pname;
	private int price;
	private char ptype;
	private ArrayList listOfprices;
	public int getPcode() {
		return pcode;
	}
	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
		
		
		
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public char getPtype() {
		return ptype;
	}
	public void setPtype(char ptype) {
		this.ptype = ptype;
	}
	public ArrayList getListOfprices() {
		return listOfprices;
	}
	public void setListOfprices(ArrayList listOfprices) {
		this.listOfprices = listOfprices;
	}
	
	
	

}
