package collectionapi;
import java.util.*;  
public class Main1 {
	
	public static void findPass(HashMap<Integer,Integer> hm)
	{
		//HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(Map.Entry<Integer,Integer> entry:hm.entrySet()) 
			
	     {  
			if(entry.getValue()>75)
			{
	        System.out.println(entry.getKey());   
	     }  
	     }
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++)
		{
		hm.put(sc.nextInt(), sc.nextInt());
		}
		findPass(hm);
		
	}

}
