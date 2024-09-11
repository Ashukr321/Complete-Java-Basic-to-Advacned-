import java.util.Scanner;

public class Spliting_String {
	public static void main(String[] args) {
		System.out.println("Splitting the string");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string");
		String name = sc.nextLine();
		String[] words = name.split("\\s*,\\s*");

		for (String str : words) {
			System.out.println(str);
		}
	}
}