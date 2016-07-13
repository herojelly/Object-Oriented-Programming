// Gregory Jerian
// Period 4
// Project 11.9

import java.util.Scanner;
import java.util.ArrayList;

public class ch11_9 {

	public static void main(String[] args) {
		// Initialize n
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the array size n: ");
		final int n = input.nextInt();
		
		// Initialize two ArrayLists: rows and columns
		ArrayList<Integer> rows = new ArrayList<>();
		ArrayList<Integer> columns = new ArrayList<>();
		
		// Add blank indices to the ArrayLists
		for (int i = 0; i < n; i++) {
			rows.add(0);
			columns.add(0);
		}
		
		/** Prints the matrix */
		System.out.println("The random array is");
		for (int i = 0; i < n; i++) { // First for loop is the number of rows
			for (int j = 0; j < n; j++) { // Second for loop is the number of columns
				int randomNum = (int)(Math.random() * 2);
				System.out.print(randomNum);
				if (randomNum == 1) {
					rows.set(i, rows.get(i) + 1);
					columns.set(j, columns.get(j) + 1);
				}
					
			}
			
			System.out.println();
		}
		
		// Finds and prints largest row index and column index
		System.out.print("The largest row index: ");
		int max = 0;
		for (int i = 0; i < n; i++) { // Finds max num of ones in any row
			if (rows.get(i) > max)
				max = rows.get(i);
		}
		for (int i = 0; i < n; i++) { // Prints all indices with that number of ones
			if (rows.get(i) == max)
				System.out.print(i + " ");
		}
		
		System.out.print("\nThe largest column index: ");
		max = 0;
		for (int i = 0; i < n; i++) {
			if (columns.get(i) > max)
				max = columns.get(i);
		}
		for (int i = 0; i < n; i++) {
			if (columns.get(i) == max)
				System.out.print(i + " ");
		}

	}

}
