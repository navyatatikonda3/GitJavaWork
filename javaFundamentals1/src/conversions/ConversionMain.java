package conversions;

public class ConversionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=987654321;
		float f=i;
		System.out.println(f);
		float x=32.3f;
		double d=x++;
		
		final int j=1000000000,b=10;
		int k=i+b;
		
		byte b1=20,b2=29;
		//byte b3=b; //not ok
		//byte b3=(int)b;
		byte b5=b1+=1;
		System.out.println(b5);
		
		short s=10;
		int ii=5;
		char c=(char)ii;
		
		int b3=b1+b2; 
		
		char ch='A';
		short cs= (short)ch;
		
		byte by=(byte)139;
		System.out.println(by);
		byte by1=123;
		System.out.println(++by1);
		//System.out.println(by1+1);

	}

}
