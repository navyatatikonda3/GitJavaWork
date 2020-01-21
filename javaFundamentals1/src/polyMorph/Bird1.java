package polyMorph;

public class Bird1 {
	
	//instance variables or class members
	public String birdName;
    public StringBuilder birdColor;
    private boolean singStatus;
    public static int legs=2, wings=2;
    protected int tails=1;
    
    //methods to describe behavior of object
    public boolean isSingStatus()
    {
    	return singStatus;
    }
    public void setSingStatus(boolean singStatus)
    {
    	this.singStatus=singStatus;
    }
    
    //defining fly method in Bird class
    public void fly()
    {
    	System.out.println("start swinging wings");
    	System.out.println("Balance body");
    	System.out.println("Observe wind Correction");
    	System.out.println("Based on that left or right");
    	
    }
}
