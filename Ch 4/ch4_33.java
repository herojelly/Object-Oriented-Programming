// Gregory Jerian
// Period 4
// Project 4.33

public class ch4_33 {

	public static void main(String[] args) {
		System.out.println("This program finds the four perfect numbers under 10,000.");
		
		for (int number = 1; number <= 10000; number++) {
			int divisorCount = 0;
			for (int count = 1; count < number; count++){
				if (number % count == 0)
					divisorCount += count;
			}
			if (divisorCount == number)
				System.out.println(number);
		}

	}

}
