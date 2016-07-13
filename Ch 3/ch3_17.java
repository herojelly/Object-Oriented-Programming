/* Gregory Jerian
 * Period 4
 * Project 3.17
 * Input is an int between 0 and 2*/

import java.util.Scanner;

public class ch3_17 {

	public static void main(String[] args) {
		// Inputs
		String computerValueStr = "Error", userValueStr = "Error";
		Scanner input = new Scanner(System.in);
		System.out.println("This program simulates a game of rock paper scissors.");
		System.out.print("Enter a value. scissor (0), rock (1), paper (2): ");
		int userValue = input.nextInt();
		int computerValue = (int)(Math.random() * 3);
		
		// assigns names to the numeric values
		if (computerValue == 0)
			computerValueStr = "scissor";
		else if (computerValue == 1)
			computerValueStr = "rock";
		else if (computerValue == 2)
			computerValueStr = "paper";
		if (userValue == 0)
			userValueStr = "scissor";
		else if (userValue == 1)
			userValueStr = "rock";
		else if (userValue == 2)
			userValueStr = "paper";
			
		// figures out who won
		if (computerValueStr == "scissor") {
			if (userValueStr == "scissor")
				System.out.println("The computer is scissor. You are scissor too. It is a draw.");
			else if (userValueStr == "rock")
				System.out.println("The computer is scissor. You are rock. You win.");
			else if (userValueStr == "paper")
				System.out.println("The computer is scissor. You are paper. The computer wins.");
			else
				System.out.println("Invalid input. Enter a number between 0 and 2.");
		}
		else if (computerValueStr == "rock") {
			if (userValueStr == "scissor")
				System.out.println("The computer is rock. You are scissor. The computer wins.");
			else if (userValueStr == "rock")
				System.out.println("The computer is rock. You are rock. It is a draw.");
			else if (userValueStr == "paper")
				System.out.println("The computer is rock. You are paper. You win.");
			else
				System.out.println("Invalid input. Enter a number between 0 and 2.");
		}
		else if (computerValueStr == "paper") {
			if (userValueStr == "scissor")
				System.out.println("The computer is paper. You are scissor. You win.");
			else if (userValueStr == "rock")
				System.out.println("The computer is paper. You are rock. The computer wins.");
			else if (userValueStr == "paper")
				System.out.println("The computer is paper. You are paper. It is a draw.");
			else
				System.out.println("Invalid input. Enter a number between 0 and 2.");
		}
			
	}

}
