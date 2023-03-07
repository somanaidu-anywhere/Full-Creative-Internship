package Month1_week1.variable_types;

public class TestDriver {
	public static void main(String[] args) {
		A obj1 = new A();
		A obj2 = new A();
		A obj3 = new A();
		
		obj2.instanceVar = 20;
		obj3.instanceVar = 30;
		System.out.println(obj1.instanceVar);
		System.out.println(obj2.instanceVar);
		System.out.println(obj3.instanceVar);
		
		
		System.out.println(obj1.staticVar);
		obj1.staticVar = 100;
		
//		same for all objects
//		System.out.println(obj1.staticVar);
//		System.out.println(obj2.staticVar);
//		System.out.println(obj3.staticVar);
		
		// It is same as above
		System.out.println(A.staticVar);
		
		obj1.display();
		obj2.display();
		obj3.display();


	}
}
