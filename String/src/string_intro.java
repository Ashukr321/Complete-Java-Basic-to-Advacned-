public class string_intro {
	public static void main(String[] args) {
		System.out.println("String in java ");
		String name = "Ashutosh kumar";
		String n1  = "Ashutosh kumar";
//		n1.equalsIgnoreCase() this will ignore the case of the string

		System.out.println(name.equalsIgnoreCase(n1));
		System.out.println(name.length());
		// convert into lower case
		System.out.println(name.toLowerCase());
		// convert into upper case
		System.out.println(name.toUpperCase());

		// == comparison operator
		System.out.println(name==n1);
	}
}
