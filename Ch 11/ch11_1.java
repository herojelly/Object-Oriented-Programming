// Gregory Jerian
// Period 4
// Project 11.1 

import java.util.Scanner;
public class ch11_1 {

	public static void main(String[] args) {
		// INPUTS
		Scanner lol = new Scanner(System.in);
		System.out.print("Enter the three sides of the triangle: ");
		double side1 = lol.nextDouble();
		double side2 = lol.nextDouble();
		double side3 = lol.nextDouble();
		System.out.print("Enter a color: ");
		String color = lol.next();
		System.out.print("Enter true or false for if the triangle is filled: ");
		boolean filled = lol.nextBoolean();
		
		// CREATE TRIANGLE
		Triangle tri = new Triangle(side1, side2, side3);
		tri.setColor(color);
		tri.setFilled(filled);
		
		// OUTPUTS
		System.out.println("\nArea: " + tri.getArea());
		System.out.println("Perimeter: " + tri.getPerimeter());
		System.out.println("Color: " + tri.getColor());
		System.out.println("Filled? " + tri.isFilled());
		
	}

}
