// Gregory Jerian
// Period 4
// Project 4.23

public class ch4_23 {

	public static void main(String[] args) {
		System.out.println("This program computes the results of a series from left to right and right to left.");
		double summation1 = 0.0, summation2 = 0.0;
		
		// Left to right summation
		for (int count = 1; count <= 50000; count++){
			summation1 += 1.0/count;
		}
		System.out.println("The summation of the series from left to right is " + summation1);
		
		// Right to left summation
		for (int count2 = 50000; count2 >= 1; count2--){
			summation2 += 1.0/count2;
		}
		System.out.println("The summation of the series from right to left is " + summation2);
	}

}
