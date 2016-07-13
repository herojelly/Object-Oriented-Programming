/* Gregory Jerian
 * Project 3.23
 * Period 4
 * Expected input is 2 doubles representing a point with 2 coordinates. */

import java.util.Scanner;

public class ch3_23 {

	public static void main(String[] args) {
		// Inputs
		boolean inTheRectangle = true;
		Scanner input = new Scanner(System.in);
		System.out.println("This program checks if a point is in a rectangle centered at (0,0) with width 10 and height 5.");
		System.out.print("Enter a point with two coordinates in form x y: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		//
		if (x < -5 || x > 5)
			inTheRectangle = false;
		if (y < -2.5 || y > 2.5)
			inTheRectangle = false;
		
		if (inTheRectangle == true)
			System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
		else
			System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
	}

}
