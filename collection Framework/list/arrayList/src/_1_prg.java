import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class _1_prg {
	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of the array list :");
		size = sc.nextInt();

		sc.nextLine();
		for(int i = 0; i < size; i++){
			System.out.println("Enter user data " + (i+1));
			String user = sc.nextLine();
			arr.add(user);
		}

		//  we want to iterate the list
		//for iterating the list we have ListIterator
		ListIterator<String> iterator = arr.listIterator();

		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}