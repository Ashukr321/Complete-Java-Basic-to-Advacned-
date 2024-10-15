import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class ex2 {
	public static void main(String[] args) {
		int[] arr = null;
		try {
			arr = new int[-3];
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("we can't give the size of the array -ve");
		}

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		int idx;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Idx");
		idx = sc.nextInt();
		try {
			System.out.println(arr[idx]);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("we can't access array element at index:" + idx);
		}
	}
}
