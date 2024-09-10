import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Reverse the linked list ");
		LinkedList<Integer> ll = new LinkedList<>();
		int size;
		System.out.println("Enter the size of the linked list ");
		size = sc.nextInt();
		for(int i = 0; i<size; i++){
			System.out.println("Enter your data:");
			int num  = sc.nextInt();
			ll.add(num);
		}
		int sum = 0;
		ListIterator<Integer> iterator = ll.listIterator();
		while(iterator.hasNext()){
			sum+= iterator.next();
		}
		System.out.println("the sum of the number :"+ sum);
	}
}
