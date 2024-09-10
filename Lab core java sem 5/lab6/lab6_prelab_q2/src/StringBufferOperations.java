import java.util.Scanner;

public class StringBufferOperations {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int choice;

		System.out.println("Enter an initial string for the StringBuffer:");
		sb.append(scanner.nextLine());

		do {
			System.out.println("\nMenu:");
			System.out.println("1. charAt()");
			System.out.println("2. append()");
			System.out.println("3. capacity()");
			System.out.println("4. length()");
			System.out.println("5. delete()");
			System.out.println("6. deleteCharAt()");
			System.out.println("7. insert()");
			System.out.println("8. reverse()");
			System.out.println("9. replace()");
			System.out.println("10. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character

			switch (choice) {
				case 1:
					System.out.print("Enter index for charAt(): ");
					int index = scanner.nextInt();
					try {
						System.out.println("Character at index " + index + ": " + sb.charAt(index));
					} catch (StringIndexOutOfBoundsException e) {
						System.out.println("Index out of bounds.");
					}
					break;

				case 2:
					System.out.print("Enter string to append: ");
					String appendStr = scanner.nextLine();
					sb.append(appendStr);
					System.out.println("Updated StringBuffer: " + sb);
					break;

				case 3:
					System.out.println("Current capacity of the StringBuffer: " + sb.capacity());
					break;

				case 4:
					System.out.println("Current length of the StringBuffer: " + sb.length());
					break;

				case 5:
					System.out.print("Enter start index for delete: ");
					int start = scanner.nextInt();
					System.out.print("Enter end index for delete: ");
					int end = scanner.nextInt();
					try {
						sb.delete(start, end);
						System.out.println("Updated StringBuffer: " + sb);
					} catch (StringIndexOutOfBoundsException e) {
						System.out.println("Start or end index out of bounds.");
					}
					break;

				case 6:
					System.out.print("Enter index for deleteCharAt(): ");
					index = scanner.nextInt();
					try {
						sb.deleteCharAt(index);
						System.out.println("Updated StringBuffer: " + sb);
					} catch (StringIndexOutOfBoundsException e) {
						System.out.println("Index out of bounds.");
					}
					break;

				case 7:
					System.out.print("Enter index for insert: ");
					index = scanner.nextInt();
					scanner.nextLine(); // Consume the newline character
					System.out.print("Enter string to insert: ");
					String insertStr = scanner.nextLine();
					try {
						sb.insert(index, insertStr);
						System.out.println("Updated StringBuffer: " + sb);
					} catch (StringIndexOutOfBoundsException e) {
						System.out.println("Index out of bounds.");
					}
					break;

				case 8:
					sb.reverse();
					System.out.println("Reversed StringBuffer: " + sb);
					break;

				case 9:
					System.out.print("Enter start index for replace: ");
					start = scanner.nextInt();
					System.out.print("Enter end index for replace: ");
					end = scanner.nextInt();
					scanner.nextLine(); // Consume the newline character
					System.out.print("Enter string to replace with: ");
					String replaceStr = scanner.nextLine();
					try {
						sb.replace(start, end, replaceStr);
						System.out.println("Updated StringBuffer: " + sb);
					} catch (StringIndexOutOfBoundsException e) {
						System.out.println("Start or end index out of bounds.");
					}
					break;

				case 10:
					System.out.println("Exiting program...");
					break;

				default:
					System.out.println("Invalid choice. Please choose again.");
			}
		} while (choice != 10);

		scanner.close();
	}
}
