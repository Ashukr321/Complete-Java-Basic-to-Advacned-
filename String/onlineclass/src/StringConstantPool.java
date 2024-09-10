import org.w3c.dom.ls.LSOutput;

public class StringConstantPool {
	public static String s1 = "Hello";
	public static String s2 = "Hello";

	public static void main(String[] args) {
		System.out.println(s1 == s2); // true
		System.out.println(s1.equalsIgnoreCase(s2));
	}

}