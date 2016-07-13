/* Gregory Jerian
 * Period 4
 * Project 2.7 
 * Expected input is an int*/

import java.util.Scanner;

public class ch2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program displays the number of years and days for a number of minutes.");
		System.out.println("Enter the number of minutes:");
		Scanner input = new Scanner(System.in);
		int minutes = input.nextInt();
		int years = (int) (minutes * 1/60.0 * 1/24.0 * 1/365.0);
		int days = (int) ((minutes * 1/60.0 * 1/24.0) - (years * 365.0));
		System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");

	}

}
