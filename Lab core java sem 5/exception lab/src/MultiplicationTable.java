import java.util.Scanner;

// Class to generate multiplication table
class Multiplication extends Thread {
	private int number;

	// Parameterized constructor
	public Multiplication(int number) {
		this.number = number;
	}

	// Method to run the thread
	@Override
	public void run() {
		printTable(number);
	}

	// Synchronized method to print multiplication table
	public static synchronized void printTable(int number) {
		System.out.println("Multiplication Table of " + number + ":");
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " x " + i + " = " + (number * i));
		}
		System.out.println(); // New line after printing the table
	}
}

// Main class to run the program
public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Taking dynamic user input
		System.out.print("Enter the first integer: ");
		int firstNumber = scanner.nextInt();
		System.out.print("Enter the second integer: ");
		int secondNumber = scanner.nextInt();

		// Create threads for multiplication tables
		Multiplication table1 = new Multiplication(firstNumber);
		Multiplication table2 = new Multiplication(secondNumber);

		// Start the threads
		table1.start();
		table2.start();

		// Wait for threads to finish
		try {
			table1.join();
			table2.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}

		scanner.close();
	}
}