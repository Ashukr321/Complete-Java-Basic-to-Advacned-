public class Unboxing {
	public static void main(String[] args) {
        /*
        Unboxing is the reverse process of autoboxing, in which the data is converted from
        a wrapper class to a primitive data type.
         */
		Integer wrapperInteger = new Integer(20); // Corrected variable name
		int data = wrapperInteger; // Unboxing occurs here
		System.out.println(data);
	}
}