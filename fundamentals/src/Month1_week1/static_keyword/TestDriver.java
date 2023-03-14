package Month1_week1.static_keyword;

import Month1_week1.static_keyword.Student.Bus;

public class TestDriver {
	public static void main(String[] args) {
		Student student = new Student();
		
		student.rollNo = 7;
		student.name="Raja";
		System.out.println(student.rollNo);
		System.out.println(student.name);
		System.out.println(Student.collegeName);
		Student.collegeName = "ABC";
		System.out.println(Student.collegeName);
		System.out.println(Student.getCollegeName());
		
		//Student.Bus bus = new Student.Bus();
		Bus.capacity = 9;
		Bus.regNo = "AP 21 CF 7373";
		Bus.show();
		Student.Bus.show();
	}
	
}
