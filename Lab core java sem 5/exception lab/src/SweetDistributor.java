class SweetDistributor {
	private int totalSweets;
	private int totalChildren;

	// Parameterized constructor
	public SweetDistributor(int sweets, int children) {
		this.totalSweets = sweets;
		this.totalChildren = children;
	}

	// Method to distribute sweets
	public void distributeSweets() {
		try {
			if (totalChildren == 0) {
				throw new ArithmeticException("Number of children cannot be zero.");
			}
			int sweetsPerChild = totalSweets / totalChildren;
			System.out.println("Each child will receive " + sweetsPerChild + " sweets.");
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		// Example usage
		SweetDistributor distributor1 = new SweetDistributor(20, 5);
		distributor1.distributeSweets(); // Normal case

		SweetDistributor distributor2 = new SweetDistributor(20, 0);
		distributor2.distributeSweets(); // Exception case
	}
}


// class diagram
//+-----------------------+
//		|   SweetsDistribution   |
//		+-----------------------+
//		| - numberOfSweets: int |
//		| - numberOfChildren: int|
//		+-----------------------+
//		| + SweetsDistribution(int, int) |
//		| + distributeSweets()  |
//		+-----------------------+