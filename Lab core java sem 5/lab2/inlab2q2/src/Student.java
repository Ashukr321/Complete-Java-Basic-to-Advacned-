import java.util.Scanner;

class Student {
	// Private attributes
	private String name;
	private int id;
	private String gender;
	private String department;

	// Public setter methods with validation

	// Setter for name (no special characters or digits allowed)
	public void setName(String name) {
		if (name.matches("[a-zA-Z\\s]+")) {  // Regex to allow only letters and spaces
			this.name = name;
		} else {
			System.out.println("Invalid name. It should not contain any special characters or digits.");
		}
	}

	// Setter for ID (positive 9-digit value)
	public void setId(int id) {
		if (id > 0 && String.valueOf(id).length() == 9) {
			this.id = id;
		} else {
			System.out.println("Invalid ID. It must be a positive 9-digit value.");
		}
	}

	// Setter for gender (either M or F)
	public void setGender(String gender) {
		if (gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F")) {
			this.gender = gender.toUpperCase();
		} else {
			System.out.println("Invalid gender. It must be either 'M' or 'F'.");
		}
	}

	// Setter for department (must be BT/CE/CSE/ECE/EEE/ECS/ME/PE)
	public void setDepartment(String department) {
		if (department.equals("BT") || department.equals("CE") || department.equals("CSE") ||
				department.equals("ECE") || department.equals("EEE") || department.equals("ECS") ||
				department.equals("ME") || department.equals("PE")) {
			this.department = department;
		} else {
			System.out.println("Invalid department. It must be one of BT/CE/CSE/ECE/EEE/ECS/ME/PE.");
		}
	}

	// Override toString() to print student details in the specified format
	@Override
	public String toString() {
		return "ID: " + id + "\n" +
				"Name: " + name + "\n" +
				"Gender: " + gender + "\n" +
				"Department: " + department;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Create two Student objects
		Student student1 = new Student();
		Student student2 = new Student();

		// Read and set data for Student 1
		System.out.println("Enter details for Student 1:");
		System.out.print("Enter ID: ");
		student1.setId(scanner.nextInt());
		scanner.nextLine(); // Consume newline left-over
		System.out.print("Enter Name: ");
		student1.setName(scanner.nextLine());
		System.out.print("Enter Gender (M/F): ");
		student1.setGender(scanner.next());
		System.out.print("Enter Department: ");
		student1.setDepartment(scanner.next());

		// Read and set data for Student 2
		System.out.println("\nEnter details for Student 2:");
		System.out.print("Enter ID: ");
		student2.setId(scanner.nextInt());
		scanner.nextLine(); // Consume newline left-over
		System.out.print("Enter Name: ");
		student2.setName(scanner.nextLine());
		System.out.print("Enter Gender (M/F): ");
		student2.setGender(scanner.next());
		System.out.print("Enter Department: ");
		student2.setDepartment(scanner.next());

		// Print the details of the two students
		System.out.println("\nDetails of Student 1:");
		System.out.println(student1);

		System.out.println("\nDetails of Student 2:");
		System.out.println(student2);

		scanner.close();
	}
}
