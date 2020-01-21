package bootcampday2;

public class ValidTriangle {

	public static void main(String[] args) {
		int angle1[]= {50,15,115};
		int angle2[]= {15,15,100};
		int angle3[]= {105,65,20};
		int sum=0;
		for(int i:angle1)
		{
			sum=sum+i;
			
		}
		if(sum==180)
		{
			System.out.println("Triangle");
		}
		else
			System.out.println("Not a Triangle");
		
	for(int i : angle2)
	{
		sum=sum+i;
	}
	if(sum==180)
	{
		System.out.println("Triangle");
	}
	else
		System.out.println("Not a Triangle");
	
	for(int i : angle3)
	{
		sum=sum+i;
	}
	if(sum==180)
	{
		System.out.println("Triangle");
	}
	else
		System.out.println("Not a Triangle");
	

}
}
