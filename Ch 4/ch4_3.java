/* Gregory Jerian
 * Period 4
 * Project 4.3 */

public class ch4_3 {

	public static void main(String[] args) {
		double pounds;
		System.out.println("This program converts a table of kilograms to pounds.");
		System.out.printf("%-12s %7s \n", "Kilograms", "Pounds");
		
		for (int kilograms = 1; kilograms <= 199; kilograms += 2) {
			pounds = kilograms * 2.2;
			System.out.printf("%-12d %6.1f \n", kilograms, pounds);
		}
		

	}

}
