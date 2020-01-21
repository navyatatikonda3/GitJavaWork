package collectionapi;

import java.util.Set;
import java.util.TreeSet;

public class ProductMain {

	public static void main(String[] args) {
		Set<Product> set = new TreeSet<Product>();
		
		Product p1=new Product(100,"Mobile",25000,"Gadgets");
		
		Product p2=new Product(57,"Himalaya",500,"SkinCare");
		
		Product p3=new Product(345,"Jockey",5000,"Clothes");
		set.add(p1);
		set.add(p2);
		set.add(p3);
		
		for(Product p:set)
		{
			p.display();
		}
		
	}

}
