// Gregory Jerian
// Period 4
// Project 4.21
// Expected inputs are double for loan amount and int for number of years.

import java.util.Scanner;

public class ch4_21 {

	public static void main(String[] args) {
		// Inputs
		Scanner input = new Scanner(System.in);
		System.out.println("this program finds the payments of a loan at several different interest rates.");
		System.out.print("Enter loan amount, e.g., 120000.95: ");
		double loanAmount = input.nextDouble();
		System.out.print("Enter number of years as an integer, e.g., 5: ");
		int numberOfYears = input.nextInt();
		System.out.println();
		
		// Display Chart
		System.out.printf("%-20s %-20s %-20s \n", "Interest Rate (%)", "Monthly Payment", "Total Payment");
		double annualInterestRate = 5.0;
		for (int count = 0; count <= 24; count ++) {
			double monthlyInterestRate = annualInterestRate/1200;
			double monthlyPayment = loanAmount * monthlyInterestRate / (1
					- 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
			double totalPayment = monthlyPayment * numberOfYears * 12;
			System.out.printf("%-20.3f %-20.2f %-20.2f \n", annualInterestRate, monthlyPayment, totalPayment);
			annualInterestRate += 1.0/8;
		}

	}

}
