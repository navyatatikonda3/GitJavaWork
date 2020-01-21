package labexam;

import java.util.Scanner;

public class CommandLineArgs {

	public static void main(String[] args)  {

          String fullName=args[0];//giving values at the command line
          String address =args[1];
          String email =  args[2];
          
          if(args.length!=3) 
          {
        	  System.out.println("Insufficient Data");
          }
          
          else
          {
        	   
        	   System.out.println("Name is " +fullName +" .Address is "+address +" .email id is "+email); //printing details 
          }
         
         }
}


