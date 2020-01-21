package bootcampday3;

public class ScholarsSum {

	public static void main(String[] args) {
		int student[][] = new int[5][]; 

		student[0] = new int[5]; 
		student[1] = new int[5]; 
		student[2] = new int[5]; 
		student[3] = new int[5]; 
		student[4] = new int[5]; 

		// 1st row 
		student[0][0] = 76; 
		student[0][1] = 78; 
		
		// 2nd row 
		student[1][0] = 68; 
		student[1][1] = 87; 
		student[1][2] = 69; 
		
		// 3rd row 
		
		student[2][0] = 84; 
		 
		
		// 4th row 
		student[3][0] = 84; 
		student[3][1] = 58;
		student[3][2] = 68; 
		student[3][3] = 72;
		student[3][4] = 71; 
		
		//4th row
		student[4][0] = 71;
		student[4][1] = 71;
		student[4][2] = 71;
		student[4][3] = 71;
		
		String names[]= {"Raj","Rishi","Pooja","Pranshu","Prateek"};
		

		System.out.println("Matrix Form"); 
       int sum=0;
		for(int i=0; i < student.length; i++) 
		{ 
		for(int j=0; j < student[i].length; j++) 
		{ 
			sum=student[i][j]+sum;
		     // System.out.print(student[i][j] + " "); 
		} 
		     System.out.println(sum); 
		} 

	}

}
