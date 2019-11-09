package abstr;

public class Circle extends Shape {
    
	float radius,area;
	
		final static float PI=3.141f; 
		Circle(float radius)
		{
			this.radius=radius;
		}
		public void calcArea()
		{
			area=PI*radius*radius;
			System.out.println("area of a circle is:" +area);
		}
	}


