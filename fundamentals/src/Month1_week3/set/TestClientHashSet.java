package Month1_week3.set;

import java.util.Arrays;
import java.util.HashSet;

public class TestClientHashSet {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(10);
		set.addAll(Arrays.asList(12,34,45,56));
		System.out.println(set);
		System.out.println(set.contains(10));
		set.add(null);
		set.add(null);
		System.out.println(set);
		set.remove(null);
		System.out.println(set);
		set.removeAll(Arrays.asList(23,34,45,5));
		System.out.println(set);
		
	}
}