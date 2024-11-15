public class _10_calling_1_cons_to_another {
	static  class Demo1 {
		public  Demo1(){
			System.out.println("this is default constructor");
		}
		public  Demo1(int a){
			// here  i want  to call the default constructor
			this();// this will call default const.
			System.out.println("this is parameter const");
			System.out.println(a);
		}
	}
	public static void main(String[] args) {

		System.out.println("calling 1 constructor from another constructor ");
		// create the object of the demo1
		Demo1 obj = new Demo1();

	}
}
