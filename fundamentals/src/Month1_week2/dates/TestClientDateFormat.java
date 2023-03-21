package Month1_week2.dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class TestClientDateFormat {

	public static void main(String[] args) {
		Date curDate = new Date();
		DateFormat dateFormat = DateFormat.getDateInstance();
		String date = dateFormat.format(curDate);
		System.out.println(date);
		DateFormat timeFormat = DateFormat.getTimeInstance();
		String time = timeFormat.format(curDate);
		System.out.println(time);
		
		DateFormat dateTimeFormat = DateFormat.getDateTimeInstance();
		String dateTime = dateTimeFormat.format(curDate);
		System.out.println(dateTime);
		
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(df1.format(curDate));
		
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(df2.format(curDate));

		
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(df3.format(curDate));
		
		DateFormat dt1 = DateFormat.getTimeInstance(DateFormat.SHORT);
		System.out.println(dt1.format(curDate));
		
		DateFormat dt2 = DateFormat.getTimeInstance(DateFormat.MEDIUM);
		System.out.println(dt2.format(curDate));

		
		DateFormat dt3 = DateFormat.getTimeInstance(DateFormat.LONG);
		System.out.println(dt3.format(curDate));
		
		try {
			Date d1 = DateFormat.getDateInstance().parse("21 Mar, 2023");
			System.out.println(date);
			String t1 = timeFormat.format(d1);
			System.out.println(t1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
