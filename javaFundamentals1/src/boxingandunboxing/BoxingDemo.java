package boxingandunboxing;

public class BoxingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0;
		if(args.length !=0)
		{
			// unboxing
			//convert string object into int value to store it in a 
			a=Integer.parseInt(args[0]);
			//convert string object into int value to store it in b
			b=Integer.parseInt(args[1]);
			
			
			//boxing
			Integer result=a+b;
			
			
			System.out.println(result);
			
		}
		else{
			System.out.println("please pass two integers as arguments!!");
		}

	}

}
