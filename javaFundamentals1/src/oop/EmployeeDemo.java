package oop;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		emp1.setEmployeeId(37);
		emp1.setCompanyName("HCL");
		emp1.setEmployeeName(new StringBuilder("Navya"));
		emp1.setEmployementStatus(true);
		emp1.setEmployeeSalary(100000.0f);
		
		Employee emp2=new Employee();
		emp2.setEmployeeId(37);
		emp2.setCompanyName("HCL");
		emp2.setEmployeeName(new StringBuilder("Navya"));
		emp2.setEmployementStatus(true);
		emp2.setEmployeeSalary(100000.0f);
		
		if(emp1.compareTo(emp2)==0)
		{
			System.out.println("both ids are same");
		}
		else
		{
			System.out.println("ids are not equal");
		}
		
		
		

	}

}
