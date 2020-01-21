package codecamp2;
import java.util.Scanner;
public class Array_compare {
	
		public static void main(String[] args) {
			  
			  int flag=0;
			  int[] array1=new int[5];
			  int[] array2=new int[5];
			  Scanner sc=new Scanner(System.in);
			  
			  System.out.println("Enter elements of first array");
			  for(int i=0;i<5;i++)
			  {
			   array1[i]=sc.nextInt();
			  }
			  
			  System.out.println("Enter elements of Second array ");
			  for(int i=0;i<5;i++)
			  {
			   array2[i]=sc.nextInt();
			  }
			  
			   boolean isfound = false;
			     
			      for(int i = 0; i < array1.length; i++)
			      {
			          isfound = false;
			          
			          for(int j = 0; j < array2.length; j++)
			          {
			              if(array1[i]==array2[j])
			              {
			                  isfound = true;
			              }
			      
			          }
			          if(!isfound)
			          {
			              System.out.println(" distinct element is "+array1[i]);
			          }
			        
			      }
			      for(int i = 0; i < array2.length; i++)
			      {
			          isfound = false;
			          
			          for(int j = 0; j < array1.length; j++)
			          {
			              if(array2[i]==array1[j])
			              {
			                  isfound = true;
			              }
			          }
			          if(!isfound)
			          {
			              System.out.println("distinct element is "+array2[i]);
			              
			          }
			      }
			  //comparing elements in two arrays
			  for(int i=0;i<5;i++)
			  {
			   for(int j=0;j<5;j++)
			   {
			   if(array1[i]==array2[j])
			   {
			    System.out.println("common element is "+array1[i]);
			    i++;
			    flag=1;
			   }
			}
	     }
	  }
			        
	}

