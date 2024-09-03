import java.util.Scanner;

class Student {
	// Assuming the Student class has these fields
	private int studentID;
	private String name;
	private int age; // Example additional field

	// Constructor to initialize Student
	public Student(int studentID, String name, int age) {
		this.studentID = studentID;
		this.name = name;
		this.age = age;
	}

	// Getter and Setter methods
	public int getStudentID() {
		return studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// toString method to print student details
	@Override
	public String toString() {
		return "Student ID: " + studentID + ", Name: " + name + ", Age: " + age;
	}
}

public class StudentManagement {
	private static Student[] students = new Student[10];
	private static int studentCount = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\nStudent Management System Menu:");
			System.out.println("1. Create a new student");
			System.out.println("2. Print details of all students");
			System.out.println("3. Print details based on ID");
			System.out.println("4. Modify student name based on ID");
			System.out.println("5. Remove a student based on ID");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
				case 1:
					createNewStudent(scanner);
					break;
				case 2:
					printAllStudents();
					break;
				case 3:
					printStudentByID(scanner);
					break;
				case 4:
					modifyStudentName(scanner);
					break;
				case 5:
					removeStudentByID(scanner);
					break;
				case 6:
					System.out.println("Exiting the program. Goodbye!");
					break;
				default:
					System.out.println("Invalid choice! Please try again.");
			}
		} while (choice != 6);

		scanner.close();
	}

	// Method to create a new student
	private static void createNewStudent(Scanner scanner) {
		if (studentCount >= 10) {
			System.out.println("Student array is full. Cannot add more students.");
			return;
		}

		System.out.print("Enter Student ID: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // Consume newline

		System.out.print("Enter Student Name: ");
		String name = scanner.nextLine();

		System.out.print("Enter Student Age: ");
		int age = scanner.nextInt();

		students[studentCount++] = new Student(id, name, age);
		System.out.println("Student record created successfully.");
	}

	// Method to print details of all students
	private static void printAllStudents() {
		if (studentCount == 0) {
			System.out.println("No students to display.");
		} else {
			for (int i = 0; i < studentCount; i++) {
				System.out.println(students[i]);
			}
		}
	}

	// Method to print details based on ID
	private static void printStudentByID(Scanner scanner) {
		System.out.print("Enter Student ID: ");
		int id = scanner.nextInt();

		for (int i = 0; i < studentCount; i++) {
			if (students[i].getStudentID() == id) {
				System.out.println(students[i]);
				return;
			}
		}
		System.out.println("Student with ID " + id + " not found.");
	}

	// Method to modify student name based on ID
	private static void modifyStudentName(Scanner scanner) {
		System.out.print("Enter Student ID to modify name: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // Consume newline

		for (int i = 0; i < studentCount; i++) {
			if (students[i].getStudentID() == id) {
				System.out.print("Enter new name: ");
				String newName = scanner.nextLine();
				students[i].setName(newName);
				System.out.println("Student name updated successfully.");
				return;
			}
		}
		System.out.println("Student with ID " + id + " not found.");
	}

	// Method to remove a student based on ID
	private static void removeStudentByID(Scanner scanner) {
		System.out.print("Enter Student ID to remove: ");
		int id = scanner.nextInt();

		for (int i = 0; i < studentCount; i++) {
			if (students[i].getStudentID() == id) {
				// Shift the remaining students to the left
				for (int j = i; j < studentCount - 1; j++) {
					students[j] = students[j + 1];
				}
				students[--studentCount] = null; // Reduce the count and set the last element to null
				System.out.println("Student removed successfully.");
				return;
			}
		}
		System.out.println("Student with ID " + id + " not found.");
	}
}
