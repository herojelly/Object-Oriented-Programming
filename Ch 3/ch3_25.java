/* Gregory Jerian
 * Project 3.25
 * Period 4
 * Expected inputs are 8 doubles. */

import java.util.Scanner;

public class ch3_25 {

	public static void main(String[] args) {
		// Inputs
		Scanner input = new Scanner(System.in);
		System.out.println("This program finds the interesction of 2 lines.");
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, and y4: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		
		// Calculations
		double a = y1 - y2;
		double b = -1 * (x1 - x2);
		double c = y3 - y4;
		double d = -1 * (x3 - x4);
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;
		double x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);
		
		// Slope
		double slope1 = (y2 - y1) / (x2 - x1);
		double slope2 = (y4 - y3) / (x4 - x3);
		
		if (slope1 == slope2)
			System.out.println("The two lines are parallel");
		else
			System.out.println("The interesecting point is at (" + x + " , " + y + ")");
	}

}
