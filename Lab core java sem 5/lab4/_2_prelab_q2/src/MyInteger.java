import java.util.Scanner;

public class MyInteger {
	// instance variables
	static int value;

	// constructor
	MyInteger(int value) {
		this.value = value;
	}

	// getter methods
	int getValue() {
		return this.value;
	}

	// member function
	public static boolean isEven() {
		if (value % 2 == 0) {
			return true;
		}
		return false;
	}

	public static boolean isOdd() {
		if (value % 2 != 0) {
			return true;
		}
		return false;
	}

	public static boolean isPrime() {
		if (value <= 1) {
			return false;
		}
		for (int i = 2; i * i <= value; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}

	// using recursion
	public static long factorial(int n) {
		// base case
		if (n == 0) {
			return 1;
		} else {
			// Recursive call
			return n * factorial(n - 1);
		}
	}


	public static boolean equals(MyInteger Obj) {
		return value == Obj.getValue();
	}

	public static int[] parseInt(char[] chars) {
		int[] result = new int[chars.length];
		for (int i = 0; i < chars.length; i++) {
			result[i] = chars[i] - '0';
		}
		return result;
	}

	public static int parseInt(String str) {
		return Integer.parseInt(str);
	}

	public static void main(String[] args) {
		System.out.println("solution of the prelab question 1 of lab 4 ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your value :");
		int value = sc.nextInt();
		// create the object of the class
		MyInteger obj = new MyInteger(value);
		System.out.println("getValue :" + obj.getValue());
		System.out.println("isEven " + isEven()); // corrected to static method call
		System.out.println("isOdd " + isOdd()); // corrected to static method call
		System.out.println("check Prime :" + isPrime()); // corrected to static method call
		System.out.println("Enter your character:");
		String charData = sc.next(); // corrected to next() instead of nextLine()
		char[] chArr = charData.toCharArray(); // corrected to toCharArray()
		int[] intArr = parseInt(chArr);
		for (int i : intArr) {
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println("Factorial of number :");
		int n = sc.nextInt();
		System.out.println(obj.factorial(n));

	}
}