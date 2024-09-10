import java.util.LinkedList;
import java.util.ListIterator;

public class _1_prg {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(2);
		linkedList.add(23);
		ListIterator<Integer> iterator = linkedList.listIterator();
		while (iterator.hasNext()){
			System.out.print(iterator.next()+"->");

		}
		System.out.println("null");
	}
}