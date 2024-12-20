import java.lang.String;
public class StringBuilderEx {
	public static void main(String[] args) {
		// This is similar to StringBuffer but is single-threaded in nature
		StringBuilder sbi = new StringBuilder("ashu");
		System.out.println(sbi); // Output: ashu

		// Uncommenting the following line would show the capacity of the StringBuilder
		// System.out.println(sbi.capacity());

		System.out.println(sbi.length()); // Output: 4 (length of "ashu")

		sbi.append("tosh"); // Appends "tosh" to the StringBuilder
		System.out.println(sbi); // Output: ashutosh

		String str = "ashutosh"; // String literal
		String str2 = sbi.toString().intern();
		System.out.println(str==str2);// true
	}
}