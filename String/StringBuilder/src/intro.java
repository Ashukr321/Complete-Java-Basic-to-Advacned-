import java.sql.SQLOutput;

public class intro {
	public static void main(String[] args) {
		System.out.println("String builder allow us to create and update it ");
		StringBuilder str = new StringBuilder("Hello");
		str.append(" world");
		System.out.println(str);
		System.out.println("we can easily mutate the string");
		System.out.println("String is   thread safe");
		// string builder is not thread safe
		// this is use in single threaded environment
	}
}
