// Gregory Jerian
// Period 4
// Project 6.23

public class ch6_23 {

	public static void main(String[] args) {
		// Intro and creates arrays
		System.out.println("This program solves a locker puzzle.");
		int[] students = new int[100];
		boolean[] lockers = new boolean[100];
		for (int count = 0; count < 100; count++) {
			students[count] = count + 1;
			lockers[count] = false;
		}
		
		// Opens and closes the lockers
		for (int count = 1; count <= 100; count++) {
			for (int count2 = count; count2 <= 100; count2 += count) {
				if (lockers[count2 - 1] ==  false)
					lockers[count2 - 1] = true;
				else
					lockers[count2 - 1] = false;
			}
		}
		
		// Output
		System.out.print("The open lockers are: ");
		for (int count = 0; count < 100; count++) {
			if (lockers[count] == true)
				System.out.print(count + 1 + " ");
		}
		
	}

}
