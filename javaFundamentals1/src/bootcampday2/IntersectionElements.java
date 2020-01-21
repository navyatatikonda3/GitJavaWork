package bootcampday2;
public class IntersectionElements {
	public static int intersectionOfTwoArrays(int a[],int b[])
		{
			int c=0;
			for(int i = 0; i<a.length; i++ )
			{
		         for(int j = 0; j<b.length; j++) 
		         {
		            if(a[i]==b[j]) 
		            {
		            	
		               System.out.print(b[j] +" ");
		            }
		         }
			
			
		}
			return c;
		}
	public static void main(String[] args) {
		int a[] = {10,4,5,8,6};
	      int b[] = {9,5,4,7,11};
	      int c[]=new int[10];
	      System.out.print("Intersection of the two arrays: c=");
	     int returnValue=intersectionOfTwoArrays(a,b);
	     for (int i=0; i<returnValue; i++)  
	           System.out.print(c[i]+" ");  
}

}

