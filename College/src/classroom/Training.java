package classroom;

public class Training {
   String className;
   int noOfStudents;
   String teacherName;
public Training(String className, int noOfStudents, String teacherName) {
	super();
	this.className = className;
	this.noOfStudents = noOfStudents;
	this.teacherName = teacherName;
}
   public void display()
   {
	   System.out.println(className +noOfStudents +teacherName);
   }
   
 
}
