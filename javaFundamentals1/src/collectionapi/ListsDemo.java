package collectionapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class ListsDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		List<Integer> prices = new ArrayList<Integer>();
		
		LinkedList<Product> ll=new LinkedList<Product>();
		Queue<Order> orderQ=new PriorityQueue<Order>();
		
		Set<Customer> customerSet = new HashSet<Customer>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//accept customer data
		boolean flag=true;
		while(flag)
		
		{
			Customer c = new Customer();
			System.out.println("Enter customer id");
			c.setCustomerId(Integer.parseInt(br.readLine()));
			c.setCustomerName(br.readLine());
			customerSet.add(c);
			System.out.println("wish to add more customers?");
			char reply = br.readLine().toLowerCase().charAt(0);
			if(reply!='y')
				flag=false;
			
		}
		showCollection(customerSet);
		
	}	
	
	public static void showCollection(Collection c)
	{
		Iterator itr=c.iterator();
		while(itr.hasNext())
		{
			if(c instanceof Set)
			{
				Customer customer =(Customer) itr.next();
				System.out.println("customr id: " +customer.getCustomerId());
				System.out.println("Customer Name: " +customer.getCustomerName());
			}else if(c instanceof List)
			{
				Products p=(Products)itr.next();
				System.out.println("product id:" +p.getPcode());
				System.out.println("product name :" +p.getPname());
			}
		}
		
	}

}
