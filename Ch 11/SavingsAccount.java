// Gregory Jerian
// Period 4
// Project 11.3

public class SavingsAccount extends Account {	
	SavingsAccount() {
	}
	
	SavingsAccount(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
	}
	
	@Override
	public void withdraw(double amountWithdrawn) {
		if (amountWithdrawn <= balance) {
			balance -= amountWithdrawn;
			System.out.println("$" + amountWithdrawn + " withdrawn");
		}
		else
			System.out.println("Error. Withdrawn amount '$" + amountWithdrawn + "' exceeds balance.");
	}
	
	@Override
	public String toString() {
		return "Savings account id " + id + " created on " + dateCreated.toString() + 
				" has balance of $" + balance;
	}
}
