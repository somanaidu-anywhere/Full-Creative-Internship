package Month1_week1.pass_by_value_and_reference;

public class TestDriver {

	public static void main(String[] args) {
		int a = 10;
		
		//pass by value
		System.out.println(a);
		changeA(a);
		System.out.println(a);
		
		//Achieving pass by reference by copying references till it points to same reference
		Student student = new Student();
		student.name = "som";
		student.rollNo=10;
		System.out.println(student.name+" "+student.rollNo);
		changeStudent1(student);
		System.out.println(student.name+" "+student.rollNo);
		
		//original value doesn't changed because reference is changed in the method.
		System.out.println(student.name+" "+student.rollNo);
		changeStudent2(student);
		System.out.println(student.name+" "+student.rollNo);
		
		int[] arr = {1,2,3};
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		changeArr(arr);
		System.out.println();
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
	private static void changeA(int a) {
		a=5;
	}
	private static void changeStudent1(Student student) {
		student.rollNo = 5;
		student.name="raja";
	}
	private static void changeStudent2(Student student) {
		student = null;
		student = new Student();
		student.name = "king";
		student.rollNo = 1;
	}
	private static void changeArr(int[] arr) {
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
	}



	
	

}
