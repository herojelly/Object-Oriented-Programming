// Gregory Jerian
// Period 4
// Project 6.21
// Expected inputs are two ints

import java.util.Scanner;

public class ch6_21 {

	public static void main(String[] args) {
		// Inputs
		Scanner input = new Scanner(System.in);
		System.out.println("This program simulates a bean machine.");
		System.out.print("Enter the number of balls to drop: ");
		int numBalls = input.nextInt();
		System.out.print("Enter the number of slots in the bean machine: ");
		int numSlots = input.nextInt();
		System.out.println();
		
		int[] slots = new int[numSlots];
		// Cycles through all balls
		for (int i = 0; i < numBalls; i++) {
			// Makes the directions for the path of the ball (L's and R's)
			char[] direction = new char[numSlots];
			for (int count = 0; count < numSlots - 1; count++) {
				int randomNum = (int)(Math.random() * 2);
				if (randomNum == 0) {
					direction[count] = 'L';
				}
				else {
					direction[count] = 'R';
				}
			}
			
			// Prints the path of the ball (L's and R's)
			for (int count = 0; count < direction.length - 1; count++)
				System.out.print(direction[count]);
			System.out.println();	
			
			// Finds the slot that the ball falls into (index of slots)
			int slotCounter = 0;
			for (int count = 0; count < direction.length - 1; count++) {
				if (direction[count] == 'R')
					slotCounter++;
			}
			slots[slotCounter] += 1;
		}
		
		// Finds the slot with the maximum amount of balls in it
		System.out.println();
		int max = slots[0];
		for (int count = 0; count < slots.length; count++){
			if (slots[count] > max) {
				max = slots[count];
			}
		}
		
		// Prints O's and spaces to create the histogram
		for (int count = max; count >= 1; count--) {
			for (int j = 0; j < slots.length; j++){
				if (slots[j] >= count)
					System.out.print("O");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
