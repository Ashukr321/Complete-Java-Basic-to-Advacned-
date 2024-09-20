
import java.util.Scanner;

// abstract class for the BankAccount
// abstract class
abstract class BankAccount {
	//create the abstract class and  concrete methods
	// create the state variables
	private double Balance;

	// constructor -> we can se the interestRate via a subClass
	public BankAccount(double intialBalance) {
		this.Balance = intialBalance;
	}

	// concrete method for deposit
	public void deposit(double amount) {
		this.Balance += amount;
		System.out.println("Deposited Amount Successfully: !" + amount);
	}

	public void withdraw(double amount) {
		if (this.Balance >= amount) {
			this.Balance = Balance - amount;
			System.out.println("Withdraw Money SuccessFully: " + amount);
		} else {
			System.out.println("Insufficient  Your Balance.");
		}
	}

	public abstract double calculateInterest();

	// get Balance
	public double getBalance() {
		return this.Balance;
	}
}

 class CheckingAccount extends BankAccount {
	// create the state variables for the interestRate;
	private double interestRate;

	//create the constructor
	public CheckingAccount(double initialBalance, double interestRate) {
		// now we refer to the  base class BankAccount by the help of the super keywords
		super(initialBalance);
		this.interestRate = interestRate;
	}

	public double calculateInterest() {
		return getBalance() *interestRate/100;
	}
}

public class StaticMethodsInAbstractClass {

	public static void main(String[] args) {
	//create the object of the subclass
		CheckingAccount account1 = new CheckingAccount(122,15.4);
		System.out.println("check Balance :"+account1.getBalance());
		Scanner sc = new Scanner(System.in);
		double depositeAmmout ;
		System.out.println("Enter Amount you want to Deposite :");
		depositeAmmout = sc.nextDouble();
		account1.deposit(depositeAmmout);
		System.out.println("Amount Deposited "+depositeAmmout+"SuccessFully :"+account1.getBalance());
	}
}

// access modifiers
/*
	public -> access to everywhere
	private -> access within  the class only
	protected-> access within the package only
	default ->
 */
