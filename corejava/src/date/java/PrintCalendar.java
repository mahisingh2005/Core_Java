package date.java;

import java.util.Calendar;
import java.util.Iterator;

public class PrintCalendar {

	public static void main(String[] args) {
		int year = 2026; // change year here
		Calendar cal = Calendar.getInstance();

		String[] months = { "january", "february", "march", "april", "may", "june", "july", "august", "september",
				"october", "november", "december"

		};

		for (int month = 0; month < months.length; month++) {

			// set calendar to first day of the month
			cal.set(year, month, 1);

			System.out.println("\n---------" + months[month] + " " + year + "-------------");
			System.out.println("sun mon tue wed fri sat");

			// find first day of month
			int firstDay = cal.get(Calendar.DAY_OF_WEEK);

			// print leading space
			for (int i = Calendar.SUNDAY; i < firstDay; i++) {
				System.out.println("  ");

			}

			// number of days in month
			int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

			// print dates
			for (int day = 1; day <= maxDay; day++) {
				System.out.printf("%3d ", day);

				if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {

					System.out.println();
				}

				cal.add(Calendar.DAY_OF_MONTH, 1);

			}

			System.out.println();

		}
	}

}
