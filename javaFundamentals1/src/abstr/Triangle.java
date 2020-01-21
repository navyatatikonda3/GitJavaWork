package abstr;

public class Triangle extends Shape {
  float base,height,area;
  
  Triangle()
  {
	  System.out.println("constructing triangle object");
  }
  Triangle(float base,float height)
  {
	  this.base=base;
	  this.height=height;
  }
  public void calcArea()
  {
	  area=0.5f*base*height;
	  System.out.println("area of a " +shapeName +"is "+area);
  }
 
}
