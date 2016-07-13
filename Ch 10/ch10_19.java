// Gregory Jerian
// Period 4
// Project 10.19

import java.math.BigInteger;
public class ch10_19 {

	public static void main(String[] args) {
		System.out.printf("%-10s %-10s\n\n", "p", "2^p - 1");
		BigInteger two = new BigInteger("2");
		boolean isPrime = true;
		for (int p = 2; p <= 100; p++) {
			BigInteger number = two.pow(p).subtract(BigInteger.ONE);
			for (int count = 2; new BigInteger("" + count).compareTo(number.divide(two)) <= 0 && isPrime == true; count++) {
				if (number.mod(new BigInteger("" + count)).compareTo(BigInteger.ZERO) == 0)
				isPrime = false;
			}
			if (isPrime)
				System.out.printf("%-10d %-10d\n", p, number);
			isPrime = true;
		}

	}
	
	

}

