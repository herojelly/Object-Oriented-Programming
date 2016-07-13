// Gregory Jerian
// Period 4
// Project 8.7

import java.util.Date;

public class Account {
	Date date = new Date();
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = date;
	
	Account() {
	}
	
	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
	}
	
	int getId() {
		return id;
	}
	
	double getBalance() {
		return balance;
	}
	
	double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	void setId(int newId) {
		id = newId;
	}
	
	void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	
	Date getDateCreated() {
		return dateCreated;
	}
	
	double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	double getMonthlyInterest() {
		return balance * (annualInterestRate / (12 * 100));
	}
	
	void withdraw(double amountWithdrawn) {
		balance -= amountWithdrawn;
	}
	
	void deposit(double amountDeposited) {
		balance += amountDeposited;
	}
	
}