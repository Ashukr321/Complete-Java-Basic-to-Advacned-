import javax.swing.plaf.IconUIResource;

// abstract class we can't create abstract class  object
abstract class Animal {
	// create the abstract method
	public abstract void sound();

	public void eat() {
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal {
	public void sound() {
		System.out.println("Dog is barking :");
	}
}

public class IntroAbstract {

	public static void main(String[] args) {
		// create the object of the parent class Animal
//		Dog d1 = new Dog();
//		d1.sound();
//		d1.eat();

		// can we create the object of the abstract class
//		Animal animal = new Animal();// we can't create the object of the abstract class
		Animal animal1 = new Dog();
		//⭐⭐ Abstract class reference can hold the object of the sub class
		animal1.sound();
		animal1.eat();
	}
}

