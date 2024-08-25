import java.util.Scanner;

public class MatrixOperations {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Check if the number of arguments is less than 2
		if (args.length < 2) {
			System.out.println("Please provide the number of rows and columns as command-line arguments.");
			return;
		}

		// Reading number of rows and columns from the command line arguments
		int rows = Integer.parseInt(args[0]);
		int columns = Integer.parseInt(args[1]);

		// Initialize the 2D array
		int[][] matrix = new int[rows][columns];

		// Reading the elements of the matrix from the console
		System.out.println("Enter the elements of the matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}

		// Menu-driven operations
		while (true) {
			System.out.println("\nMenu:");
			System.out.println("1. Sum of all elements");
			System.out.println("2. Print the matrix");
			System.out.println("3. Print the elements of the principal diagonal");
			System.out.println("4. Sum of the elements in the principal diagonal");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
				case 1:
					System.out.println("Sum of all elements: " + sumOfElements(matrix));
					break;
				case 2:
					System.out.println("Matrix:");
					printMatrix(matrix);
					break;
				case 3:
					System.out.println("Principal diagonal elements:");
					printPrincipalDiagonal(matrix);
					break;
				case 4:
					System.out.println("Sum of elements in the principal diagonal: " + sumOfPrincipalDiagonal(matrix));
					break;
				case 5:
					System.out.println("Exiting...");
					System.exit(0);
				default:
					System.out.println("Invalid choice. Please try again.");
			}
		}
	}

	// Method to calculate the sum of all elements in the matrix
	public static int sumOfElements(int[][] matrix) {
		int sum = 0;
		for (int[] row : matrix) {
			for (int element : row) {
				sum += element;
			}
		}
		return sum;
	}

	// Method to print the matrix
	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}

	// Method to print the principal diagonal elements
	public static void printPrincipalDiagonal(int[][] matrix) {
		int minDim = Math.min(matrix.length, matrix[0].length);
		for (int i = 0; i < minDim; i++) {
			System.out.print(matrix[i][i] + " ");
		}
		System.out.println();
	}

	// Method to calculate the sum of the elements in the principal diagonal
	public static int sumOfPrincipalDiagonal(int[][] matrix) {
		int sum = 0;
		int minDim = Math.min(matrix.length, matrix[0].length);
		for (int i = 0; i < minDim; i++) {
			sum += matrix[i][i];
		}
		return sum;
	}
}
