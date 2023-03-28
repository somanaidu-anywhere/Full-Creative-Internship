package Month1_week3.task_date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class TestClient {
	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Enter Your Date of Birth : ");
		String born = sc.nextLine();
		Calendar dob = getValidCalendar(born);
		Calendar now = Calendar.getInstance();
		int[] arr = getAge(dob, now);
		System.out.println(arr[2] + " Years, "+arr[1] + " Months and "+arr[0]+" Days.");
		sc.close();
	}

	public static int[] getAge(Calendar dob, Calendar now) {
		LocalDate dobLocal = LocalDateTime.ofInstant(dob.toInstant(), dob.getTimeZone().toZoneId())
				.toLocalDate();
		LocalDate nowLocal = LocalDateTime.ofInstant(now.toInstant(), now.getTimeZone().toZoneId())
				.toLocalDate();
		
		Period p = Period.between(dobLocal, nowLocal);
		int days = p.getDays();
		int months = p.getMonths();
		int years = p.getYears();
		int[] arr = {days,months,years};
		return arr;
	}

	private static Calendar getValidCalendar(String born) {

		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);

		Date date = null;
		try {
			date = df2.parse(born);
		} catch (ParseException e) {
				try {
					date = df2.parse(born);
				} catch (ParseException e1) {
					try {
						date = df3.parse(born);
					} catch (ParseException e2) {
						SimpleDateFormat smf =new SimpleDateFormat("dd/MM/yyyy");
						System.out.println("Could you please select the date format: ");
						System.out.println("1. dd/MM/yyyy \n2. MM/dd/yyyy \n3. dd-MM-yyyy \n4. MM-dd-yyyy\n5. yyyy/MM/dd \n6.");
						int choice = sc.nextInt();
						sc.nextLine();
						switch(choice) {
						case 1: 
							smf = new SimpleDateFormat("dd/MM/yyyy");
							break;
						case 2: 
							smf = new SimpleDateFormat("MM/dd/yyyy");
							break;
						case 3: 
							smf = new SimpleDateFormat("dd-MM-yyyy");
							break;
						case 4: 
							smf = new SimpleDateFormat("MM-dd-yyyy");
							break;
						default:
							System.out.println("Invalid Choice");
							break;
						}
						try {
							date = smf.parse(born);
						} catch (ParseException e3) {
							System.out.println("Invalid Choice");
							e3.printStackTrace();
						}
						
					}
				}
			
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}

}
