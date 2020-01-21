package lmsActivities;

class MyException extends Exception
{
	MyException()
	{
		System.out.println("My exception created");
	}
	public MyException handler()
	{
		System.out.println("exception handled here");
		return this;
	}
}

public class AddingDemo {

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		int a,b;
		Integer result;
		if(args.length!=2)
		{
			System.out.println("please pass two numbers as arguments");
			
		}else
		{
			
			try {
				a=Integer.parseInt(args[0]);
				b=Integer.parseInt(args[1]);
				result=a/b;
				System.out.println(result);
			}
			
			
			catch(Exception e)
			{
				//System.out.println("please pass  non-zero value as 2nd argument!!!!!");
				throw new MyException().handler();
				
			}
			finally {
				result=null;
				System.out.println("Finally block executed");
			}
			
		}

	}

}
