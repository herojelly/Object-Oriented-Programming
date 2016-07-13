/* Gregory Jerian
 * Period 4
 * Project 3.5
 * Expected input is 2 ints*/

import java.util.Scanner;

public class ch3_5 {

	public static void main(String[] args) {
		// Inputs
		String todayStr = "null", futureDayStr = "null";
		Scanner input = new Scanner(System.in);
		System.out.println("This program calculates a future day given the number of days elapsed.");
		System.out.print("Enter an integer for today's day (Sunday is 0, Monday is 1... Saturday is 6): ");
		int today = input.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		int daysElapsed = input.nextInt();
		int futureDay = daysElapsed + today;
		
		// Finds today
		if (today == 0) {
			todayStr = "Sunday";
		}
		else if (today == 1) {
			todayStr = "Monday";
		}
		else if (today == 2) {
			todayStr = "Tuesday";
		}
		else if (today == 3) {
			todayStr = "Wednesday";
		}
		else if (today == 4) {
			todayStr = "Thursday";
		}
		else if (today == 5) {
			todayStr = "Friday";
		}
		else if (today == 6) {
			todayStr = "Saturday";
		}
		
		// Finds future day
		if (futureDay % 7 == 0) {
			futureDayStr = "Sunday";
		}
		else if (futureDay % 7 == 1) {
			futureDayStr = "Monday";
		}
		else if (futureDay % 7 == 2) {
			futureDayStr = "Tuesday";
		}
		else if (futureDay % 7 == 3) {
			futureDayStr = "Wednesday";
		}
		else if (futureDay % 7 == 4) {
			futureDayStr = "Thursday";
		}
		else if (futureDay % 7 == 5) {
			futureDayStr = "Friday";
		}
		else if (futureDay % 7 == 6) {
			futureDayStr = "Saturday";
		}
		
		// Output
		System.out.println("Today is " + todayStr + " and the future day is " + futureDayStr);
	}
	
}
