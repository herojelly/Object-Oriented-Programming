// Gregory Jerian
// Period 4
// Project 4.17
// Expected input is an integer (single digit or double digits).

import java.util.Scanner;

public class ch4_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program displays a pyramid given the number of lines.");
		System.out.print("Enter the number of lines (single digit or double digit integer): ");
		int numOfLines = input.nextInt();
		for (int count = 0; count != numOfLines; count++) {
			for (int count4 = count; count4 != numOfLines ; count4++){
				System.out.print("   ");	
			}
			for (int count2 = count; count2 >= 1; count2--){
				System.out.printf("%3s", count2 + 1);
			}
			for (int count3 = 0; count3 <= count; count3++) {
				System.out.printf("%3s", count3 + 1);
			}
			System.out.println();
		}

	}

}
