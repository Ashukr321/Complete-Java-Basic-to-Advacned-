import java.util.Scanner;

// Class to find and print vowels
class VowelThread extends Thread {
	private char[] letters;

	// Parameterized constructor
	public VowelThread(char[] letters) {
		this.letters = letters;
	}

	// Method to find and print vowels
	@Override
	public void run() {
		System.out.print("Vowels: ");
		for (char letter : letters) {
			if (isVowel(letter)) {
				System.out.print(letter + " ");
			}
		}
		System.out.println(); // New line after printing all vowels
	}

	// Helper method to check if a character is a vowel
	private boolean isVowel(char letter) {
		return "AEIOUaeiou".indexOf(letter) != -1;
	}
}

// Class to find and print consonants
class ConsonantThread extends Thread {
	private char[] letters;

	// Parameterized constructor
	public ConsonantThread(char[] letters) {
		this.letters = letters;
	}

	// Method to find and print consonants
	@Override
	public void run() {
		System.out.print("Consonants: ");
		for (char letter : letters) {
			if (isConsonant(letter)) {
				System.out.print(letter + " ");
			}
		}
		System.out.println(); // New line after printing all consonants
	}

	// Helper method to check if a character is a consonant
	private boolean isConsonant(char letter) {
		return Character.isLetter(letter) && !isVowel(letter);
	}

	// Helper method to check if a character is a vowel
	private boolean isVowel(char letter) {
		return "AEIOUaeiou".indexOf(letter) != -1;
	}
}

// Main class to run the program
public class VowelConsonantFinder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] letters = new char[5];

		// Taking dynamic user input
		System.out.println("Enter 5 alphabets:");
		for (int i = 0; i < 5; i++) {
			letters[i] = scanner.next().charAt(0);
		}

		// Create threads for vowels and consonants
		VowelThread vowelThread = new VowelThread(letters);
		ConsonantThread consonantThread = new ConsonantThread(letters);

		// Start the threads
		vowelThread.start();
		consonantThread.start();

		// Wait for threads to finish
		try {
			vowelThread.join();
			consonantThread.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}

		scanner.close();
	}
}



// class diagram
//+-------------------------+
//		|        VowelThread      |
//		+-------------------------+
//		| - letters: char[]      |
//		+-------------------------+
//		| + VowelThread(char[])   |
//		| + run() : void          |
//		+-------------------------+
//
//		+-------------------------+
//		|      ConsonantThread    |
//		+-------------------------+
//		| - letters: char[]      |
//		+-------------------------+
//		| + ConsonantThread(char[])|
//		| + run() : void          |
//		+-------------------------+
//
//		+-------------------------+
//		|         Main           |
//		+-------------------------+
//		| + main(String[])       |
//		+-------------------------+
//		+-------------------------+