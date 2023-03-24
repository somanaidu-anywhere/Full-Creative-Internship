package Month1_week3.set;

import java.util.TreeSet;

public class TestClientTreeSet {

	public static void main(String[] args) {
		TreeSet set1 = new TreeSet();
		set1.add(1);
		set1.add(20);
		set1.add(-3);
		set1.add(3);
		System.out.println(set1);
		
		
		TreeSet set2 = new TreeSet();
		set2.add(1);
		//set2.add(9.9);  // ClassCastException
		System.out.println(set2);
		
		TreeSet<Student> set3 = new TreeSet<>();
		set3.add(new Student(102,"Venky",1));
		set3.add(new Student(104,"Sharath",2));
		set3.add(new Student(106,"Harish",5));
		set3.add(new Student(100,"Ram",7));
		set3.add(new Student(101,"Raja",1));
		set3.add(new Student(101,"Raja",1));
		set3.add(new Student(102,"Jayanth",1));
		System.out.println(set3);
		
		System.out.println(set3.first());
		System.out.println(set3.last());
		
	}

}
