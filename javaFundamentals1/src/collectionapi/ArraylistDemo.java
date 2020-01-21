package collectionapi;

import java.util.ArrayList;

public class ArraylistDemo {

	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		int myage=20;
		String myname="Navya";
		long mymemory=123456789l;
		al.add(myage);
		al.add(myname);
		al.add(mymemory);
		System.out.println(al);
		
		ArrayList<String> elist = new  ArrayList<String>();
		elist.add("Nav");
		elist.add("na");
		elist.add("Navy");
		
		
		
		if(elist.contains("Navya Tatikonda"))
		{
			System.out.println("Navya is also inside collection of employees");
		}else
		{
			elist.add("Navya Tatikonda");
		}
		for(String s:elist)
		{
			System.out.println("Employee Name:" +s);
		}
		
		

	}

}
