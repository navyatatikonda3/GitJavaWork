package abstr;

public abstract class Shape {
	
	//instance variables
	public String shapeName;
	public int vertex;
	
	//abstract method
	public abstract void calcArea();
	
	public  void showShape()
	{
		System.out.println("shape:" +shapeName);
		System.out.println("Number of vertext " +vertex);
	}
	

}
