package student;

public class Student {
  int rollNo;
  String name;
  int age;
  String course;
  Student()
  {
	  
  }
public Student(int []rollNo ) {
	super();
	this.rollNo = this.rollNo;
	this.name = this.name;
	this.age = this.age;
}
 
public void addNewCourse(String course)
    {
	  System.out.println("added a new Course " +course +"to learn." );
   }
}
