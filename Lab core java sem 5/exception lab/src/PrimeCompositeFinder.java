import java.util.Scanner;

// Class to find and print prime numbers
class PrimeThread extends Thread {
	private int limit;

	// Parameterized constructor
	public PrimeThread(int limit) {
		this.limit = limit;
	}

	// Method to find and print prime numbers
	@Override
	public void run() {
		System.out.println("Prime numbers up to " + limit + ":");
		for (int num = 2; num <= limit; num++) {
			if (isPrime(num)) {
				System.out.print(num + " ");
			}
		}
		System.out.println(); // New line after printing all primes
	}

	// Helper method to check if a number is prime
	private boolean isPrime(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return num > 1; // 0 and 1 are not prime numbers
	}
}

// Class to find and print composite numbers
class CompositeThread extends Thread {
	private int limit;

	// Parameterized constructor
	public CompositeThread(int limit) {
		this.limit = limit;
	}

	// Method to find and print composite numbers
	@Override
	public void run() {
		System.out.println("Composite numbers up to " + limit + ":");
		for (int num = 4; num <= limit; num++) { // Start from 4, as 0, 1, 2, 3 are not composite
			if (isComposite(num)) {
				System.out.print(num + " ");
			}
		}
		System.out.println(); // New line after printing all composites
	}

	// Helper method to check if a number is composite
	private boolean isComposite(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return true;
			}
		}
		return false; // If no divisors found, it's not composite
	}
}

// Main class to run the program
public class PrimeCompositeFinder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int limit = scanner.nextInt();

		// Create threads for prime and composite numbers
		PrimeThread primeThread = new PrimeThread(limit);
		CompositeThread compositeThread = new CompositeThread(limit);

		// Start the threads
		primeThread.start();
		compositeThread.start();

		// Wait for threads to finish
		try {
			primeThread.join();
			compositeThread.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}

		scanner.close();
	}
}


// class diagram

//+-------------------------+
//		|      PrimeThread        |
//		+-------------------------+
//		| - limit: int            |
//		+-------------------------+
//		| + PrimeThread(int)      |
//		| + run() : void          |
//		+-------------------------+
//
//		+-------------------------+
//		|     CompositeThread     |
//		+-------------------------+
//		| - limit: int            |
//		+-------------------------+
//		| + CompositeThread(int)   |
//		| + run() : void          |
//		+-------------------------+
//
//		+-------------------------+
//		|         Main           |
//		+-------------------------+
//		| + main(String[])       |
//		+-------------------------+
//		+-------------------------+