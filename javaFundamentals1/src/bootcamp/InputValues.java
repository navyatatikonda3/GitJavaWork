package bootcamp;
import java.util.Scanner;
public class InputValues {
    public static void main(String[] args) {
		String name;
		int age;
		char gender;
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		age=sc.nextInt();
		gender=sc.next().charAt(0);
		System.out.println("Name: " +name +" Age: " +age +" Gender: "+gender);
		}
}
