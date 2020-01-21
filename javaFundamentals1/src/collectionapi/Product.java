package collectionapi;

 public class Product implements Comparable<Product> {
    int pid;
    String pname;
    float price;
    String category;
    public Product()
    {
    	
    }
public Product(int pid, String pname, float price, String category) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.category = category;
	}


public void display()
{
	System.out.println("Product id is " +pid +" Product name is " +pname+" product price is " +price +" product category is " +category);
}
@Override
public int compareTo(Product p) {
	
	if(price>p.price)
	{
		return 1;
	}
	else if(price<p.price)
	{
		return -1;
	}
	
	else
	{
	return 0;
	}
}
 }
 

