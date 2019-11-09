package datePack;

import java.util.Date;
import java.time.LocalDate;

public class Book {
	public int bookNumber;
	private boolean return_Status;
	private LocalDate returnedDate,borrowedDate,returnableDate;
	private float amountPayable=0.0f;
	public void  borrowBook()
	{
		Date borrowedDate=new Date();
		
	}
	public void returnBook()
	{
		returnedDate=LocalDate.now();
		returnableDate=borrowedDate+7;
		
		if(returnedDate<=returnableDate)
		{
			returnStatus=true;
		}else
		{
			amountPayable=(returnedDate-returnableDate)*10;
		}
		
	}
	public 
	class Member
	{
		int memberId;
	}
	class L

}
