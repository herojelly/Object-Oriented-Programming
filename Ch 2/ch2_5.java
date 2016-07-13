/* Gregory Jerian
 * Period 4
 * Project 2.5 
 * Expected input is 2 doubles separated by a space.*/

import java.util.Scanner;

public class ch2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program computes the gratuity and total of a meal.");
		System.out.println("Enter the subtotal and a gratuity rate separated by a space:");
		Scanner input = new Scanner(System.in);
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		double gratuity = (gratuityRate/100) * subtotal;
		double total = gratuity + subtotal;
		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);

	}

}
