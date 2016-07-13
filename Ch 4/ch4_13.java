// Gregory Jerian
// Period 4
// Project 4.13

public class ch4_13 {

	public static void main(String[] args) {
		System.out.println("This program finds the largest integer n such that n cubed < 12,0000.");
		int n = 1;
		while (Math.pow(n, 3) < 12000)
			n++;
		n -= 1;
		System.out.println("n is " + n);

	}

}
