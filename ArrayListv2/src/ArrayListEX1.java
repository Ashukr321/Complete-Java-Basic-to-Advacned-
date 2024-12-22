import java.util.ArrayList;
import java.util.Scanner;

class Std {
	// instance variables
	int age;
	String name;

	// constructor
	Std(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public void printInfo() {
		System.out.println(this.age + " " + this.name);
	}
}

public class ArrayListEX1 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(1);
		arr.add(2);
		arr.add(3);
		System.out.println(arr.get(1));

		// create the 5 objects of the student
		Scanner sc = new Scanner(System.in);
		// create Array List
		ArrayList<Std> students = new ArrayList<Std>();
		for (int i = 0; i < 5; i++) {
			int age;
			String sname;
			System.out.println("Enter student age " + (i + 1) + ":");
			age = sc.nextInt();
			sc.nextLine(); // Consume the newline character left by nextInt()
			System.out.println("Enter student name " + (i + 1) + ":");
			sname = sc.nextLine();
			// create object
			Std st = new Std(age, sname);
			students.add(st);
		}

		System.out.println("Print all student info:");
		for (int i = 0; i < students.size(); i++) {
			Std st = students.get(i);
			st.printInfo(); // print student info
		}

		sc.close(); // Close the scanner to avoid resource leaks
	}
}