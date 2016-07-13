// Gregory Jerian
// Period 4
// Project 4.35

public class ch4_35 {

	public static void main(String[] args) {
		System.out.println("This program computes a summation.");
		double sum = 0.0;
		for (int count = 1; count < 625; count++){
			sum += 1/ (Math.pow(count, 0.5) + Math.pow((count + 1), 0.5));
			System.out.println(sum);
		}
		System.out.println("The answer is " + sum);

	}

}
