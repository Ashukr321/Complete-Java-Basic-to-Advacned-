import java.util.Random;

public class LinearSearchTiming {

	// Method for Linear Search
	public static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i; // Return the index where the key is found
			}
		}
		return -1; // Key not found
	}

	public static void main(String[] args) {
		Random random = new Random();

		// Generate an array of 100,000 random integers
		int[] arr = new int[100_000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(1_000_000); // Random integers between 0 and 999,999
		}

		// Best Case: Key is the first element
		int bestKey = arr[0];
		long startTime = System.currentTimeMillis();
		linearSearch(arr, bestKey);
		long endTime = System.currentTimeMillis();
		long bestCaseTime = endTime - startTime;
		System.out.println("Best Case Execution Time: " + bestCaseTime + " milliseconds");

		// Average Case: Key is in the middle of the array
		int averageKey = arr[arr.length / 2];
		startTime = System.currentTimeMillis();
		linearSearch(arr, averageKey);
		endTime = System.currentTimeMillis();
		long averageCaseTime = endTime - startTime;
		System.out.println("Average Case Execution Time: " + averageCaseTime + " milliseconds");

		// Worst Case: Key is the last element
		int worstKey = arr[arr.length - 1];
		startTime = System.currentTimeMillis();
		linearSearch(arr, worstKey);
		endTime = System.currentTimeMillis();
		long worstCaseTime = endTime - startTime;
		System.out.println("Worst Case Execution Time: " + worstCaseTime + " milliseconds");

		// Not Found Case: Key is not in the array
		int notFoundKey = -1; // Assuming all elements in the array are non-negative
		startTime = System.currentTimeMillis();
		linearSearch(arr, notFoundKey);
		endTime = System.currentTimeMillis();
		long notFoundCaseTime = endTime - startTime;
		System.out.println("Not Found Case Execution Time: " + notFoundCaseTime + " milliseconds");
	}
}
