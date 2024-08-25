import java.util.Arrays;
import java.util.Scanner;

public class Demo {

	// Method for Linear Search
	public static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i; // Return the index where the key is found
			}
		}
		return -1; // Key not found
	}

	// Method for Binary Search
	public static int binarySearch(int[] arr, int key) {
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;

			// Check if key is present at mid
			if (arr[mid] == key) {
				return mid;
			}

			// If key is greater, ignore left half
			if (arr[mid] < key) {
				left = mid + 1;
			}
			// If key is smaller, ignore right half
			else {
				right = mid - 1;
			}
		}
		return -1; // Key not found
	}

	// Method for Bubble Sort
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					// Swap arr[j] and arr[j + 1]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Please provide a set of integers as command line arguments.");
			return;
		}

		// Convert command line arguments to integer array
		int[] arr = new int[args.length];
		try {
			for (int i = 0; i < args.length; i++) {
				arr[i] = Integer.parseInt(args[i]);
			}
		} catch (NumberFormatException e) {
			System.out.println("Please ensure all command line arguments are integers.");
			return;
		}

		Scanner scanner = new Scanner(System.in);
		boolean sorted = false;

		while (true) {
			// Display menu options
			System.out.println("\nMenu:");
			System.out.println("1. Linear Search");
			System.out.println("2. Binary Search");
			System.out.println("3. Bubble Sort");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
				case 1:
					System.out.print("Enter the key to search (Linear Search): ");
					int linearKey = scanner.nextInt();
					int linearIndex = linearSearch(arr, linearKey);
					if (linearIndex != -1) {
						System.out.println("Key found at index: " + linearIndex);
					} else {
						System.out.println("Key not found.");
					}
					break;

				case 2:
					if (!sorted) {
						System.out.println("Array is not sorted. Sorting before Binary Search...");
						bubbleSort(arr);
						sorted = true;
					}
					System.out.print("Enter the key to search (Binary Search): ");
					int binaryKey = scanner.nextInt();
					int binaryIndex = binarySearch(arr, binaryKey);
					if (binaryIndex != -1) {
						System.out.println("Key found at index: " + binaryIndex);
					} else {
						System.out.println("Key not found.");
					}
					break;

				case 3:
					bubbleSort(arr);
					sorted = true;
					System.out.println("Array sorted using Bubble Sort: " + Arrays.toString(arr));
					break;

				case 4:
					System.out.println("Exiting the program.");
					scanner.close();
					return;

				default:
					System.out.println("Invalid choice! Please try again.");
			}
		}
	}
}
