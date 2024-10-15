import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class ex2 {
	public static void main(String[] args) {
		int []arr = new int[4];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		for (int i = 0 ; i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println();
		int idx;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Idx");
		idx = sc.nextInt();
		try{
		System.out.println(arr[idx]);

		}catch (Exception e){
			System.out.println("we can't access array element at index:"+ idx);
		}
	}
}
