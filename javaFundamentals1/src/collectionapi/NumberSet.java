package collectionapi;
import java.util.*;
public class NumberSet  {

	private TreeSet<Integer> numberSet=new TreeSet<Integer>();
	TreeSet<Integer> t=new TreeSet<Integer>();
	int sum=0,a,a1,a2;
	public void insertElement(Integer in)
	{
		numberSet.add(in);
	}
	public void getSumDigits()
	{
		
		Iterator<Integer> it=numberSet.iterator();
		while(it.hasNext())
		{
			a=it.next();
			a1=a/10;
			a2=a%10;
			sum=a1+a2;
			
		  t.add(sum);
			
		}
		for(int i:t)
		{
			System.out.println(i);
		}
		
	}
	
}
