package labexam;
public class VolumeOverload {
	final double PI=3.14;
	public int volume(int a,int b)
	{
		return a*b;
	
	}
	public float volume(float a,float b,float c)
	{
		return a*b*c;
		
	}
	public double volume(double a,double b)
	{
		return PI*a*b;
		
	}
	public static void main(String[] args) {
		 VolumeOverload vo = new  VolumeOverload();
	     System.out.println(vo.volume(5, 6)); //calls int return type volume method
		 System.out.println(vo.volume(5.3, 5.6));//calls double return type volume method
		 System.out.println(vo.volume(6.3f, 5.5f,4.1f));//calls float return type volume method
		
	}

}
