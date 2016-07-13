// Gregory Jerian
// Period 4
// Project 4.25

public class ch4_25 {

	public static void main(String[] args) {
		System.out.println("This program approximates the value of pi using a series.");
		int count;
		
		// i = 10,000
		double summation = 0.0;
		for (count = 1; count <= 10000; count++){
			summation += (Math.pow(-1, count + 1))/(2 * count - 1);
		}
		summation *= 4;
		System.out.println("The pi value for i = 10,000 is " + summation);
		
		// i = 20,000
		summation = 0.0;	
		for (count = 1; count <= 20000; count++){
			summation += (Math.pow(-1, count + 1))/(2 * count - 1);
		}
		summation *= 4;
		System.out.println("The pi value for i = 20,000 is " + summation);
		
		// i = 100,000
		summation = 0.0;
		for (count = 1; count <= 100000; count++){
			summation += (Math.pow(-1, count + 1))/(2 * count - 1);
		}
		summation *= 4;
		System.out.println("The pi value for i = 100,000 is " + summation);
	}

}
