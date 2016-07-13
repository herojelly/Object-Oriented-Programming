// Gregory Jerian
// Period 4
// Project 6.27
// Expected input is 2 lists of integers (First number indicates number of elements in list)

import java.util.Scanner;

public class ch6_27 {

	public static void main(String[] args) {
		// Intro
		Scanner input = new Scanner(System.in);
		System.out.println("This program compares two lists of integers.");
		
		// Enter list 1
		System.out.print("Enter list1 (First number indicates number of elements in list): ");
		int length1 = input.nextInt();
		int[] list1 = new int[length1];
		for (int count = 0; count < length1; count++)
			list1[count] = input.nextInt();
		
		// Enter list 2
		System.out.print("Enter list2 (First number indicates number of elements in list): ");
		int length2 = input.nextInt();
		int[] list2 = new int[length2];
		for (int count = 0; count < length2; count++)
			list2[count] = input.nextInt();
		
		// Output
		if (equals(list1, list2))
			System.out.println("Two lists are strictly identical");
		else
			System.out.println("Two lists are not strictly identical");
	}
	
	public static boolean equals(int[] list1, int[] list2) {
		if (list1.length != list2.length)
			return false;
		else {
			for (int count = 0; count < list1.length; count++) {
				if (list1[count] != list2[count])
					return false;
			}
			return true;
		}
	}

}
