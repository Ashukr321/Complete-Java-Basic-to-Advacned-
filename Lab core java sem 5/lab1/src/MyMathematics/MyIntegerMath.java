package MyMathematics;

public class MyIntegerMath {
	public static long factorial(int num) {
		// Initialize fact to 1
		long fact = 1;
		for (int i = 2; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}

	public static boolean isStrong(int num) {
		int originalNum = num;
		int sum = 0;
		while (num != 0) {
			int digit = num % 10;
			sum += factorial(digit);
			num = num / 10;
		}
		return sum == originalNum;
	}
}
