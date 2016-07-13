// Gregory Jerian
// Period 4
// Project 6.1
// Expected inputs are an int for number of students and doubles for the scores.

import java.util.Scanner;

public class ch6_1 {

	public static void main(String[] args) {
		// Inputs
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numStudents = input.nextInt();
		System.out.print("Enter " + numStudents + " scores: ");
		double[] studentList = new double[numStudents];
		for (int count = 0; count < numStudents; count++) {
			studentList[count] = input.nextDouble();
		}
		
		// Gets the maximum of the array.
		double best = 0;
		for (int count = 0; count < numStudents; count++) {
		    if (studentList[count] > best)
		    	best = studentList[count];
		}
		
		// Assigns grades.
		for (int count = 0; count < numStudents; count++) {
			if (studentList[count] >= best - 10)
				System.out.println("Student " + count + " score is " + studentList[count] +
						" and grade is A");
			else if (studentList[count] >= best - 20)
				System.out.println("Student " + count + " score is " + studentList[count] +
						" and grade is B");
			else if (studentList[count] >= best - 30)
				System.out.println("Student " + count + " score is " + studentList[count] +
						" and grade is C");
			else if (studentList[count] >= best - 40)
				System.out.println("Student " + count + " score is " + studentList[count] +
						" and grade is D");
			else
				System.out.println("Student " + count + " score is " + studentList[count] +
						" and grade is F");
		}
		
	}

}
