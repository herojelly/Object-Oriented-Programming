// Gregory Jerian
// Period 4
// Project 6.15
// Expected input is 10 integers.

import java.util.Scanner;

public class ch6_15 {

	public static void main(String[] args) {
		// Initialize scanner and arrays
		Scanner input = new Scanner(System.in);
		int[] myArray = new int[10];
				
		// Gets inputs
		System.out.println("This program reads 10 numbers and displays distinct numbers.");
		System.out.print("Enter in 10 numbers: ");
		for (int count = 0; count < 10; count++) {
			myArray[count] = input.nextInt();
		}
		
		// Gets output
		int[] array2 = eliminateDuplicates(myArray);
		System.out.print("The distinct numbers are: ");
		for (int count = 0; count < 10; count ++) {
			if (array2[count] != 0)
				System.out.print(array2[count] + " ");
		}

	}
	
	public static int[] eliminateDuplicates(int[] list) {
		int[] list2 = new int[10];
		boolean match = false;
		for (int count = 0; count < 10 && match == false; count++) {
			for (int count2 = count + 1; count2 < 10; count2++) {
				if (list[count2] == list[count]) {
					match = true;
				}
			}
			if (match == false)
				list2[count] = list[count];
			match = false;
		}
		return list2;
	}

}
