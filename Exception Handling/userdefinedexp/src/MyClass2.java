import java.sql.SQLOutput;
import java.util.Scanner;

public class MyClass2 {
	static void getData(int a, int b) throws CheckInvalidInput {
		if (b == 0) {
			throw new CheckInvalidInput("enter valid data b>0");
		}
		System.out.println(a / b);
	}

	public static void main(String[] args) {
//		create the scanner class to take the user input
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Enter a:");
		a = sc.nextInt();
		System.out.println("\nEnter b:");
		b = sc.nextInt();

		MyClass2.getData(a, b);

	}
}
