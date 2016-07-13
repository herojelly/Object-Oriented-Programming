/* Gregory Jerian
 * Period 4
 * Project 2.25
 * Expected input is an string followed by 4 numbers*/

import java.util.Scanner;

public class ch2_25 {

	public static void main(String[] args) {
		
		// Inputs
		System.out.println("This program prints a payroll statement.");
		System.out.println("Enter employee's name: ");
		Scanner input = new Scanner(System.in);
		String name = input.next();
		System.out.println("Enter number of hours worked in a week: ");
		double numOfHours = input.nextDouble();
		System.out.println("Enter hourly pay rate: ");
		double payRate = input.nextDouble();
		System.out.println("Enter federal tax withholding rate (in decimal form): ");
		double federalTaxRate = input.nextDouble();
		System.out.println("Enter state tax withholding rate (in decimal form): ");
		double stateTaxRate = input.nextDouble();
		
		// Outputs
		System.out.println("");
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + numOfHours);
		System.out.println("Pay Rate: $" + ((int)(payRate * 100))/100.0);
		System.out.println("Gross Pay: $" + ((int)(payRate * numOfHours * 100))/100.0);
		System.out.println("Deductions: ");
		System.out.println("  Federal Withholding (" + federalTaxRate * 100 + "%): $" + ((int)(federalTaxRate * payRate * numOfHours * 100))/100.0);
		System.out.println("  State Withholding (" + stateTaxRate * 100 + "%): $" + ((int)(stateTaxRate * payRate * numOfHours * 100))/100.0);
		System.out.println("  Total Deduction: $" + ((int) (((federalTaxRate * payRate * numOfHours) + (stateTaxRate * payRate * numOfHours))* 100))/100.0);
		System.out.println("Net Pay: $" + ((int)(((payRate * numOfHours) - (federalTaxRate * payRate * numOfHours) - (stateTaxRate * payRate * numOfHours)) * 100)) /100.0);
		
	}

}
