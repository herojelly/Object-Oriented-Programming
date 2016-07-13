// Gregory Jerian
// Period 4
// Project 10.3

public class MyInteger {
	private int value;
	
	MyInteger(int newValue) {
		value = newValue;
	}
	
	int getValue() {
		return value;
	}
	
	boolean isEven() {
		return value % 2 == 0;
	}
	
	boolean isOdd() {
		return value % 2 != 0;
	}
	
	boolean isPrime() {
		for (int count = 2; count <= value / 2; count++) {
			if (value % count == 0)
				return false;
		}
		return true;
	}
	
	static boolean isEven(int number) {
		return number % 2 == 0;
	}
	
	static boolean isOdd(int number) {
		return number % 2 != 0;
	}
	
	static boolean isPrime(int number) {
		for (int count = 2; count <= number / 2; count++) {
			if (number % count == 0)
				return false;
		}
		return true;
	}
	
	static boolean isEven(MyInteger number) {
		return number.isEven();
	}
	
	static boolean isOdd(MyInteger number) {
		return number.isOdd();
	}
	
	static boolean isPrime(MyInteger number) {
		return number.isPrime();
	}
	
	boolean equals(int number) {
		return number == value;
	}
	
	boolean equals(MyInteger number) {
		return number.equals(value);
	}
	
	static int[] parseInt(char[] charList) {
		int[] intList = new int[charList.length];
		for (int count = 0; count < charList.length; count++) {
			intList[count] = (int)charList[count];
		}
		return intList;
	}
	
	static int parseInt(String stringVal) {
		return Integer.parseInt(stringVal);
	}
	
}
