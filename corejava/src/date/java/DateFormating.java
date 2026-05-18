package date.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormating {
	public static void main(String[] args) throws ParseException {

		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("default format date : " + d);
		String s = sdf.format(d);
		System.out.println("formate date : " + s);
		System.out.println("---------------");
		String dob = "2005-10-01";
		
		System.out.println("String dob:" + dob);
		
		Date date = sdf.parse(dob);
	//String c =	sdf.format(date);
	
		
		System.out.println("date dob : "+ date);
		
		


	}

}
