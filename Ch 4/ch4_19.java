// Gregory Jerian
// Period 4
// Project 4.19

public class ch4_19 {

	public static void main(String[] args) {
		int numOfLines = 8;
		for (int count = 0; count != numOfLines; count++) {
			for (int count4 = count; count4 != numOfLines ; count4++){
				System.out.print("    ");	
			}
			for (int count2 = 0; count2 < count; count2++){
				System.out.printf("%4.0f", Math.pow(2, count2));
			}
			for (int count3 = count; count3 >= 0; count3--) {
				System.out.printf("%4.0f", Math.pow(2, count3));
			}
			System.out.println();
		}

	}

}
