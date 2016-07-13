// Gregory Jerian
// Period 4
// Project 5.5
// Expected input is three numbers (doubles).

import java.util.Scanner;

public class ch5_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program displays three numbers in increasing order.");
		System.out.print("Enter three numbers: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		displaySortedNumbers(num1, num2, num3);

	}
	
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		double min, mid, max;
		if (num1 < num2 && num1 < num3) {
			min = num1;
			mid = Math.min(num2, num3);
			max = Math.max(num2, num3);
		}
		else if (num2 < num1 && num2 < num3) {
			min = num2;
			mid = Math.min(num1, num3);
			max = Math.max(num1, num3);
		}
		else {
			min = num3;
			mid = Math.min(num1, num2);
			max = Math.max(num1, num2);
		}
		System.out.println(min + " " + mid + " " + max);
		
	}

}
