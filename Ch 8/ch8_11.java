// Gregory Jerian
// Period 4
// Project 8.11

import java.util.Scanner;

public class ch8_11 {

	public static void main(String[] args) {
		// Inputs
		Scanner input = new Scanner(System.in);
		System.out.println("This program solves a system of equations.");
		System.out.print("Enter values for a, b, c, d, e, and f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		// Process
		LinearEquation object = new LinearEquation(a, b, c, d, e, f);
		double x = object.getX();
		double y = object.getY();
		boolean isSolvable = object.isSolvable();
		
		// Output
		if (isSolvable)
			System.out.println("Solution: (" + x + ", " + y + ")");
		else
			System.out.println("The equation has no solution.");

	}

}
