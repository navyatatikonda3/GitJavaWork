package inherit;
//Example for multiple inheritance  as Bike class implements two interfaces
public class Bike implements Cycle,AutoMobile{

	@Override
	public boolean selfDriven() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("we should balance");
	}

}
