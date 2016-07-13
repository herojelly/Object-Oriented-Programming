/* Gregory Jerian
 * Period 4
 * Project 3.3
 * Expected inputs are 6 doubles*/

import java.util.Scanner;

public class ch3_3 {

	public static void main(String[] args) {
		// input
		Scanner input = new Scanner(System.in);
		System.out.println("This program solves a 2 X 2 system of linear equation");
		System.out.print("Enter values for a, b, c, d, e, f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		// processing and output
		if ((a * d - b * c) == 0) {
			System.out.println("The equation has no solution.");
		}
		else {
			double x = (e * d - b * f)/(a * d - b * c);
			double y = (a * f - e * c)/(a * d - b * c);
			System.out.println("x is " + x + " and y is " + y);
		}

	}

}
