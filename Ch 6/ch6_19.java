// Gregory Jerian
// Period 4
// Project 6.19
/** Expected input: first integer is the number of elements in the list,
  * followed by the the integers in the list. */

import java.util.Scanner;
import java.util.Arrays;

public class ch6_19 {

	public static void main(String[] args) {
		// Intro and Inputs
		Scanner input = new Scanner(System.in);
		System.out.println("This program checks if a list is sorted in increasing order.");
		System.out.print("Enter the number of elements in the list followed by "
				+ "the integers in the list: ");
		int length = input.nextInt();
		int[] list = new int[length];
		for (int count = 0; count < length; count++) {
			list[count] = input.nextInt();
		}
		
		// Outputs
		boolean isSorted = isSorted(list);
		if (isSorted)
			System.out.println("The list is already sorted");
		else
			System.out.println("The list is not sorted");
	}
	
	public static boolean isSorted(int[] list) {
		int[] list2 = new int[list.length];
		for (int count = 0; count < list.length; count++)
			list2[count] = list[count];
		Arrays.sort(list);
		for (int count = 0; count < list.length; count++) {
			if (list[count] != list2[count])
				return false;
		}
		return true;
	}

}
