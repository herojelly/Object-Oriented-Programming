// Gregory Jerian
// Period 4
// Project 4.43

import java.util.Scanner;

public class ch4_43 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program counts down a certain number of seconds.");
		System.out.print("Enter the number of seconds: ");
		int numOfSeconds = input.nextInt();
		long numOfMillis = numOfSeconds * 1000;
		
		while (numOfMillis > 0){
			if (numOfMillis/1000 != 1)
				System.out.println(numOfMillis/1000 + " seconds remaining.");
			else
				System.out.println(numOfMillis/1000 + " second remaining.");
			long startingTime = System.currentTimeMillis();
			while (System.currentTimeMillis() < startingTime + 1000)
				System.out.print("");
			numOfMillis -= 1000;
		}
		System.out.println("Stopped");
	}

}
