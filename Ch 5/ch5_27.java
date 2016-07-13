// Gregory Jerian
// Period 4
// Project 5.27
/** Reverse method code borrowed from 
	 * http://www.justanswer.com/computer-programming/49y9b-write-following-two-methods-return-reversal.html */

public class ch5_27 {

	public static void main(String[] args) {
		System.out.println("This program dipslays the first 100 emirps.");
		int numOfPrimes = 0, number = 0, emirp;
		while (numOfPrimes < 100) {
			if (isPrime(number)) {
				emirp = reverse(number);
				if (isPrime(emirp) && !isPalindrome(number, emirp)) {
					if (numOfPrimes % 10 == 0)
						System.out.println();
					System.out.print(number + " ");
					numOfPrimes++;
				}
			}
			number++;
		}

	}
	
	public static boolean isPrime(int number) {
		boolean isPrime = true;
		for (int count = 2; count <= number/2.0 && isPrime == true; count++) {
			if ((double)number % count == 0)
				isPrime = false;
		}
		return isPrime;
	}
	

	// Return the reversal of an integer, i.e., reverse(456) returns 654
	public static int reverse(int number) {
		int reverseNumber = 0;
        while (number > 0) {
             reverseNumber = (reverseNumber * 10) + (number % 10);
             number = number / 10;
        }
        return reverseNumber;
	}
	
	public static boolean isPalindrome(int number, int numberReverse) {
		return number == numberReverse;
		
	}

}
