import java.util.Scanner;

// Interface definition
interface Animal {
	void sound();
}

// Class implementation
class Dog implements Animal {
	private String name;

	public Dog(String name) {
		this.name = name;
	}

	@Override
	public void sound() {
		System.out.println(this.name + " Dog is barking!");
	}
}

public class Intro {
	public static void main(String[] args) {
		System.out.println("Interface in Java");
		System.out.println("We can't create an instance of the interface");
		System.out.println(" A interface can't have constructor ! ");

		Scanner sc = new Scanner(System.in);
		String name;
		System.out.print("Enter your name: ");
		name = sc.nextLine();

		// Create an object of the Dog class
		Dog d1 = new Dog(name);

		// Call the Dog method
		d1.sound();
	}
}