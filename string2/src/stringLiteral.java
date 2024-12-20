import java.lang.String;

public class stringLiteral {
	public static void main(String[] args) {
		System.out.println(" string literal  in the java ");
		// string literal store in the string constant pool
		String str =  "Ashutosh";
		System.out.println(str);
		System.out.println("\n");
		System.out.println("create str2 string literal ");

		String str2 = "Ashutosh";
		System.out.println(str2);
		// if the value is same in the string literal then they refer to the same
		// data
		System.out.println(str==str2);// true;

		System.out.println("String methods :");
		System.out.println();
		// toString methods is   deFined in the object class
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		// it is array of character so can we loop
		for (int i = 0; i<str.length(); i++){
			System.out.println(str.charAt(i));
		}



	}
}
