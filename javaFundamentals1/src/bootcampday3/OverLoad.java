package bootcampday3;

public class OverLoad {
	void calculateArea(float square)
    {
        System.out.println("Area of the square: "+ square*square+" sq units");
    }
    void calculateArea(int length, int breadth)
    {
        System.out.println("Area of the rectangle: "+ length* breadth +" sq units");
    }
    void calculateArea(double base,double height)
    {
        double area = 0.5*base*height;
        System.out.println("Area of Triangle:" +area+ " sq units");
    }
	public static void main(String[] args) {
		
		OverLoad obj = new OverLoad ();
	       
        
		  obj.calculateArea(4.5f);
		    
		  
		  obj.calculateArea(15,22);
		 
		  obj.calculateArea(6.9,5.2);
		    
	}

}
