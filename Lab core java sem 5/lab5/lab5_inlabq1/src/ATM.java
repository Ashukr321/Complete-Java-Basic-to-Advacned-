class Account {
	// Private static instance of the singleton class
	private static final Account instance = new Account();

	// Private data field for the account balance
	private double balance;

	// Private constructor to prevent instantiation from other classes
	private Account() {
		balance = 1000.0; // Initial balance set to 1000.0 for example
	}

	// Public static method to provide the global point of access
	public static Account getInstance() {
		return instance;
	}

	// Method to deposit money
	public synchronized void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Successfully deposited: " + amount);
		} else {
			System.out.println("Invalid deposit amount!");
		}
		displayBalance();
	}

	// Method to withdraw money
	public synchronized void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Successfully withdrew: " + amount);
		} else {
			System.out.println("Invalid withdrawal amount or insufficient funds!");
		}
		displayBalance();
	}

	// Method to display the current balance
	public void displayBalance() {
		System.out.println("Current Balance: " + balance);
	}
}

public class ATM {
	public static void main(String[] args) {
		// Get the single instance of Account
		Account account = Account.getInstance();

		// Simulate transactions from different ATMs
		account.deposit(500); // ATM 1 deposits 500
		account.withdraw(200); // ATM 2 withdraws 200
		account.deposit(300); // ATM 3 deposits 300
		account.withdraw(1000); // ATM 1 withdraws 1000
	}
}
