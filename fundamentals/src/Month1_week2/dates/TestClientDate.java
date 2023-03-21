package Month1_week2.dates;

import java.util.Date;

public class TestClientDate {

	public static void main(String[] args) {
		Date current = new Date();
		System.out.println(current);
		
		Date d1 = new Date(192993939393L);
		System.out.println(d1);
		
		System.out.println(new Date().compareTo(new Date()));
		System.out.println(current.compareTo(new Date()));
		
		System.out.println(d1.before(current));
		System.out.println(d1.after(current));
	}

}
