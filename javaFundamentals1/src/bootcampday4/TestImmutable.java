package bootcampday4;

public class TestImmutable {
	final  String panCardNumber; 
    
 
	public String getPanCardNumber() {
		return panCardNumber;
	}


	public TestImmutable(String panCardNumber) {
		super();
		this.panCardNumber = panCardNumber;
	}


	public static void main(String[] args) {

		TestImmutable s = new TestImmutable("BAFPT0190"); 
		//panCardNumber = "sdshf239028" ;
	       System.out.println(s.getPanCardNumber()); 
	      

	}

}
