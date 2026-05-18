package date.java;

import java.time.LocalDate;
import java.time.Period;

public class TestTimePeriod {
	
	public static void main(String[] args) {
		LocalDate todayDate = LocalDate.now();
		System.out.println("todays date : " + todayDate);
		
		LocalDate birthdate = LocalDate.of(2001, 01, 25);
		
		System.out.println("your birth date " + birthdate);
		
		Period period = Period.between(todayDate, birthdate);
		
		System.out.println(period.getYears() + "year " + period.getMonths() + "month" + period.getDays() + "days ");
	}

}
