package Month1_week3.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

public class TestClient2 {
public static void main(String[] args) {
	List<Integer> list1 = new ArrayList<>();
	list1.add(10);
	list1.add(20);
	list1.add(30);
	list1.add(40);
	showNum(list1);
	
	List<Double> list2 = new ArrayList<>();
	list2.add(11.3);
	list2.add(44.5);
	list2.add(33.3);
	list2.add(12.0);
	showNum(list2);
	
}
public static void showNum(List<? extends Number> list) {
	for(Number i: list) {
		System.out.println(i);
	}
}
}
