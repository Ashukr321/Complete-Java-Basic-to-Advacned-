package prelabq1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first number:");
		int num1 = scanner.nextInt();

		System.out.println("Enter the second number:");
		int num2 = scanner.nextInt();

		try (BufferedWriter writer = new BufferedWriter(new FileWriter("input.txt"))) {
			writer.write(num1 + " " + num2);
			System.out.println("Numbers written to file successfully.");
		} catch (IOException e) {
			System.out.println("Error writing to file: " + e.getMessage());
		}




		try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
			String data = reader.readLine();
			if (data != null) {
				String[] numbers = data.split(" ");
				if (numbers.length == 2) {
					int numA = Integer.parseInt(numbers[0]);
					int numB = Integer.parseInt(numbers[1]);
					int sum = numA + numB;
					System.out.println("The sum of the numbers: " + sum);
				} else {
					System.out.println("Invalid data in the file");
				}
			} else {
				System.out.println("File is empty");
			}
		} catch (IOException e) {
			System.out.println("Error reading from file: " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Invalid number format in the file");
		}
	}
}