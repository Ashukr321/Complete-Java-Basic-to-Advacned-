import java.util.Scanner;

abstract class Animal {
	String name;

	Animal(String name) {
		this.name = name;
	}

	abstract public void eat();
}

class Cat extends Animal {

	// Constructor for Cat
	Cat(String name) {
		super(name);
	}

	public void eat() {
		System.out.println(name + " the cat is eating");
	}
}

public class MyClass {
	public static void main(String[] args) {
		// Create the scanner class
		Scanner sc = new Scanner(System.in);
		String name;
		
		System.out.println("Enter your cat's name: ");
		name = sc.nextLine();
		Cat obj = new Cat(name);
		obj.eat();

		sc.close();
	}
}