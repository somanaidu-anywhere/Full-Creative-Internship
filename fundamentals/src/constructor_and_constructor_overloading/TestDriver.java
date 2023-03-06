package constructor_and_constructor_overloading;

public class TestDriver {
	
	public static void main(String[] args) {
		
		//creating object with Default constructor 
		Student student = new Student();
		System.out.println(student);
		
		//Constructor overloading
		Employee emp1 = new Employee();
		Employee emp2 = new Employee(101);
		Employee emp3 = new Employee(102,"Somanaidu");
		Employee emp4 = new Employee(103,"Soma","Soma@gmail.com");
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		
	}

}
