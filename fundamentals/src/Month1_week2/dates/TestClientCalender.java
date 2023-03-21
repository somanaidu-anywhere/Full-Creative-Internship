package Month1_week2.dates;

import java.util.Calendar;

public class TestClientCalender {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.getTimeZone().getDisplayName());
		System.out.println(calendar.getTimeZone().getID());
		calendar.set(Calendar.MONTH, Calendar.OCTOBER);
		System.out.println(calendar.get(Calendar.MONDAY));
		calendar.add(Calendar.MONTH, 2);
		System.out.println(calendar.get(Calendar.MONTH));
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.after(calendar));
		System.out.println(cal.before(calendar));
		cal.set(Calendar.MONTH, 3);
		System.out.println(cal.get(Calendar.MONDAY));
		System.out.println(cal.getFirstDayOfWeek());
		System.out.println(cal.getTimeInMillis());
		cal.set(2023,2,21);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.getTime());
	}
}
