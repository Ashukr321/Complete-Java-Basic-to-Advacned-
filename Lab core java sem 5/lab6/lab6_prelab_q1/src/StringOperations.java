import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str;
		int choice;

		System.out.println("Enter a string:");
		str = scanner.nextLine();

		do {
			System.out.println("\nMenu:");
			System.out.println("1. charAt()");
			System.out.println("2. length()");
			System.out.println("3. indexOf()");
			System.out.println("4. lastIndexOf()");
			System.out.println("5. substring()");
			System.out.println("6. valueOf()");
			System.out.println("7. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character

			switch (choice) {
				case 1:
					System.out.print("Enter index for charAt(): ");
					int index = scanner.nextInt();
					try {
						System.out.println("Character at index " + index + ": " + str.charAt(index));
					} catch (StringIndexOutOfBoundsException e) {
						System.out.println("Index out of bounds.");
					}
					break;

				case 2:
					System.out.println("Length of the string: " + str.length());
					break;

				case 3:
					System.out.println("indexOf() Options:");
					System.out.println("a) Single character");
					System.out.println("b) Character with starting index");
					System.out.println("c) Substring");
					System.out.println("d) Substring with starting index");
					System.out.print("Choose an option: ");
					char subChoice = scanner.next().charAt(0);
					scanner.nextLine(); // Consume newline

					switch (subChoice) {
						case 'a':
							System.out.print("Enter character: ");
							char ch = scanner.next().charAt(0);
							System.out.println("First occurrence of '" + ch + "': " + str.indexOf(ch));
							break;

						case 'b':
							System.out.print("Enter character: ");
							ch = scanner.next().charAt(0);
							System.out.print("Enter starting index: ");
							int startIndex = scanner.nextInt();
							System.out.println("First occurrence of '" + ch + "' from index " + startIndex + ": " + str.indexOf(ch, startIndex));
							break;

						case 'c':
							System.out.print("Enter substring: ");
							String subStr = scanner.nextLine();
							System.out.println("First occurrence of \"" + subStr + "\": " + str.indexOf(subStr));
							break;

						case 'd':
							System.out.print("Enter substring: ");
							subStr = scanner.nextLine();
							System.out.print("Enter starting index: ");
							startIndex = scanner.nextInt();
							System.out.println("First occurrence of \"" + subStr + "\" from index " + startIndex + ": " + str.indexOf(subStr, startIndex));
							break;

						default:
							System.out.println("Invalid option.");
					}
					break;

				case 4:
					System.out.println("lastIndexOf() Options:");
					System.out.println("a) Single character");
					System.out.println("b) Character with starting index");
					System.out.println("c) Substring");
					System.out.println("d) Substring with starting index");
					System.out.print("Choose an option: ");
					subChoice = scanner.next().charAt(0);
					scanner.nextLine(); // Consume newline

					switch (subChoice) {
						case 'a':
							System.out.print("Enter character: ");
							char ch = scanner.next().charAt(0);
							System.out.println("Last occurrence of '" + ch + "': " + str.lastIndexOf(ch));
							break;

						case 'b':
							System.out.print("Enter character: ");
							ch = scanner.next().charAt(0);
							System.out.print("Enter starting index: ");
							int startIndex = scanner.nextInt();
							System.out.println("Last occurrence of '" + ch + "' from index " + startIndex + ": " + str.lastIndexOf(ch, startIndex));
							break;

						case 'c':
							System.out.print("Enter substring: ");
							String subStr = scanner.nextLine();
							System.out.println("Last occurrence of \"" + subStr + "\": " + str.lastIndexOf(subStr));
							break;

						case 'd':
							System.out.print("Enter substring: ");
							subStr = scanner.nextLine();
							System.out.print("Enter starting index: ");
							startIndex = scanner.nextInt();
							System.out.println("Last occurrence of \"" + subStr + "\" from index " + startIndex + ": " + str.lastIndexOf(subStr, startIndex));
							break;

						default:
							System.out.println("Invalid option.");
					}
					break;

				case 5:
					System.out.println("substring() Options:");
					System.out.println("a) From starting index");
					System.out.println("b) From starting index to ending index");
					System.out.print("Choose an option: ");
					subChoice = scanner.next().charAt(0);
					scanner.nextLine(); // Consume newline

					switch (subChoice) {
						case 'a':
							System.out.print("Enter starting index: ");
							int start = scanner.nextInt();
							try {
								System.out.println("Substring from index " + start + ": " + str.substring(start));
							} catch (StringIndexOutOfBoundsException e) {
								System.out.println("Index out of bounds.");
							}
							break;

						case 'b':
							System.out.print("Enter starting index: ");
							start = scanner.nextInt();
							System.out.print("Enter ending index: ");
							int end = scanner.nextInt();
							try {
								System.out.println("Substring from index " + start + " to " + end + ": " + str.substring(start, end));
							} catch (StringIndexOutOfBoundsException e) {
								System.out.println("Index out of bounds.");
							}
							break;

						default:
							System.out.println("Invalid option.");
					}
					break;

				case 6:
					System.out.println("valueOf() Options:");
					System.out.println("a) int");
					System.out.println("b) char");
					System.out.println("c) char array");
					System.out.println("d) char array with offset and count");
					System.out.println("e) boolean");
					System.out.println("f) long");
					System.out.println("g) float");
					System.out.println("h) double");
					System.out.print("Choose an option: ");
					subChoice = scanner.next().charAt(0);
					scanner.nextLine(); // Consume newline

					switch (subChoice) {
						case 'a':
							System.out.print("Enter an integer: ");
							int intValue = scanner.nextInt();
							System.out.println("String representation of int: " + String.valueOf(intValue));
							break;

						case 'b':
							System.out.print("Enter a character: ");
							char charValue = scanner.next().charAt(0);
							System.out.println("String representation of char: " + String.valueOf(charValue));
							break;

						case 'c':
							System.out.print("Enter a char array (e.g., a,b,c): ");
							char[] charArray = scanner.next().replaceAll(",", "").toCharArray();
							System.out.println("String representation of char array: " + String.valueOf(charArray));
							break;

						case 'd':
							System.out.print("Enter a char array (e.g., a,b,c): ");
							charArray = scanner.next().replaceAll(",", "").toCharArray();
							System.out.print("Enter offset: ");
							int offset = scanner.nextInt();
							System.out.print("Enter count: ");
							int count = scanner.nextInt();
							try {
								System.out.println("String representation of char array with offset and count: " + String.valueOf(charArray, offset, count));
							} catch (StringIndexOutOfBoundsException e) {
								System.out.println("Offset or count out of bounds.");
							}
							break;

						case 'e':
							System.out.print("Enter a boolean value: ");
							boolean boolValue = scanner.nextBoolean();
							System.out.println("String representation of boolean: " + String.valueOf(boolValue));
							break;

						case 'f':
							System.out.print("Enter a long value: ");
							long longValue = scanner.nextLong();
							System.out.println("String representation of long: " + String.valueOf(longValue));
							break;

						case 'g':
							System.out.print("Enter a float value: ");
							float floatValue = scanner.nextFloat();
							System.out.println("String representation of float: " + String.valueOf(floatValue));
							break;

						case 'h':
							System.out.print("Enter a double value: ");
							double doubleValue = scanner.nextDouble();
							System.out.println("String representation of double: " + String.valueOf(doubleValue));
							break;

						default:
							System.out.println("Invalid option.");
					}
					break;

				case 7:
					System.out.println("Exiting program...");
					break;

				default:
					System.out.println("Invalid choice. Please choose again.");
			}
		} while (choice != 7);

		scanner.close();
	}
}
