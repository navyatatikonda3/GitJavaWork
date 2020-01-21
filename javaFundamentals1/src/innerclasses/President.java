package innerclasses;

public class President {
	
		   //create an object of President
		   private static President instance = new President();

		   //make the constructor private so that this class cannot be
		   //instantiated
		   private President(){}

		   //Get the only object available
		   public static President getInstance(){
		      return instance;
		   }

		   public void showMessage(){
		      System.out.println("Hello RamNadh kovind!");
		   }
		}


