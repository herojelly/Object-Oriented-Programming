/* Gregory Jerian
 * Period 4
 * Project 2.23
 * Expected input is an int between 0 and 127*/

import java.util.Scanner;

public class ch2_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program receives an ASCII code and displays its character.");
		System.out.println("Enter an ASCII code (integer between 0 and 127): ");
		Scanner input = new Scanner(System.in);
		int codeIn = input.nextInt();
		System.out.println("The character is " + (char)codeIn);
		
	}

}
