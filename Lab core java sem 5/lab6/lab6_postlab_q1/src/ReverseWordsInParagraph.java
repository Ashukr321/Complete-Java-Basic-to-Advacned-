import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReverseWordsInParagraph {

	public static void main(String[] args) {
		String filePath = "input.txt"; // Path to the file containing the paragraph
		StringBuilder paragraph = new StringBuilder();

		// Read the paragraph from the file
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = reader.readLine()) != null) {
				paragraph.append(line).append(" ");
			}
		} catch (IOException e) {
			System.out.println("Error reading the file: " + e.getMessage());
			return;
		}

		// Reverse the sequence of letters in each word
		String reversedParagraph = reverseWords(paragraph.toString().trim());

		// Display the reversed paragraph
		System.out.println("Reversed paragraph:");
		System.out.println(reversedParagraph);
	}

	// Method to reverse each word in the paragraph
	public static String reverseWords(String paragraph) {
		String[] words = paragraph.split("\\s+");
		StringBuilder reversedParagraph = new StringBuilder();

		for (String word : words) {
			// Reverse the letters in the word and append to the result
			String reversedWord = new StringBuilder(word).reverse().toString();
			reversedParagraph.append(reversedWord).append(" ");
		}

		return reversedParagraph.toString().trim();
	}
}
