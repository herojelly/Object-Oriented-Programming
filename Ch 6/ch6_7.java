// Gregory Jerian
// Period 4
// Project 6.7

public class ch6_7 {

	public static void main(String[] args) {
		// Intro
		System.out.println("This program generates 100 random integers and displays a count for each number.");
		
		// Creates arrays
		int[] randomArray = new int [100];
		int[] counts = new int [10];
		
		// Generates random integers
		for (int count = 0; count < 100; count++) {
			randomArray[count] = (int)(Math.random() * 10);
		}
		
		// Finds counts
		for (int count = 0; count < 100; count++) {
			switch (randomArray[count]) {
				case 0: counts[0]++; break;
				case 1: counts[1]++; break;
				case 2: counts[2]++; break;
				case 3: counts[3]++; break;
				case 4: counts[4]++; break;
				case 5: counts[5]++; break;
				case 6: counts[6]++; break;
				case 7: counts[7]++; break;
				case 8: counts[8]++; break;
				case 9: counts[9]++;
			}
		}
		
		// Prints output
		for (int count = 0; count < 10; count++) {
			System.out.println("The count for " + count + " is " + counts[count]);
		}
	}

}
