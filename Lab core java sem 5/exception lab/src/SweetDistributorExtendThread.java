// Class that extends Thread
class SweetDistributor2 extends Thread {
	private int totalSweets;
	private int totalChildren;

	// Parameterized constructor
	public SweetDistributor2(int sweets, int children) {
		this.totalSweets = sweets;
		this.totalChildren = children;
	}

	// Method to distribute sweets
	@Override
	public void run() {
		try {
			if (totalChildren == 0) {
				throw new ArithmeticException("Number of children cannot be zero.");
			}
			int sweetsPerChild = totalSweets / totalChildren;
			System.out.println("Each child will receive " + sweetsPerChild + " sweets.");
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
			System.out.println("Cannot distribute sweets.");
		}
	}
}

// Main class to test the SweetDistributor2
public class SweetDistributorExtendThread {
	public static void main(String[] args) {
		// Example usage
		SweetDistributor2 distributor1 = new SweetDistributor2(20, 5);
		distributor1.start(); // Normal case

		SweetDistributor2 distributor2 = new SweetDistributor2(20, 0);
		distributor2.start(); // Exception case

		// Wait for threads to finish before exiting the main method
		try {
			distributor1.join();
			distributor2.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
	}
}