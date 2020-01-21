package collectionapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArraysDemo implements Comparator {

	public static void main(String[] args) {
		int marks[]= {99,98,97};
		String subjects[]= {"Maths","Physics","Chemistry"};
		List<String> booklist=new ArrayList<String>();
		booklist.add("Let us see by Yashwanth Kanetkar");
		booklist.add("Welcome to Java by Herbert Sheildt");
		booklist.add("Core Java");
		
		Collections.sort(booklist,Collections.reverseOrder());
		
		for(String book:booklist)
		{
			System.out.println(book);
		}
		
		
		for(byte b=0;b<subjects.length;b++)
		{
			System.out.println(subjects[b]+"marks:" +marks[b]);
			
		}
		System.out.println("Before sorting an array");
		
		for(int m:marks) 
		{
			System.out.println(m);
			
		}
		Arrays.sort(marks);
		
		System.out.println("After sorting an array");
		for(int m:marks)
		{
			System.out.println(m);
		}
		

	}

	
	@Override
	public int compare(Object arg0, Object arg1) {
		String s1=(String)arg0;
		String s2=(String)arg1;
		if(s1.contentEquals(s2))
		{
		return 1;	
		}
		else
			
		return 0;
	}

}
