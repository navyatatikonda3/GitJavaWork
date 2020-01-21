package myIo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.Serializable;

class Student implements Serializable
{
	private int rollNumber;
	private String studentName;
	private float marks;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
}
class MarksComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		  Student s1=(Student)o1;
		  Student s2=(Student)o2;
		  float m1=s1.getMarks();
		  float m2=s2.getMarks();
		  
		 if(m1>m2)
			 return 1;
		 else
			 
		return 0;
	}
	
}

public class PersistDemo {

	public static void main(String[] args) throws IOException {
		Student s=new Student();
		s.setRollNumber(37);
		s.setStudentName("Navya");
		s.setMarks(100);
		
		Student s2=new Student();
		s2.setRollNumber(1);
		s2.setStudentName("Nav");
		s2.setMarks(99);
		
		
		//serialization
		File f=new File("C:/Users/TSSVJA/Desktop/Navya.txt");
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		
		
		ArrayList<Student> slist=new ArrayList<Student>();
		
		slist.add(s);
		slist.add(s2);
		
		//write object to hard drive to external storage media
				oos.writeObject(s);
				//oos.writeObject(s2);
				
				//close stream objects
				oos.close();
				fos.close();
		
		Collections.sort(slist, new MarksComparator());
		
		

	}

}
