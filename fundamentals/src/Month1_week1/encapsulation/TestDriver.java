package Month1_week1.encapsulation;

public class TestDriver {
	public static void main(String[] args) {
		Employee emp1 = new Employee(101,"somanaidu",20000);

		//data hiding
//		emp1.salary = 35000;
		emp1.setSalary(35000);
		System.out.println(emp1.getSalary());
		System.out.println(emp1);
	}
}
