/* Gregory Jerian
 * Period 4
 * Project 4.1
 * Expected inputs are any number of integers. */

import java.util.Scanner;

public class ch4_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, numOfPos = 0, numOfNeg = 0, total = 0, count = 0;
		// Inputs
		System.out.println("This program finds data about an unspecified number of integers.");
		System.out.print("Enter any number of integers, the input ends if it is 0: ");
		num = input.nextInt();
		if (num == 0)
			System.out.println("No numbers are entered except 0");
		else {
			do {
				total += num;
				count++;
				if (num > 0)
					numOfPos++;
				else
					numOfNeg++;
				num = input.nextInt();
				} while (num != 0);
			System.out.println("The number of positives is " + numOfPos);
			System.out.println("The number of negatives is " + numOfNeg);
			System.out.println("The total is " + total);
			System.out.println("The average is " + total/ (double)count);
		}

	}

}
