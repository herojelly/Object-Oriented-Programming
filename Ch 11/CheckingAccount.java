// Gregory Jerian
// Period 4
// Project 11.3

public class CheckingAccount extends Account {
	private double overdraftAmount = 100;
	
	CheckingAccount() {
	}
	
	CheckingAccount(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
	}
	
	public void setOverdraftAmount(double overdraftAmount) {
		this.overdraftAmount = overdraftAmount;
	}
	
	@Override
	public void withdraw(double amountWithdrawn) {
		if (amountWithdrawn <= balance + overdraftAmount) {
			balance -= amountWithdrawn;
			System.out.println("$" + amountWithdrawn + " withdrawn");
		}
		else
			System.out.println("Error. Withdrawn amount '$" + amountWithdrawn + "' exceeds overdraft limit.");
	}
	
	@Override
	public String toString() {
		return "Checking account id " + id + " created on " + dateCreated.toString() + 
				" has balance of $" + balance;
	}
}
