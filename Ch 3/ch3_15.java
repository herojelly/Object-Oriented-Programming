/* Gregory Jerian
 * Project 3.15
 * Period 4
 * Expected input is a three digit int*/

import java.util.Scanner;

public class ch3_15 {

	public static void main(String[] args) {
		// Generate a lottery number
		int lottery = (int)(Math.random() * 1000);
		
		// Prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (three digits): ");
		int guess = input.nextInt();
		
		// Get digits from lottery
		int lotteryDigit1 = lottery / 100;
		int lotteryDigit2 = lottery / 10 - lotteryDigit1 * 10;
		int lotteryDigit3 = lottery - lotteryDigit1 * 100 - lotteryDigit2 * 10;
		
		// Get digits from guess
		int guessDigit1 = guess / 100;
		int guessDigit2 = guess / 10 - guessDigit1 * 10;
		int guessDigit3 = guess - guessDigit1 * 100 - guessDigit2 * 10;
		
		System.out.println("The lottery number is " + lottery);
		
		// Check the guess
		if (guess == lottery)
			System.out.println("Exact match: you win $10,000");
		else if ((guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3)
			  && (guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3)
			  && (guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3))
			System.out.println("Match all digits: you win $3,000");
		else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3
				  || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3
				  || guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3)
			System.out.println("Match one digit: you win $1,000");
		else
			System.out.println("Sorry, no match");

	}

}
