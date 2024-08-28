public class _1_static_block_and_initializer {
	public  static  void hello(){
		System.out.println("Hello world kaise ho bhai ?");
	}

//	instance variable

	//this is also know as static initializer
	static {
		System.out.println("this is block level code");
	}
	public static void main(String[] args) {
		System.out.println("static block in the java ");
		//		Rules of static block
		/* ⭐⭐⭐⭐⭐⭐
			memory allocation of static block  during the  compile time
			it shared with all the object of the class
			 can be access without class object and directly with  the class reference
			static block first executed as compared to static methods
			static block only call the static data members or static methods

			due to main methods is a static methods so that they can call the static methods
		 */
		_1_static_block_and_initializer.hello();
	}
}
