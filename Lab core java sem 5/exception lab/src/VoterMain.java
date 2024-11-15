// User-defined exception class
class AgeException extends Exception {
	public AgeException(String message) {
		super(message);
	}
}

// Class to represent a voter
class Voter {
	private int age;

	// Constructor to initialize age
	public Voter(int age) {
		this.age = age;
	}

	// Method to check voter eligibility
	public void checkEligibility() {
		try {
			if (age < 18) {
				throw new AgeException("Voter age is less than 18.");
			} else {
				System.out.println("VOTER IS ELIGIBLE TO VOTE.");
			}
		} catch (AgeException e) {
			System.out.println("Error: " + e.getMessage());
			System.out.println("VOTER IS NOT ELIGIBLE TO VOTE.");
		}
	}
}

// Main class to test the Voter class
public class VoterMain {
	public static void main(String[] args) {
		// Example usage
		Voter voter1 = new Voter(20);
		voter1.checkEligibility(); // Eligible case

		Voter voter2 = new Voter(16);
		voter2.checkEligibility(); // Not eligible case
	}
}


//class diagram
//+---------------------+
//		|      SweetDistributor|
//		+---------------------+
//		| - totalSweets: int  |
//		| - totalChildren: int |
//		+---------------------+
//		| + SweetDistributor(int, int) |
//		| + distributeSweets() : void  |
//		+---------------------+