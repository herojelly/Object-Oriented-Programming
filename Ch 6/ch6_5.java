// Gregory Jerian
// Period 4
// Project 6.5
// Expected input is 10 ints.

import java.util.Scanner;

public class ch6_5 {

	public static void main(String[] args) {
		// Initialize scanner and arrays
		Scanner input = new Scanner(System.in);
		int[] myArray = new int[10];
		int[] array2 = new int[10];
		
		// Gets inputs
		System.out.println("This program reads 10 numbers and displays distinct numbers.");
		System.out.print("Enter in 10 numbers: ");
		for (int count = 0; count < 10; count++) {
			myArray[count] = input.nextInt();
		}
		
		// Checks array
		boolean match = false;
		for (int count = 0; count < 10 && match == false; count++) {
			for (int count2 = count + 1; count2 < 10; count2++) {
				if (myArray[count2] == myArray[count]) {
					match = true;
				}
			}
			if (match == false)
				array2[count] = myArray[count];
			match = false;
		}
		
		// Prints output
		System.out.print("The distinct numbers are: ");
		for (int count = 0; count < 10; count ++) {
			if (array2[count] != 0)
				System.out.print(array2[count] + " ");
		}
	}

}
