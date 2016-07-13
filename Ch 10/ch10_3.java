// Gregory Jerian
// Period 4
// Project 10.3

public class ch10_3 {

	public static void main(String[] args) {
		MyInteger int1 = new MyInteger(5);
		System.out.println("int1 is " + int1.getValue());
		System.out.println("Is int1 even? " + int1.isEven());
		System.out.println("Is int1 odd? " + int1.isOdd());
		System.out.println("Is int1 prime? " + int1.isPrime());
		
		System.out.println("\nIs 20 even? " + MyInteger.isEven(20));
		System.out.println("Is 20 odd? " + MyInteger.isOdd(20));
		System.out.println("Is 20 prime? " + MyInteger.isPrime(20));
		
		MyInteger int2 = new MyInteger(8);
		System.out.println("\nint2 is " + int2.getValue());
		System.out.println("Is int2 even? " + MyInteger.isEven(int2));
		System.out.println("Is int2 odd? " + MyInteger.isOdd(int2));
		System.out.println("Is int2 prime? " + MyInteger.isPrime(int2));
		System.out.println("Does int2 = 8? " + int2.equals(8));
		System.out.println("Does int1 = int2? " + int1.equals(int2));
		
		char[] charList = {'a', 'b', 'c', 'f', 'h'};
		System.out.print("\nChar list: ");
		for (int i = 0; i < 5; i++)
			System.out.print(charList[i] + " ");
		
		int[] intList = MyInteger.parseInt(charList);
		System.out.print("\nParsed int list: ");
		for (int i = 0; i < 5; i++)
			System.out.print(intList[i] + " ");
		
		String a = "24";
		System.out.println("\n\nString Value: " + a);
		System.out.println("Int Value: " + MyInteger.parseInt(a));

	}

}
