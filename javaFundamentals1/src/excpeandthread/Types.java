package excpeandthread;

class Types
{
    public static void main(String args[]) 
    {
        try 
        {
            int a = args.length;
            int b = 10 / a;
            System.out.print(a);
            try 
            {
                if (a == 1)
                    a = a / a - a;
                if (a == 2) 
                {
                    int []c = {1};
                    c[8] = 9;
                }
            }
            
            catch (ArithmeticException e) 
            {
                System.out.println("TypeB");
            }
           
        }
        finally
        {
        	System.out.println();
        }
    }
}

