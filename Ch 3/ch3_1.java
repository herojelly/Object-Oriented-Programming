/* Gregory Jerian
 * Period 4
 * Project 3.1
 * Expected inputs are 3 doubles*/

import java.util.Scanner;

public class ch3_1 {

	public static void main(String[] args) {
		// Get inputs
		Scanner input = new Scanner(System.in);
		System.out.println("This program displays the roots of a quadratic equation.");
		System.out.print("Enter values for a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		// Calculate discriminant, process, and output
		double discriminant = b * b - 4 * a * c;
		if (discriminant > 0){
			double r1 = (-1.0 * b + Math.pow(b * b - 4 * a * c, 0.5)) / (2 * a);
			double r2 = (-1.0 * b - Math.pow(b * b - 4 * a * c, 0.5)) / (2 * a);
			System.out.println("The roots are " + r1 + " and " + r2);
		}
		else if (discriminant == 0){
			double r1 = (-1.0 * b + Math.pow(b * b - 4 * a * c, 0.5)) / (2 * a);
			System.out.println("The root is " + r1);
		}
		else {
			System.out.println("The equation has no real roots.");
		}
		
	}

}
