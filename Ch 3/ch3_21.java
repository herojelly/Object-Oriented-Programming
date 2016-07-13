/* Gregory Jerian
 * Project 3.21
 * Period 4
 * Expected inputs are an int for year, an int for month 1-12, and an int for day 1-31.*/

import java.util.Scanner;

public class ch3_21 {

	public static void main(String[] args) {
		// Inputs
		String dayOfWeek = "Error";
		Scanner input = new Scanner(System.in);
		System.out.println("This program displays the name of the day of the week.");
		System.out.print("Enter year (e.g., 2012): ");
		int year = input.nextInt();
		System.out.print("Enter month: 1-12: ");
		int month = input.nextInt();
		System.out.print("Enter the day of the month: 1-31: ");
		int day = input.nextInt();
		
		if (month == 1) {
			month = 13;
			year = year - 1;
		}
		if (month == 2) {
			month = 14;
			year = year - 1;
		}
		
		int q = day;
		int m = month;
		int j = year / 100;
		int k = year % 100;
		
		int h = (q + (26 * (m + 1)) / 10 + k + k/4 + j/4 + 5 * j) % 7;
		
		switch (h) {
		case 0: dayOfWeek = "Saturday"; break;
		case 1: dayOfWeek = "Sunday"; break;
		case 2: dayOfWeek = "Monday"; break;
		case 3: dayOfWeek = "Tuesday"; break;
		case 4: dayOfWeek = "Wednesday"; break;
		case 5: dayOfWeek = "Thursday"; break;
		case 6: dayOfWeek = "Friday"; break;
		}
		
		System.out.println("Day of the week is " + dayOfWeek);

	}

}
