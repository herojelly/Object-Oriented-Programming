// Gregory Jerian
// Period 4
// Project 6.17
/** Expected input is as follows:
 * 	1. Integer for number of students
 *  2. The list of students' names (strings)
 *  3. The list of students' scores (doubles) */

import java.util.Scanner;

public class ch6_17 {

	public static void main(String[] args) {
		// Intro
		Scanner input = new Scanner(System.in);
		System.out.println("This program sorts students based on their scores.");
		
		// Input number of students
		System.out.print("Enter the number of students: ");
		int numOfStudents = input.nextInt();
		
		// Input student names
		String[] studentNames = new String[numOfStudents];
		System.out.print("Enter the list of student names: ");
		for (int count = 0; count < numOfStudents; count++)
			studentNames[count] = input.next();
		
		// Input student scores
		double[] scores = new double[numOfStudents];
		System.out.print("Enter the corresponding list of student scores: ");
		for (int count = 0; count < numOfStudents; count++)
			scores[count] = input.nextDouble();
		
		// Sorts the scores
		for (int count = 0; count < numOfStudents; count++) {
			for (int count2 = count + 1; count2 < numOfStudents; count2++) {
				// If the score is less than scores after it in the list
				if (scores[count] < scores[count2]) {
					// Swaps the scores
					double temp = scores[count2];
					scores[count2] = scores[count];
					scores[count] = temp;
					// Swaps the names
					String temp2 = studentNames[count2];
					studentNames[count2] = studentNames[count];
					studentNames[count] = temp2;
				}
			}
		}
		
		// Outputs scores
		System.out.println();
		for (int count = 0; count < numOfStudents; count++)
			System.out.println(studentNames[count] + " " + scores[count]);

	}

}
