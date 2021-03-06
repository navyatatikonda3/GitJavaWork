package oop;

public class Bird {
	
	//instance variables needed to store object data
	public static int legs;
	public static int wings;
    public String birdName;
    public String birdColor;
    private boolean singStatus;
    
    
    //constructor is a method used to initialize common values to the attributes or properties
    Bird()
    {
    	legs=2;
    	wings=2;
    	
    }
    
    //methods to describe the behavior of object
    public void walk()
    {
    	System.out.println(birdColor+" " +birdName +" " +"is walking with " +legs+" legs");
    }
    public void fly()
    {
    	System.out.println(birdColor+" " +birdName +" " +"is flying with " +wings+" wings");
    }
    public void setSingStatus()
    {
    	if(this.birdName.equalsIgnoreCase("Kokila"))
    	{
    		singStatus=true;
    	}
    }
    
    public void sing()
    {
    	if(singStatus)
    	{
    		System.out.println("arerare arerare...");
    	}else
    	{
    		System.out.println("I can't sing!!!!!!");
    	}
    }
   
    	
    }


