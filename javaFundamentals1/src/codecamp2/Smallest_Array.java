package codecamp2;
import java.util.Scanner;

public class Smallest_Array {

	public static void main(String[] args) {
		int small,size,i;
		int array[] =new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array elements:");
		for(i=0;i<10;i++)
		{
			array[i]=sc.nextInt();
		}
		small=array[0];
	
		for(i=0;i<10;i++)
		{
			if(small>=array[i])
				{
					small=array[i];
				}
			}
		
		System.out.println("Smallest Element:" +small);
	}
}


