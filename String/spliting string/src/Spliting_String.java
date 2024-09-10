import java.util.Formattable;
import java.util.Scanner;
import java.util.SequencedCollection;

public class Spliting_String {
	public static void main(String[] args) {
		System.out.println("spliting  the string ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string ");
		String name  = sc.nextLine();
		String []words = name.split("\\s+");
//		System.out.println(words[0]);
		// for each loop in the java

		for (String str:words){
			System.out.println(str);
		}
	}
}
