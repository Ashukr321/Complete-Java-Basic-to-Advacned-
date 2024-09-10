import java.util.Scanner;

// Account class definition
class Account {
	private int id;
	private double balance;
	private static double annualInterestRate = 0;

	// No-arg constructor
	public Account() {
		this.id = 0;
		this.balance = 0;
	}

	// Constructor with specified id and initial balance
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	// Accessor methods
	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	// Mutator methods
	public void setId(int id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static void setAnnualInterestRate(double rate) {
		annualInterestRate = rate;
	}

	// Method to withdraw money from the account
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Insufficient balance or invalid amount.");
		}
	}

	// Method to deposit money into the account
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}
}

// ATMSimulator class to simulate an ATM machine
public class ATMSimulator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Create an array of 10 accounts with IDs 1 to 10 and an initial balance of $100
		Account[] accounts = new Account[10];
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i + 1, 100);
		}

		while (true) {
			// Prompt the user to enter an id
			System.out.print("Enter an account ID (1-10, or 0 to exit): ");
			int id = input.nextInt();

			// Exit if the ID is 0
			if (id == 0) {
				System.out.println("Exiting the system.");
				break;
			}

			// Validate the ID
			if (id < 1 || id > 10) {
				System.out.println("Invalid ID. Please try again.");
				continue;
			}

			// Main menu loop
			while (true) {
				// Display the main menu
				System.out.println("\nMain menu");
				System.out.println("1: check balance");
				System.out.println("2: withdraw");
				System.out.println("3: deposit");
				System.out.println("4: exit");
				System.out.print("Enter a choice: ");
				int choice = input.nextInt();

				// Handle the user's choice
				switch (choice) {
					case 1:
						System.out.println("The balance is $" + accounts[id - 1].getBalance());
						break;
					case 2:
						System.out.print("Enter an amount to withdraw: ");
						double withdrawAmount = input.nextDouble();
						accounts[id - 1].withdraw(withdrawAmount);
						break;
					case 3:
						System.out.print("Enter an amount to deposit: ");
						double depositAmount = input.nextDouble();
						accounts[id - 1].deposit(depositAmount);
						break;
					case 4:
						System.out.println("Exiting to ID selection...");
						break;
					default:
						System.out.println("Invalid choice. Please try again.");
				}

				// Exit the main menu loop if the user chose option 4
				if (choice == 4) {
					break;
				}
			}
		}

		input.close();
	}
}
