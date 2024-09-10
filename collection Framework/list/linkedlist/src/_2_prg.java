
import java.util.Collections;
import java.util.LinkedList;

public class _2_prg {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(12);
		ll.add("Ashutosh");
		ll.add("23");
		Collections.reverse(ll); // this method reverse the linked list completely in
		System.out.println(ll);
		System.out.println("this will  print in the form of the array :");
		System.out.println(ll.size());//size will give the number of elements presents in the array
		System.out.println();
		System.out.println("print the linked list ");
		for(int i = 0; i<ll.size(); i++){
			System.out.println(ll.get(i));
		}
	}
}
