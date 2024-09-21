import java.util.Scanner;

class Animal {
	String name;

	public Animal(String name) {
		this.name = name;
	}

	void eat() {
		System.out.println(this.name + " is eating");
	}
	void  sleep(){
		System.out.println(this.name+" is sleeping");
	}
}

class Dog extends Animal {

	//	 we must have to create the constructor bec. parent class have constructor
	public Dog(String name) {
		super(name);
	}
}

public class SingleInheritance {
	public static void main(String[] args) {
		System.out.println("Single  level inheritance in the java ");
		System.out.println("Create the Object of the Dog Class :");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your dog name:");
		String dName = sc.nextLine();


		Dog d1 = new Dog(dName);
		d1.eat();
		// call the child class object to parent class state variables
		d1.sleep();
	}
}
