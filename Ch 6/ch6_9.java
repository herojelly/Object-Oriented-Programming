// Gregory Jerian
// Period 4
// Project 6.9
// Expected input is 10 doubles.

import java.util.Scanner; // Import scanner

public class ch6_9 {

	public static void main(String[] args) {
		// Intro
		System.out.println("This program finds the smallest element in an array of doubles.");
		Scanner input = new Scanner(System.in); 		// Create the scanner object
		double doubles[] = new double [10]; 			// Initialize array
		
		// Get inputs
		System.out.print("Enter ten numbers: ");
		for (int count = 0; count < 10; count++) {
			doubles[count] = input.nextDouble();
		}
		
		// Print outputs
		System.out.println("The minimum number is: " + min(doubles));

	}
	
	public static double min(double[] array) {
		double min = array[0];
		for (int count = 0; count < 10; count++) {
			min = Math.min(array[count], min);
		}
		return min;
	}

}
