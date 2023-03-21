package Month1_week2.dates;

import java.util.TimeZone;

public class TestClientTimeZone {

	public static void main(String[] args) {
		String ids[] = TimeZone.getAvailableIDs();
		for (String id : ids) {
			System.out.print(id+" ");
		}
		System.out.println();
		System.out.println(ids.length);
		TimeZone tz1 = TimeZone.getDefault();
		System.out.println(tz1.getDisplayName());
		System.out.println(tz1.getID());
		System.out.println(tz1.getOffset(1992999l));
	}

}
