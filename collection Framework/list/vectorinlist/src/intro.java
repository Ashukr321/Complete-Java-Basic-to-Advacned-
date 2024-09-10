import java.util.Vector;

public class intro {
	public static void main(String[] args) {
		System.out.println("vector in the  java ");
		System.out.println("vector is similar to array   ");
		System.out.println("vector is dynamically in nature , grow and shrink dynamically ");

		Vector<String > vector = new Vector<>();
		vector.add("Apple");
		vector.add("Banana");
		vector.add("Cherry");
		System.out.println(vector);
		System.out.println("vector is synchronized in  nature this means that vector is thread safe ");
		System.out.println("slow performance than the arraylist bec, of synchronized in nature ");
		System.out.println();
		System.out.println("Real life application  where we can use the vector ");
		System.out.println("online shopping cart ");
		System.out.println("PlayList Management ");
		System.out.println("chat Room Message");
		System.out.println("To do List App");
		System.out.println("Online Survey");

	}
}
