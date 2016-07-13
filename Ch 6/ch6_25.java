// Gregory Jerian
// Period 4
// Project 6.25
// Expected inputs are 3 doubles

import java.util.Scanner;

public class ch6_25 {

	public static void main(String[] args) {
		// Get inputs
		Scanner input = new Scanner(System.in);
		double[] eqn = new double[3];
		double[] roots = new double[2];
		System.out.println("This program displays the number of roots and the roots"
				+ " of a quadratic equation.");
		System.out.print("Enter values for a, b, c: ");
		for (int count = 0; count < 3; count++)
			eqn[count] = input.nextDouble();
		
		// Print number of roots
		int numOfRoots = solveQuadratic(eqn, roots);
		if (numOfRoots != 1)
			System.out.println("The equation has " + numOfRoots + " roots.");
		else
			System.out.println("The equation has 1 root.");
		
		// Solve for roots
		double a = eqn[0];
		double b = eqn[1];
		double c = eqn[2];
		if (numOfRoots == 2) {
			double r1 = (-1.0 * b + Math.pow(b * b - 4 * a * c, 0.5)) / (2 * a);
			double r2 = (-1.0 * b - Math.pow(b * b - 4 * a * c, 0.5)) / (2 * a);
			System.out.println("The roots are " + r1 + " and " + r2);
		}
		else if (numOfRoots == 1){
			double r1 = (-1.0 * b + Math.pow(b * b - 4 * a * c, 0.5)) / (2 * a);
			System.out.println("The root is " + r1);
		}
		else {
			System.out.println("The equation has no real roots.");
		}	
		
	}
	
	public static int solveQuadratic(double[] eqn, double[] roots) {
		double a = eqn[0];
		double b = eqn[1];
		double c = eqn[2];
		double discriminant = b * b - 4 * a * c;
		if (discriminant > 0)
			return 2;
		else if (discriminant == 0)
			return 1;
		else
			return 0;
	}

}
