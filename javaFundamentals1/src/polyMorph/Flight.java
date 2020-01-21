package polyMorph;

public class Flight extends Bird1 implements inherit.AutoMobile{
	private int wheels;
	public String flightNumber;
	private String airLines;
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getAirLines() {
		return airLines;
	}
	public void setAirLines(String airLines) {
		this.airLines = airLines;
	}
	@Override
	public boolean selfDriven() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public void fly()
	{
		//super.fly();
		System.out.println("Flight" +this.flightNumber + "belongs to" +this.airLines +"starting...." +"has" +this.tails +" tail decorated with red color");
		System.out.println("Start first Engine");
		System.out.println("Drive the flight towars runway");
		System.out.println("One flight reaches the runway");
		System.out.println("Start second Engine ");
		System.out.println("Take off");
		
		//super.fly();  
		
	}
	
	

}
