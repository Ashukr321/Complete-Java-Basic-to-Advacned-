public class _4_super_keywords_in_java {
	// uses of super keywords in java
    /*
        1. super keywords
        1. super keywords use for calling the parent class constructor
        2. super keywords use of  the parent class methods from non-static methods
		3. chaining the methods using  super keywords
     */
	public static class Parent {
		Parent() {
			System.out.println("parent constructor call ");
		}
		public  void parentMethod(){
			System.out.println("this is parent class methods ");
		}
	}

	public static class Child extends Parent {
		Child() {
			super();
			System.out.println("Child constructor call");
		}
		public void  childMethods (){
			System.out.println("this is child class methods");
			super.parentMethod();
		}
	}

	public static void main(String[] args) {
		System.out.println("Uses of super keywords in the java ");
		Child c1 = new Child();
		c1.childMethods();
	}
}