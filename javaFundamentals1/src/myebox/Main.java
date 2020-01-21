package myebox;

import java.util.Scanner;
public class Main
{
   
    public static void main(String args[])
    {
        
        int choice=0;
         Customer c=new Customer();
        SeniorCitizenCustomer sc1=new SeniorCitizenCustomer();
         PrivilegeCustomer pc= new  PrivilegeCustomer();
        
        Scanner sc=new Scanner(System.in);
         System.out.println("1)Privilege Customer");
         System.out.println("2)SeniorCitizen Customer");
         System.out.println("Enter Customer Type");
         choice=sc.nextInt();
         switch(choice)
         {
             case 1: 
                     
            	 System.out.println("Enter The Name");
                 c.setName(sc.next());
                 System.out.println("Enter The Age");
                 c.setAge(sc.nextInt());
                     System.out.println("Enter The Address");
                     c.setMobileNumber(sc.next());
                     System.out.println("Enter The Mobile Number");
                     c.setMobileNumber(sc.next());
                     System.out.println("Enter The Purchased Amount");
                     double amount=sc.nextDouble();
                 
                     double finalAmount=pc.generateBillAmount(amount);
                     System.out.println("Bill Details");
                     c.displayCustomer();
                     System.out.println("Your bill amount is Rs " +amount +"Your bill amount is discount under privilege customer");
                     System.out.println("You have to pay Rs "+finalAmount);
                     break;
            case 2: c=new Customer();
           // SeniorCitizenCustomer sc1=new SeniorCitizenCustomer();
            sc=new Scanner(System.in);
                System.out.println("Enter The Name");
                     c.setName(sc.next());
                     System.out.println("Enter The Age");
                     c.setAge(sc.nextInt());
                     System.out.println("Enter The Address");
                     c.setMobileNumber(sc.next());
                     System.out.println("Enter The Mobile Number");
                     c.setMobileNumber(sc.next());
                     System.out.println("Enter The Purchased Amount");
                      amount=sc.nextDouble();
                    finalAmount=sc1.generateBillAmount(amount);
                     System.out.println("Bill Details");
                     c.displayCustomer();
                     System.out.println("Your bill amount is Rs " +amount +"Your bill amount is discount under privilege customer");
                     System.out.println("You have to pay Rs "+finalAmount);
                     break;
            default:System.out.println("Invalid Customer Type");
                     
                     
         }
         
        
    }
}