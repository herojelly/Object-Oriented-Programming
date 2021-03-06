/* Gregory Jerian
 * Project 3.9
 * Period 4
 * Expected input is one 9-digit integer */

import java.util.Scanner;

public class ch3_9 {

	public static void main(String[] args) {
		// inputs
		Scanner input = new Scanner(System.in);
		int nineDigitNum, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10;
		System.out.println("This program displays a 10-digit ISBN.");
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		nineDigitNum = input.nextInt();
		
		// assigns each digit of the ISBN to its own variable
		d1 = nineDigitNum / 100000000;
		d2 = nineDigitNum / 10000000 - d1 * 10;
		d3 = nineDigitNum / 1000000 - d1 * 100 - d2 * 10;
		d4 = nineDigitNum / 100000 - d1 * 1000 - d2 * 100 - d3 * 10;
		d5 = nineDigitNum / 10000 - d1 * 10000 - d2 * 1000 - d3 * 100 - d4 * 10;
		d6 = nineDigitNum / 1000 - d1 * 100000 - d2 * 10000 - d3 * 1000 - d4 * 100 - d5 * 10;
		d7 = nineDigitNum / 100 - d1 * 1000000 - d2 * 100000 - d3 * 10000 - d4 * 1000 - d5 * 100 - d6 * 10;
		d8 = nineDigitNum / 10 - d1 * 10000000 - d2 * 1000000 - d3 * 100000 - d4 * 10000 - d5 * 1000 - d6 * 100 - d7 * 10;
		d9 = nineDigitNum - d1 * 100000000 - d2 * 10000000 - d3 * 1000000 - d4 * 100000 - d5 * 10000 - d6 * 1000 - d7 * 100 - d8 * 10;
		
		// calculates the 10th digit of the ISBN
		d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		
		// calculates and outputs the ISBN
		if (d10 == 10)
			System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
		else
			System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
		
	}

}
