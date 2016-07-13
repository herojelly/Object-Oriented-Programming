// Gregory Jerian
// Period 4
// Project 8.7

public class ch8_7 {

	public static void main(String[] args) {
		Account object = new Account(1122, 20000);
		object.setAnnualInterestRate(4.5);
		object.withdraw(2500);
		object.deposit(3000);
		System.out.printf("Balance: $%.2f\n", object.getBalance());
		System.out.printf("Monthly Interest: $%.2f\n", object.getMonthlyInterest());
		System.out.println("Date when the account was created: " + object.getDateCreated().toString());

	}

}
