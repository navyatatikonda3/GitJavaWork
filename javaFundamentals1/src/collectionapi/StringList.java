package collectionapi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class StringList {

	public static void main(String[] args) {
		List l=new ArrayList();
		String str="Hello how are you doing how do you do";
	String words[]=	str.split(" ");
	for(int i=0;i<words.length;i++)
	{
	l.add(words[i]);
	}
		Iterator i = l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		LinkedHashSet hashSet = new LinkedHashSet(l);
		
		List al = new ArrayList(hashSet);
		
		System.out.println(al);
		
	}

}
