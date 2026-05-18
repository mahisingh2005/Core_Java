package date.java;

import java.util.Calendar;
import java.util.Date;

public class Maintainance {

	public static void main(String[] args) {
		
		//ye sirf 30 date baad ki date batayega
		/*
		 * Calendar cal = Calendar.getInstance(); for (int i = 1; i <= 12; i++) {
		 * cal.add(Calendar.DATE, 30);
		 * 
		 * Date nextEvent = cal.getTime();
		 * 
		 * System.out.println(nextEvent);
		 * 
		 */			
			
		
		
		//ye next mont ki same date batayega kyuki kisi month me 31 or 30 days hote hai
			 Calendar cal = Calendar.getInstance();

		        for (int i = 1; i <= 12; i++) {

		            cal.add(Calendar.MONTH, 1);

		            Date nextEvent = cal.getTime();

		            System.out.println(nextEvent);
		}
	}

}
