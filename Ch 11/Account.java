// Gregory Jerian
// Period 4
// Project 11.3

import java.util.Date;

public class Account {
	Date date = new Date();
	protected int id;
	protected double balance;
	protected double annualInterestRate;
	protected Date dateCreated = date;
	
	Account() {
	}
	
	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
	}
	
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setId(int newId) {
		id = newId;
	}
	
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	public double getMonthlyInterest() {
		return balance * (annualInterestRate / (12 * 100));
	}
	
	public void withdraw(double amountWithdrawn) {
		balance -= amountWithdrawn;
		System.out.println("$" + amountWithdrawn + " withdrawn");
	}
	
	public void deposit(double amountDeposited) {
		balance += amountDeposited;
	}
	
	@Override
	public String toString() {
		return "Bank account id " + id + " created on " + dateCreated.toString() + 
				" has balance of $" + balance;
	}
	
}