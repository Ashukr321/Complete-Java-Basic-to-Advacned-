import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class _2_prg {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of the array list");
		size= sc.nextInt();
		for(int i = 0; i<size; i++){
			int data;
			System.out.println("Enter your data");
			data = sc.nextInt();
			arr.add(data);
		}
		Integer [] arrayElement = arr.toArray(new Integer[0]);
		System.out.println("print array list element after converting into array");
		int sum  = 0;
		for (int data :arrayElement){
			sum+=data;
			System.out.println(data);
		}
		System.out.println("the sum of the array element :"+sum);
	}
}
