/* Gregory Jerian
 * Period 4
 * Project 2.13
 * Expected input is an string followed by 4 numbers*/

import java.util.Scanner;

public class ch2_13 {

	public static void main(String[] args) {
		System.out.println("This program displays an account value after the sixth month.");
		System.out.println("Enter the monthly saving amount: ");
		Scanner input = new Scanner(System.in);
		double savingAmount = input.nextDouble();
		double newSavingAmount = savingAmount * (1 + 0.05/12);
		newSavingAmount = (newSavingAmount + savingAmount) * (1 + 0.05/12);
		newSavingAmount = (newSavingAmount + savingAmount) * (1 + 0.05/12);
		newSavingAmount = (newSavingAmount + savingAmount) * (1 + 0.05/12);
		newSavingAmount = (newSavingAmount + savingAmount) * (1 + 0.05/12);
		newSavingAmount = (newSavingAmount + savingAmount) * (1 + 0.05/12);
		System.out.println("After the sixth month, the account value is $" + ((int)(newSavingAmount * 100))/100.0);

	}

}
