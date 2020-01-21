package bootcamp;
import java.util.Scanner;
public class NoOfDays {
  public static void main(String[] args) {
		int m, year, week, day;
	       Scanner s = new Scanner(System.in);
	       System.out.print("Enter the number of days:");
	       m = s.nextInt();
	       year = m / 365;
	       m = m % 365;
	       System.out.println("Number of years:"+year);
	       week = m / 7;
	       m = m % 7;
	       System.out.println("Number of weeks:"+week);
	       day = m;
	       System.out.println("Number of days:"+day);
	}
}
