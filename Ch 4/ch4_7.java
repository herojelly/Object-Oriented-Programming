// Gregory Jerian
// Period 4
// Project 4.7

public class ch4_7 {

	public static void main(String[] args) {
		System.out.println("This program computes future tuition for a university.");
		
		// Computes tuition in ten years
		int yearCount = 1;
		double tuition = 10000;
		while (yearCount <= 10){
			yearCount++;
			tuition *= 1.05;
		}
		System.out.printf("The tuition in ten years is $%.2f \n", tuition);
		
		// Computes total cost of four years' worth of tuition starting ten years from now
		yearCount = 1;
		double totalTuition = 0;
		while (yearCount <= 4){
			totalTuition += tuition;
			yearCount++;
			tuition *= 1.05;
		}
		System.out.printf("The total cost of four years' worth of tuition starting ten years from now is $%.2f \n", totalTuition);
	}

}
