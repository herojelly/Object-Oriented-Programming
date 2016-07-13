// Gregory Jerian
// Period 4
// Project 8.5

import java.util.GregorianCalendar;

public class ch8_5 {

	public static void main(String[] args) {
		GregorianCalendar object = new GregorianCalendar();
		int year = object.get(GregorianCalendar.YEAR);
		int month = object.get(GregorianCalendar.MONTH) + 1;
		int day = object.get(GregorianCalendar.DAY_OF_MONTH);
		
		System.out.println("Current year, month, and day: " + year + " " + month + " " + day);
		
		object.setTimeInMillis(1234567898765L);
		year = object.get(GregorianCalendar.YEAR);
		month = object.get(GregorianCalendar.MONTH) + 1;
		day = object.get(GregorianCalendar.DAY_OF_MONTH);
		System.out.println("Year, month, and day of 1234567898765L: " + year + " " + month + " " + day);
	}

}
