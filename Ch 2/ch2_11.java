/* Gregory Jerian
 * Period 4
 * Project 2.11 
 * Expected input is an int*/

import java.util.Scanner;

public class ch2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program displays the population for the next x years.");
		System.out.println("Enter the number of years:");
		Scanner input = new Scanner(System.in);
		int years = input.nextInt();
		System.out.println("The population in " + years + " years is " + (int)(312032486 + ((60 * 60 * 24 * 365)/7.0 - (60 * 60 * 24 * 365)/13.0 + (60 * 60 * 24 * 365)/45.0) * years));
	
	}

}
