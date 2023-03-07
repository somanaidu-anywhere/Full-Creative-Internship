package Month1_week1.constructor_and_constructor_overloading;

public class Employee {
	int empId;
	String name;
	String email;
	public Employee()
	{
		System.out.println("Empty Constructor");
	}
	
	public Employee(int empId) {
		this.empId = empId;
	}
	
	
	public Employee(int empId, String name)
	{
		this.empId = empId;
		this.name = name;
	}
	
	
	public Employee(int empId, String name, String email) {
		this(empId,name);
		this.email = email;
		
		// It is called constructor chaining
		
		//this is same as above
//		this.empId = empId;
//		this.name = name;
//		this.email = email;
		
		
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", email=" + email + "]";
	}
	
}
