// Gregory Jerian
// Period 5
// Project 5.19
// Expected input is 3 doubles for 3 sides.

import java.util.Scanner;

public class ch5_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program computes the area of a triangle if the input is valid.");
		System.out.print("Enter the lengths of the three sides: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		if (isValid(side1, side2, side3))
			System.out.printf("Area is %.3f", area(side1, side2, side3));
		else
			System.out.println("Invalid input. Sorry!");

	}
	
	/** Return true if the sum of any two sides is
	 * greater than the third side */
	public static boolean isValid(double side1, double side2, double side3) {
		return (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2);
	}
	
	/** Return the area of the triangle */
	public static double area(double side1, double side2, double side3) {
		double s = 0.5 * (side1 + side2 + side3);
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}

}
