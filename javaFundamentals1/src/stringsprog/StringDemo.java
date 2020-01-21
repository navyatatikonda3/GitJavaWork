package stringsprog;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="NAVYA";
		
		
		String repl=s.replace('N', 'n');
		System.out.println("Replaced with character string" +repl);
        
		
		String sub_str=s.substring(4);
		System.out.println("The substring is from index no 4 is\n(Note:index starts at0" +sub_str);
		
		String upperCaseString=s.toUpperCase();
	    String lowerCaseString =s.toLowerCase();
	    System.out.println("UPPER CASE string is :" +upperCaseString);
	    System.out.println("lower case string is :" +lowerCaseString);
	}

}
