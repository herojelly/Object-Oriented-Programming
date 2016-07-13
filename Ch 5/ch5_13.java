// Gregory Jerian
// Period 4
// Project 5.13

public class ch5_13 {

	public static void main(String[] args) {
		System.out.println("This program computes a series. \n");
		
		System.out.printf("%-10s %10s \n", "i", "m(i)");
		System.out.println("---------------------");
		for (int i = 1; i <= 20; i++){
			double m = series(i);
			System.out.printf("%-10d %10.4f \n", i, m);
		}
	}
	
	public static double series(int i) {
		double sum = 0;
		for (int count = 1; count <= i; count++) {
			sum += count/(count + 1.0);
		}
		return sum;
	}

}
