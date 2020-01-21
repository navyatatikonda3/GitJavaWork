package innerclasses;

public class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Car mycar=new Car();
	
	//it calls tostring() method of java.lang.Object as it is super
	System.out.println(mycar);
	
	Car.Engine yourcar=mycar.new Engine("Hino");
	
	}

}
