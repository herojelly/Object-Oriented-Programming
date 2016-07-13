/* Gregory Jerian
 * Period 4
 * Project 2.27
 * Expected input is an string followed by 4 numbers*/

import javax.swing.JOptionPane;

public class ch2_27 {

	public static void main(String[] args) {
		
		// Inputs
		String name = JOptionPane.showInputDialog("Enter employee's name: ");
		String numOfHoursString = JOptionPane.showInputDialog("Enter number of hours worked in a week: ");
		String payRateString = JOptionPane.showInputDialog("Enter hourly pay rate: ");
		String federalTaxRateString = JOptionPane.showInputDialog("Enter federal tax withholding rate (in decimal form): ");
		String stateTaxRateString = JOptionPane.showInputDialog("Enter state tax withholding rate (in decimal form): ");
		double numOfHours = Double.parseDouble(numOfHoursString);
		double payRate = Double.parseDouble(payRateString);
		double federalTaxRate = Double.parseDouble(federalTaxRateString);
		double stateTaxRate = Double.parseDouble(stateTaxRateString);
		
		// Outputs
		JOptionPane.showMessageDialog(null, "Employee Name: " + name);
		JOptionPane.showMessageDialog(null, "Hours Worked: " + numOfHours);
		JOptionPane.showMessageDialog(null, "Pay Rate: $" + ((int)(payRate * 100))/100.0);
		JOptionPane.showMessageDialog(null, "Gross Pay: $" + ((int)(payRate * numOfHours * 100))/100.0);
		JOptionPane.showMessageDialog(null, "Federal Withholding (" + federalTaxRate * 100 + "%): $" + ((int)(federalTaxRate * payRate * numOfHours * 100))/100.0);
		JOptionPane.showMessageDialog(null, "State Withholding (" + stateTaxRate * 100 + "%): $" + ((int)(stateTaxRate * payRate * numOfHours * 100))/100.0);
		JOptionPane.showMessageDialog(null, "Total Deduction: $" + ((int) (((federalTaxRate * payRate * numOfHours) + (stateTaxRate * payRate * numOfHours))* 100))/100.0);
		JOptionPane.showMessageDialog(null, "Net Pay: $" + ((int)(((payRate * numOfHours) - (federalTaxRate * payRate * numOfHours) - (stateTaxRate * payRate * numOfHours)) * 100)) /100.0);

	}

}
