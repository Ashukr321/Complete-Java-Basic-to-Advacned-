import java.util.Scanner;
import java.util.Vector;

public class _1_prg {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		int size;

		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the size of the the vector");
		size = sc.nextInt();
		for(int i = 0 ;i<size; i++){
			vector.add(i);
		}

		System.out.println(vector);
		System.out.println(vector.size());
		System.out.println(vector.capacity());
	}
}
