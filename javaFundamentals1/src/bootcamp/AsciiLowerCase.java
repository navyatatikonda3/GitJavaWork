package bootcamp;

public class AsciiLowerCase {

	public static void main(String[] args) {
		int i,n;
        for(i = 0; i < 26 ; i++)
        {
        	n=('a'+i);
        	System.out.print(n);
        	if(i<25)
        	{
        		System.out.print(",");
        	}
         	             
        }
	}

}
