package bootcampday4;

import java.util.Scanner;

public class ShapeMenu {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		Shape s;
    	double base;
	    double height;
	    double side1, side2, height1;
        {
            System.out.println("Enter the number which you want to compute the area");
            System.out.print("(1) Triangle (2) Trapizoid (3) Hexagon? ");
            switch (scan.nextInt()) {
            case 1:
            	s=new Triangle();
                s.numberOfSides(3);
                Triangle triangle = new Triangle();
                System.out.print("Base: ");
                 base=scan.nextDouble();
                System.out.print("Height: ");
                height=scan.nextDouble();
                
                 double area = 0.5 *base * height;
                 
                System.out.println("Area of triangle: " +area);
                break;
            case 2:
            	s=new Trapezoid();
                s.numberOfSides(4);
                Trapezoid Trapizoid=new Trapezoid();
            	System.out.println("Enter Length of Two Parallel Sides of Trapezium");
            	side1=scan.nextDouble();
            	side2=scan.nextDouble();
                System.out.println("Enter Height of Trapezium");
                height1=scan.nextDouble();
                area = 1.0 / 2 * (side1 + side2) * height1;
                System.out.println("Area of Trapizoid " + area);
                break;

            case 3:
            	s=new Hexagon();
                s.numberOfSides(6); 
            	Hexagon hexgon=new Hexagon();
            	System.out.println("Enter the side of a Hexagon");
            	double side=scan.nextDouble();
            	area = (( 3 * Math.pow(3, 1/3) * Math.pow(side, 2))) / 2;
                System.out.println("Area of Hexagon " + area);
                break;
            default:System.out.println("Invaild Choice");
            }
        }

	}

}
	
