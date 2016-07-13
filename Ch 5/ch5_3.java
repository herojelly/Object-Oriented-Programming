// Gregory Jerian
// Period 4
// Project 5.3
// Expected input is an integer
	/** Reverse method code borrowed from 
	 * http://www.justanswer.com/computer-programming/49y9b-write-following-two-methods-return-reversal.html */

import java.util.Scanner;

public class ch5_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program reports if an integer is a palindrome.");
		System.out.print("Enter an integer to test: ");
		int number = input.nextInt();
		int numberReverse = reverse(number);
		if (isPalindrome(number, numberReverse))
			System.out.println(number + " is a palindrome.");
		else
			System.out.println(number + " is not a palindrome.");
	}
	
	// Return the reversal of an integer, i.e., reverse(456) returns 654
	public static int reverse(int number) {
		int reverseNumber = 0;
        while (number > 0) {
             reverseNumber = (reverseNumber * 10) + (number % 10);
             number = number / 10;
        }
        return reverseNumber;
	}
	
	// Return true if number is a palindrome
	public static boolean isPalindrome(int number, int numberReverse) {
		return number == numberReverse;
		
	}

}
