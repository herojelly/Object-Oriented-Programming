// Gregory Jerian
// Period 4
// Project 4.11

public class ch4_11 {

	public static void main(String[] args) {
		System.out.println("This program finds numbers divisible by 5 or 6 but not both.");
		
		int count = 0;
		for (int number = 100; number <= 200; number++) {
			if (number % 5 == 0 ^ number % 6 == 0) {
				System.out.print(number + " ");
				count++;
			}
			if (count == 10) {
				System.out.println();
				count = 0;
			}
				
		}

	}

}
