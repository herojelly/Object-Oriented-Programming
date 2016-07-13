// Gregory Jerian
// Period 4
// Project 4.31
// Expected inputs are 3 doubles.

import java.util.Scanner;

public class ch4_31 {

	public static void main(String[] args) {
		// Inputs
		Scanner input = new Scanner(System.in);
		System.out.println("This program displays the value of a CD over a certain amount of months.");
		System.out.print("Enter the initial deposit amount: ");
		double initialDeposit = input.nextDouble();
		System.out.print("Enter annual percentage yield: ");
		double percentYield = input.nextDouble();
		System.out.print("Enter maturity period (number of months): ");
		double numOfMonths = input.nextDouble();
		
		// Outputs
		System.out.println();
		System.out.printf("%-6s %-6s \n", "Month", "CD Value");
		double currentValue = initialDeposit;
		for (int count = 1; count <= numOfMonths; count++){
			currentValue += currentValue * percentYield / 1200;
			System.out.printf("%-6d %-6.2f \n", count, currentValue);
		}
		
	}

}
