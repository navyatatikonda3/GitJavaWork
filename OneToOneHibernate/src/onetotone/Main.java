package onetotone;

import org.hibernate.*;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  


public class Main {

	public static void main(String[] args) {
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
	      
	    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
	    Session session=factory.openSession();  
	      
	    Transaction t=session.beginTransaction();   
	      
	    Student e1=new Student(); 
	    
	    
	    
	        
	    Address address1 = new Address("OMR Road", "Chennai", "TN", "600097");
		Address address2 = new Address("Ring Road", "Banglore", "Karnataka", "560000");
		Student student1 = new Student("Eswar", address1);
		Student student2 = new Student("Joe", address2);
		session.save(student1);
		session.save(student2);
		t.commit();

	    session.close();    
	    System.out.println("success");    

	}

}
