/* Gregory Jerian
 * Period 4
 * Project 2.21 
 * Expected input is 3 doubles*/

import java.util.Scanner;

public class ch2_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program displays a future investment value.");
		System.out.println("Enter an investment amount: ");
		Scanner input = new Scanner(System.in);
		double investmentAmount = input.nextDouble();
		System.out.println("Enter annual interest rate in percentage: ");
		double annualInterestRate = input.nextDouble();
		System.out.println("Enter number of years: ");
		double numberOfYears = input.nextDouble();
		double monthlyInterestRate = (annualInterestRate / 100.0)/12.0;
		double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), numberOfYears * 12);
		System.out.println("Accumulated value is $" + ((int)(futureInvestmentValue * 100))/100.0);

	}

}
