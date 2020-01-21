package inherit;

public class BikeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b=new Bike();
		boolean isBikeSelfDriven=b.selfDriven();
		if(isBikeSelfDriven)
		{
			System.out.println("Bike drives itself,just we have to ride it");
		}
		
		
		b.balance();

	}

}
