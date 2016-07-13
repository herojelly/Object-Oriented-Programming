// Gregory Jerian
// Period 4
// Project 5.7
// Expected inputs are the amount invested and the annual interest rate as doubles.

import java.util.Scanner;

public class ch5_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program computes future investment value.");
		System.out.print("Enter the amount invested in dollars: ");
		double investmentAmount = input.nextDouble();
		System.out.print("Enter the annual interest rate in percent (e.g. 9 for 9%): ");
		double annualInterestRate = input.nextDouble();
		double monthlyInterestRate = (annualInterestRate / 100.0)/12.0;
		
		System.out.println();
		System.out.printf("%-10s %10s \n", "Years", "Future Value");
		for (int years = 1; years <= 30; years++){
			double futureInvestmentValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, years);
			System.out.printf("%-10d %10.2f \n", years, futureInvestmentValue);
		}
		
	}
	
	public static double futureInvestmentValue(
			double investmentAmount, double monthlyInterestRate, int years) {
		double futureInvestmentValue = investmentAmount * 
				Math.pow((1 + monthlyInterestRate), years * 12);
		return futureInvestmentValue;
	}

}
