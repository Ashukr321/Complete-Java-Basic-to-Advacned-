package hirericleInheritance;

import com.sun.source.tree.ReturnTree;

import java.util.Scanner;

class Animal {
	String name;

	Animal(String name) {
		this.name = name;
	}

	void eat() {
		System.out.println(name + " is eating:");
	}

	void sleep() {
		System.out.println(name + "  is Sleeping");
	}

	String getName() {
		return this.name;
	}
}

class Mammals extends Animal {
	public Mammals(String name) {
		super(name);
	}

	public void walk() {
		System.out.println(getName() + " is waling");
	}
}

class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}

	void bark() {
		System.out.println(getName() + " is barking");
	}
}

public class HirericleInheritanceEx1 {
	public static void main(String[] args) {
		System.out.println("Hirericle Inheritance in the java ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter animal name :");
		String name = sc.nextLine();
//		create the object of the Mammal
		Mammals m1 = new Mammals(name);
		m1.walk();
		m1.eat();
		m1.sleep();

		System.out.println("");
		System.out.println("Create the object of the Dog ");
		Dog d1 = new Dog("Tommy");
		d1.bark();
		d1.eat();
		d1.sleep();
	}
}
