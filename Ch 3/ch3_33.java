/* Gregory Jerian
 * Project 3.33
 * Period 4
 * Expected inputs are 2 sets of 2 doubles. */

import java.util.Scanner;

public class ch3_33 {

	public static void main(String[] args) {
		// Inputs
		Scanner input = new Scanner(System.in);
		System.out.println("This program compares the costs of two packages of rice.");
		System.out.print("Enter the weight and price for package 1: ");
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		System.out.print("Enter the weight and price for package 2: ");
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
		
		// find the rate of cost per unit of weight
		double priceRate1 = price1/weight1;
		double priceRate2 = price2/weight2;
		
		// compares the rates to find the cheapest package
		if (priceRate1 < priceRate2)
			System.out.println("Package 1 has a better price.");
		else if (priceRate1 == priceRate2)
			System.out.println("The packages cost the same.");
		else
			System.out.println("Package 2 has a better price.");

	}

}
