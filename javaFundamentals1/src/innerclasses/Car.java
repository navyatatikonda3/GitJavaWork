package innerclasses;

public class Car {
	private String carNumber;
	private String carModel;
	private String carName;
	private StringBuilder carOwnerName;
	private boolean keyStatus;
	Car()
	{
		System.out.println("Car created");
		carNumber="AP1234";
		carModel="Xing";
		carName="Santro";
		carOwnerName=new StringBuilder().append("AWFREAF");
		keyStatus=true;
	}
	
	public String toString()
	{
		return "Car[carNumber="+carNumber+", carModel="+carModel+" ,carName="+carName+",carOwnerName="+carOwnerName+"]";
	}
    
	
	//inner class
	class Engine
	{
		public String horsePower;
		
		public String engineMake;
		
		Engine()
		{
			horsePower="4.5";
			engineMake="Hitachi";
			System.out.println("Engine created,horse power" +horsePower +"Make:" +engineMake);
		}
		Engine(String engineMake)
		{
			this.engineMake=engineMake;
			this.showEngine();
		}
		public void showEngine()
		{
			Car yourcar=new Car();
			yourcar.carModel="Maruthi";
			yourcar.carName="Baleno";
			yourcar.carOwnerName.append("Navya");
			yourcar.keyStatus=false;
			System.out.println("keystatus" +keyStatus);
			
			System.out.println("your car keys are with me;" +yourcar.keyStatus);
			System.out.println("your car has "+engineMake+"Engine");
		}
		
		
		
	}
	
	
	
	
	
}
