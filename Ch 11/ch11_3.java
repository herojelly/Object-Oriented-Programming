// Gregory Jerian
// Period 4
// Project 11.3

public class ch11_3 {

	public static void main(String[] args) {
		// Account
		Account acc = new Account(555555555, 100);
		System.out.println(acc.toString());
		
		acc.withdraw(50);
		System.out.println(acc.toString());
		
		acc.withdraw(100);
		System.out.println(acc.toString());
		
		acc.withdraw(150);
		System.out.println(acc.toString());
		System.out.println();
		
		// Checking Account
		CheckingAccount check = new CheckingAccount(912371238, 100);
		System.out.println(check.toString());
		
		check.withdraw(50);
		System.out.println(check.toString());

		check.withdraw(100);
		System.out.println(check.toString());
		
		check.withdraw(150);
		System.out.println(check.toString());
		System.out.println();
		
		// Savings Account
		SavingsAccount save = new SavingsAccount(1283791273, 100);
		System.out.println(save.toString());
		
		save.withdraw(50);
		System.out.println(save.toString());

		save.withdraw(100);
		System.out.println(save.toString());
		
		save.withdraw(150);
		System.out.println(save.toString());
	}

}
