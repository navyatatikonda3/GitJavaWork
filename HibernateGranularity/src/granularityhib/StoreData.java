package granularityhib;

import org.hibernate.Session;  

import org.hibernate.SessionFactory;  

import org.hibernate.Transaction;  

import org.hibernate.boot.Metadata;  

import org.hibernate.boot.MetadataSources;  

import org.hibernate.boot.registry.StandardServiceRegistry;  

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.mybeans.Point;
import com.mybeans.Triangle;  

public class StoreData {



	public static void main(String[] args) 

	{

StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  

		 // create meta data object from registry

		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  

		      //build a session factory from meta object    

		SessionFactory factory = meta.getSessionFactoryBuilder().build();  

		        //create session object from session factory

		Session session = factory.openSession();  

		        //create transaction object by calling beginTransaction() method of session

		Transaction t = session.beginTransaction();  

		Point pt=new Point(15,17,10,12,17,6);

		double area= pt.CalcArea();

		Triangle t1=new Triangle(2,"t1",area);

		session.save(t1);

		t.commit(); 

		System.out.println("success...");

		factory.close(); 

		session.close();

		}

}