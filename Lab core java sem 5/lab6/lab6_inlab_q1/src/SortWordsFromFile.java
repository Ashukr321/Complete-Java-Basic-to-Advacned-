import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class SortWordsFromFile {

	public static void main(String[] args) {
		String filePath = "input.txt"; // Path to the file containing the paragraph
		String paragraph = "";

		// Read the paragraph from the file
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				sb.append(line).append(" ");
			}
			paragraph = sb.toString().trim();
		} catch (IOException e) {
			System.out.println("Error reading the file: " + e.getMessage());
			return;
		}

		// Extract words and sort them
		String[] words = paragraph.split("\\s+");
		bubbleSort(words);

		// Display the sorted list of words
		System.out.println("Sorted list of words:");
		for (String word : words) {
			System.out.println(word);
		}
	}

	// Bubble sort method to sort the words array
	public static void bubbleSort(String[] words) {
		int n = words.length;
		boolean swapped;
		do {
			swapped = false;
			for (int i = 0; i < n - 1; i++) {
				if (words[i].compareToIgnoreCase(words[i + 1]) > 0) {
					// Swap words[i] and words[i + 1]
					String temp = words[i];
					words[i] = words[i + 1];
					words[i + 1] = temp;
					swapped = true;
				}
			}
			n--; // Reduce the range of comparison after each pass
		} while (swapped);
	}
}
