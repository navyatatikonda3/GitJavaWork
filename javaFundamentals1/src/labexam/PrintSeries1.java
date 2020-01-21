package labexam;
import java.util.Scanner;
public class PrintSeries1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
        int num,x=0,a=3;
        System.out.println("Enter a number ");
        num = keyboard.nextInt();
        System.out.println("Series is");
        for(int i =0;i<num;i++)
        {
        	System.out.print(x +",");
        	x=x+a;
        	a=a+2;
        }
        System.out.print(x);

	}

}
