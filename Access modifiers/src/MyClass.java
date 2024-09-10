
public class MyClass {
	public int publicVar = 10;
	int defaultVar = 20; // default access modifier
	private int privateVar = 30;
	protected int protectedVar = 40;

	public void publicMethod() {
		System.out.println("Public method");
	}

	void defaultMethod() {
		System.out.println("Default method");
	}
	private void privateMethod() {
		System.out.println("Private method");
	}

	protected void protectedMethod() {
		System.out.println("Protected method");
	}


	public static class MySubclass extends MyClass {
		public void testAccess() {
			System.out.println(publicVar); // accessible
			// System.out.println(defaultVar); // not accessible
			// System.out.println(privateVar); // not accessible
			System.out.println(protectedVar); // accessible

			publicMethod(); // accessible
			// defaultMethod(); // not accessible
			// privateMethod(); // not accessible
			protectedMethod(); // accessible
		}
	}

	public static void main(String[] args) {
		MySubclass obj = new MySubclass();
		obj.testAccess();
	}
}
