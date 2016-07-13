// Gregory Jerian
// Period 4
// Project 5.1

public class ch5_1 {

	public static void main(String[] args) {
		System.out.println("This program finds the first 100 pentagonal numbers.");
		for (int n = 1, lineCount = 1; n <= 100; n++, lineCount++) {
			System.out.printf("%8s ", getPentagonalNumber(n));
			if (lineCount % 10 == 0) {
				lineCount = 0;
				System.out.println("");
			}
		}

	}
	
	public static int getPentagonalNumber(int n) {
		int num = n * (3 * n - 1) / 2;
		return num;
	}

}
