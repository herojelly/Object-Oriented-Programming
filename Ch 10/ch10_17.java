// Gregory Jerian
// Period 4
// Project 10.17

import java.math.BigInteger;
public class ch10_17 {

	public static void main(String[] args) {
		System.out.println("This program finds the first ten square numbers greater than Long.MAX_VALUE.");
		System.out.println("Long.MAX_VALUE: " + Long.MAX_VALUE);
		BigInteger rootVal = new BigInteger("" + (long)(Math.ceil(Math.sqrt(Long.MAX_VALUE))));
		
		for (int i = 0; i < 10; i++) {
			System.out.println(rootVal.pow(2));
			rootVal = rootVal.add(BigInteger.ONE);
		}

	}

}
