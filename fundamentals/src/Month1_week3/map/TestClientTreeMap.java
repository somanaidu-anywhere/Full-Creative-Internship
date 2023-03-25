package Month1_week3.map;

import java.util.TreeMap;
import java.util.TreeSet;

import Month1_week3.set.Student;

public class TestClientTreeMap {
public static void main(String[] args) {
	TreeMap m = new TreeMap();
	m.put(100, "Z");
	m.put(103, "Y");
	m.put(101, "X");
	m.put(104, 106);
	m.put(107, null);
	m.put(100, "X");
	//m.put(null, "X"); //NullPointerException
	System.out.println(m);
	
	
	TreeMap<Student,Integer> map = new TreeMap<>();
	map.put(new Student(102,"Venky",1),null);
	map.put(new Student(104,"Sharath",2),54);
	map.put(new Student(106,"Harish",5),33);
	map.put(new Student(100,"Ram",7),54);
	map.put(new Student(101,"Raja",1),30);
	map.put(new Student(101,"Raja",1),40);
	map.put(new Student(102,"Jayanth",1),59);
	System.out.println(map);
}
}
