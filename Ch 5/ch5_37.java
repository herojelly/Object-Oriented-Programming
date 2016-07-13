// Gregory Jerian
// Period 4
// Project 5.37
// Expected inputs are two integers

import java.util.Scanner;

public class ch5_37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program formats an integer to a specific width.");
		System.out.print("Enter in the number to be formatted: ");
		int number = input.nextInt();
		System.out.print("Enter the width to be formatted to: ");
		int width = input.nextInt();
		System.out.println(format(number, width));
		
	}
	
	public static String format (int number, int width) {
		String numberString = "" + number;
		int stringLength = numberString.length();
		String newString = "";
		for (int count = 0; count < width - stringLength; count++) {
			newString += "0";
		}
		newString += number;
		return newString;
	}

}
