package bootcampday4;

public class Employee {
	String name; 
	String employeeCode;
	String gender;
	String location;
	int count = 0;
	public Employee(String name, String gender, String location) {
		super();
		this.name = name;
		this.gender = gender;
		this.location = location;
		employeeCode=getEmployeeCode(this.location);
	}
	public String getEmployeeCode(String location)
	{
		String result=location.substring(0,1);
		count = count + 1;
		String employeeCode= result + count;
		if(count>=5)
		{
			System.out.println("error");
		}
		
				return employeeCode;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeCode=" + employeeCode + ", gender=" + gender + ", location="
				+ location + "]";
	}
	
	
	
	}
