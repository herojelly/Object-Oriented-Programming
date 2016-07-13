// Gregory Jerian
// Period 4
// Project 4.9
// ---------------------------------------------------------------
// Expected inputs are an int for number of students,
// strings for student names, and ints for student scores.

import java.util.Scanner;

public class ch4_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program finds the two highest scores of a list of students.");
		System.out.print("Enter the number of students: ");
		int numOfStudents = input.nextInt();
		
		int mediumScore = 0, highScore = 0, newScore = 0;
		String mediumScoreName = "N/A", highScoreName = "N/A", newName = "N/A";
		for (int count = 0; count != numOfStudents; count++) {
			System.out.print("Enter one student's name and score: ");
			newName = input.next();
			newScore = input.nextInt();
			
			if (newScore > highScore) {
				mediumScore = highScore;
				mediumScoreName = highScoreName;
				highScore = newScore;
				highScoreName = newName;
			}
			
			else if (newScore > mediumScore) {
				mediumScore = newScore;
				mediumScoreName = newName;
			}
			
		}
		
		System.out.println("The highest score is " + highScoreName + " with a high score of " + highScore);
		System.out.println("The second highest score is " + mediumScoreName + " with a score of " + mediumScore);

	}

}
