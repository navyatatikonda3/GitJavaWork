package com.hcl.lms.activities.configurewithannotations;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    	//create configuration
    	Configuration cfg = new Configuration();
    	
    	//adding resources
    	cfg.addResource("Person.hbm.xml");
    	cfg.addResource("Event.hbm.xml");
    	
    	//setting properties
    	cfg.setProperty("hibernate.connection.driver_class","com.mysql.jdbc.Driver");
    	cfg.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/MyDB");
    	
    	//creating session factory
    	SessionFactory sf = cfg.buildSessionFactory();   
    	
    	Session s = sf.openSession();
    	//accept person perporties
    	Person p = new Person();
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter aadhar id:");
    	p.setAadharId(sc.nextLine());
    	
    	
    }
}
