/* Gregory Jerian
 * Project 3.19
 * Period 4
 * Expected inputs are 3 doubles*/

import java.util.Scanner;

public class ch3_19 {

	public static void main(String[] args) {
		// Input
		Scanner input = new Scanner(System.in);
		System.out.println("This program computes the perimeter of a triangle.");
		System.out.print("Enter the three edges of the triangle: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		// Sees if input is valid
		if (a + b > c) {
			if (b + c > a) {
				if (c + a > b) {
					// calculates the perimeter
					double perimeter = a + b + c;
					System.out.println("The perimeter is " + perimeter);
				}
				else
					System.out.println("Invalid input.");
			}
			else
				System.out.println("Invalid input.");
		}
		else
			System.out.println("Invalid input.");
			
	}

}
