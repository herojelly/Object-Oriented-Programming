// Gregory Jerian
// Period 4
// Project 5.9

public class ch5_9 {

	public static void main(String[] args) {
		System.out.println("This program converts feet to meters and meters to feet.");
		
		System.out.println();
		System.out.printf("%-10s %-10s %5s %10s %10s \n", 
				"Feet", "Meters", "|", "Meters", "Feet");
		System.out.println("---------------------------------------------------");
		for (int feet1 = 1, meters2 = 20; feet1 <= 10; feet1++, meters2 += 5) {
			double meters1 = footToMeter(feet1);
			double feet2 = meterToFoot(meters2);
			System.out.printf("%-10.1f %-10.3f %5s %10.1f %10.3f \n",
					(double)feet1, meters1, "|", (double)meters2, feet2);
		}

	}
	
	public static double footToMeter(double foot) {
		return 0.305 * foot;
	}
	
	public static double meterToFoot(double meter) {
		return meter / 0.305;
	}

}
