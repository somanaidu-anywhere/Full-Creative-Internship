package Month1_week1.static_keyword;

public class Student {
	int rollNo;
	String name;
	static String collegeName;
	static {
		collegeName = "GPCET";
	}
	public static String getCollegeName()
	{
		return collegeName;
	}
	static class Bus{
		static String regNo;
		static int capacity;
		static void show() {
			System.out.println(regNo+" "+capacity);
			
			Student student = new Student();
			System.out.println(student.rollNo);
//			cannot use non static data
//			System.out.println(capacity);
		}
	}
}
