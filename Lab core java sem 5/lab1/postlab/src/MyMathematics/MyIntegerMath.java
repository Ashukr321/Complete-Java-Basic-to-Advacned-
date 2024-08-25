package MyMathematics;

public class MyIntegerMath {
	public int countDigits(int num) {
		int count = 0;
		while (num != 0) {
			num /= 10;
			count++;
		}
		return count;
	}

	public boolean isArmstrong(int num) {
		int originalNum = num;
		int sum = 0;
		int n = countDigits(num);

		while (num != 0) {
			int digit = num % 10;
			sum += Math.pow(digit, n);
			num /= 10;
		}

		return sum == originalNum;
	}
}