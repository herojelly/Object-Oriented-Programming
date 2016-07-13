/* Gregory Jerian
 * Period 4
 * Project 2.1 
 * Expected input is a double. */

import java.util.Scanner;

public class ch2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program converts from Celsius to Fahrenheit.");
		System.out.println("Please enter a Celsius temperature.");
		Scanner input = new Scanner(System.in);
		double c = input.nextDouble();
		double f = (9.0/5) * c + 32;
		System.out.println(c + " Celsius is " + f + " Fahrenheit");
	
	}

}
