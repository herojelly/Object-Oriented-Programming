// Gregory Jerian
// Period 4
// Project 10.5

import java.util.Scanner;
import java.util.Arrays;

public class ch10_5 {

	public static void main(String[] args) {
		// Inputs
		Scanner input = new Scanner(System.in);
		System.out.println("This program displays the smallest factors of a positive integer in decreasing order.");
		System.out.print("Enter a positive integer: ");
		int number = input.nextInt();
		
		// Find number of factors
		int temp = number;
		boolean isPrime = true;
		int numOfPrimes = 0;
		while (temp > 0) {
			for (int i = 2; i <= temp / 2 && isPrime == true; i++) {
				if (temp % i == 0) {
					numOfPrimes++;
					temp = temp/i;
					isPrime = false;
				}	
			}
			if (isPrime) {
				numOfPrimes++;
				temp = 0;
			}
			isPrime = true;
		}
		
		// Put all prime factors in array
		int[] intList = new int[numOfPrimes];
		
		temp = number;
		isPrime = true;
		int count = 0;
		while (temp > 0) {
			for (int i = 2; i <= temp / 2 && isPrime == true; i++) {
				if (temp % i == 0) {
					intList[count] = i;
					count++;
					temp = temp/i;
					isPrime = false;
				}	
			}
			if (isPrime) {
				intList[count] = temp;
				temp = 0;
			}
			isPrime = true;
		}
		
		// Sort array
		Arrays.sort(intList);
		
		// Make and push factors into stack
		StackOfIntegers stack = new StackOfIntegers(numOfPrimes);
		for (int i = 0; i < numOfPrimes; i++) {
			stack.push(intList[i]);
		}
		
		// Pop from stack
		while (!stack.empty())
			System.out.print(stack.pop() + " ");
	}

}
