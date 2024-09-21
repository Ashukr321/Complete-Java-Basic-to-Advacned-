package multiLevelInheritance;

class A {
	void eat() {
		System.out.println("Animal is eating:");
	}
}

class B extends A {
	void sleep() {
		System.out.println("Animal is sleeping:");
	}
}

class C extends B {
	void bark() {
		System.out.println("Animal is barking");
	}
}

public class MultiLevelInheritanceEx1 {
	public static void main(String[] args) {
		System.out.println("MultiLevel Inheritance in the java :");
		// here we create the child class object C
		C obj = new C();
		// calling parent class methods
		obj.eat();
		obj.sleep();
		obj.bark();
	}
}
