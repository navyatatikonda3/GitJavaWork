package myIo;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.io.IOException;
public class ReadFile {

	public static void main(String[] args) throws IOException,ClassNotFoundException {
		
	ArrayList<Student> s=new ArrayList<Student>();
		File f=new File("C:/Users/TSSVJA/Desktop/Navya.txt");
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		s[0]=(Student)ois.readObject();
		
		for(Student st:s)
		{
			System.out.println(st.getRollNumber() +"" +st.getStudentName());
		}
		

	}

}
