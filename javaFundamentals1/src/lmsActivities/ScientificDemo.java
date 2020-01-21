package lmsActivities;

public class ScientificDemo implements PhysicalConstants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScientificDemo.einsteinFormula();
		ScientificDemo.newtonsFormula();
		ScientificDemo.velocity();

	}
	public static void einsteinFormula()
	{
		int mass=15;
		long energy=mass*SPEED_OF_LIGHT_IN_VACUUM;
		System.out.println("Energy =" +energy);
	}
	public static void newtonsFormula()
	{
		int m1=20;
		int m2=10;
		float radius =5.2f;
		double force=GRAVITATIONAL_CONSTANT*(m1*m2)/Math.exp(radius);
		System.out.println("Force=" +force +"newtons");
	}
	public static void velocity()
	{
		int time=6;
		double distance=0.5*GRAVITATIONAL_ACCELARATION*time;
		System.out.println("Distance = "+distance);
	}

}
