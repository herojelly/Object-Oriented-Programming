/* Gregory Jerian
 * Period 4
 * Project 1.11 */
public class ch1_11 {

	public static void main(String[] args) {
		System.out.println("This program displays the population for the next five years.");
		System.out.println("Year 1:");
		System.out.println((int)(312032486 + (60 * 60 * 24 * 365)/7.0 - (60 * 60 * 24 * 365)/13.0 + (60 * 60 * 24 * 365)/45.0));
		System.out.println("Year 2:");
		System.out.println((int)(312032486 + ((60 * 60 * 24 * 365)/7.0 - (60 * 60 * 24 * 365)/13.0 + (60 * 60 * 24 * 365)/45.0) * 2));
		System.out.println("Year 3:");
		System.out.println((int)(312032486 + ((60 * 60 * 24 * 365)/7.0 - (60 * 60 * 24 * 365)/13.0 + (60 * 60 * 24 * 365)/45.0) * 3));
		System.out.println("Year 4:");
		System.out.println((int)(312032486 + ((60 * 60 * 24 * 365)/7.0 - (60 * 60 * 24 * 365)/13.0 + (60 * 60 * 24 * 365)/45.0) * 4));
		System.out.println("Year 5:");
		System.out.println((int)(312032486 + ((60 * 60 * 24 * 365)/7.0 - (60 * 60 * 24 * 365)/13.0 + (60 * 60 * 24 * 365)/45.0) * 5));
		
	}

}
