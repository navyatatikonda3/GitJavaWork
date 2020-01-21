package bootcampday3;

import java.util.Scanner;
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student r=new Student();
		r.add();
	}

}

 class Student {

	private int reg_no;
	private String name;
	private double mark;
	public Student(int reg_no, String name, double mark) {
		super();
		this.reg_no = reg_no;
		this.name = name;
		this.mark = mark;
	}
Student(){}	
	
	
 
public void add()
{
	System.out.println("Enter No of students");
	Scanner sc=new Scanner(System.in);
	int reg_no;
	String name;
	double mark;
	int num=sc.nextInt();
	Student[] stu=new Student[num];
	for(int i=0;i<num;i++)
	{
		System.out.println("Enter registration number");
		reg_no=sc.nextInt();
		System.out.println("Enter student name");
		name=sc.next();
		System.out.println("Enter marks");
		mark=sc.nextDouble();
		Student s= new Student(reg_no,name,mark);
		stu[i]=s;
	}
	for(Student st:stu){
	System.out.println(st.toString());	
	}
	}
@Override
public String toString() {
	return "Student [reg_no=" + reg_no + ", name=" + name + ", mark=" + mark + "]";
}
}


