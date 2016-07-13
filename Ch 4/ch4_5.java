// Gregory Jerian
// Period 4
// Project 4.5

public class ch4_5 {

	public static void main(String[] args) {
		double pounds, kilograms2;
		int pounds2 = 20;
		System.out.println("This program converts a table of kilograms to pounds and a table of pounds to kilograms.");
		System.out.printf("%-12s %7s |     %-12s %-12s \n", "Kilograms", "Pounds", "Pounds", "Kilograms");
		
		for (int kilograms = 1; kilograms <= 199; kilograms += 2, pounds2 += 5) {
			pounds = kilograms * 2.2;
			kilograms2 = pounds2/2.2;
			System.out.printf("%-12d %6.1f  |     %-12d %6.2f \n", kilograms, pounds, pounds2, kilograms2);
		}

	}

}
