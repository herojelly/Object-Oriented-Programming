// Gregory Jerian
// Period 4
// Project 6.13
// Expected inputs are all integers.

import java.util.Scanner;

public class ch6_13 {

	public static void main(String[] args) {
		// Intro
		Scanner input = new Scanner(System.in);
		System.out.println("This program finds a random number between 1 and 54, excluding user-inputted exceptions.");
		
		// Input length of array
		System.out.print("How many exceptions do you want to enter? : ");
		int length = input.nextInt();
		int[] numbers = new int[length];	// Initialize array
		
		// Input exceptions
		System.out.print("Enter in the exceptions: ");
		for (int count = 0; count < length; count++) {
			numbers[count] = input.nextInt();
		}
		
		// Print output
		System.out.println(getRandom(numbers));
		
	}
	
	public static int getRandom(int... numbers) {
		int randomNum = 0;
		while (true) {
			randomNum = 1 + (int)(Math.random() * 54);
			for (int count = 0; count < numbers.length; count++) {
				if (randomNum == numbers[count])
					break;
				if (count == numbers.length - 1)
					return randomNum;
			}
		
		}
		
	}

}
