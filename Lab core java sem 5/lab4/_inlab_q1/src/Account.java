class Account {
	// Private data fields
	private int id = 0;
	private double balance = 0;
	private static double annualInterestRate = 0;


	public Account() {}

	// Constructor with specified id and initial balance
	public Account(int id, double balance) {
		if (id > 0 && balance >= 0) {
			this.id = id;
			this.balance = balance;
		}
	}

	// Accessor and mutator methods for id
	public int getId() {
		return id;
	}

	public boolean setId(int id) {
		if (id > 0) {
			this.id = id;
			return true;
		}
		return false;
	}

	// Accessor and mutator methods for balance
	public double getBalance() {
		return balance;
	}

	public boolean setBalance(double balance) {
		if (balance >= 0) {
			this.balance = balance;
			return true;
		}
		return false;
	}

	// Accessor and mutator methods for annualInterestRate
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static boolean setAnnualInterestRate(double rate) {
		if (rate >= 0) {
			annualInterestRate = rate;
			return true;
		}
		return false;
	}

	// Method to withdraw a specified amount from the account
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
		}
	}

	// Method to deposit a specified amount to the account
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	// Method to get the monthly interest
	public double getMonthlyInterest() {
		double monthlyInterestRate = annualInterestRate / 12 / 100;
		return balance * monthlyInterestRate;
	}

	public static void main(String[] args) {
		// Create an Account object with ID 1122, balance $20,000, and annual interest rate of 4.5%
		Account account = new Account(1122, 20000);
		Account.setAnnualInterestRate(4.5);

		// Withdraw $2,500
		account.withdraw(2500);

		// Deposit $3,000
		account.deposit(3000);

		// Print the balance and monthly interest
		System.out.println("Balance: $" + account.getBalance());
		System.out.println("Monthly Interest: $" + account.getMonthlyInterest());
	}
}



//class diagram
//+----------------------------------+
//		|            Account               |
//		+----------------------------------+
//		| - id: int                        |
//		| - balance: double                |
//		| - annualInterestRate: double     |
//		+----------------------------------+
//		| + Account()                      |
//		| + Account(id: int, balance: double) |
//		| + getId(): int                   |
//		| + setId(id: int): boolean        |
//		| + getBalance(): double           |
//		| + setBalance(balance: double): boolean |
//		| + getAnnualInterestRate(): double |
//		| + setAnnualInterestRate(rate: double): boolean |
//		| + withdraw(amount: double): void |
//		| + deposit(amount: double): void  |
//		| + getMonthlyInterest(): double   |
//		+----------------------------------+
