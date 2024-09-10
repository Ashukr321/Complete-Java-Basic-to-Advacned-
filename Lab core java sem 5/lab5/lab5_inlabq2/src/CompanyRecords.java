import java.util.ArrayList;
import java.util.Scanner;

class Employee {
	// Private data fields
	private int id;
	private String name;
	private String department;

	// Default values
	private static final int DEFAULT_ID = 0;
	private static final String DEFAULT_NAME = "#";
	private static final String DEFAULT_DEPARTMENT = "#";

	// Constructor with no arguments (uses default values)
	public Employee() {
		this(DEFAULT_ID, DEFAULT_NAME, DEFAULT_DEPARTMENT);
	}

	// Constructor with ID only
	public Employee(int id) {
		this(id, DEFAULT_NAME, DEFAULT_DEPARTMENT);
	}

	// Constructor with ID and Name
	public Employee(int id, String name) {
		this(id, name, DEFAULT_DEPARTMENT);
	}

	// Constructor with all fields (ID, Name, Department)
	public Employee(int id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}

	// Getter methods (Accessors)
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	// Setter methods (Mutators)
	public void setName(String name) {
		this.name = name;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	// Overriding toString() method
	@Override
	public String toString() {
		return "Employee ID: " + id + ", Name: " + name + ", Department: " + department;
	}
}

public class CompanyRecords {
	private static ArrayList<Employee> employees = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\nCompany Employee Records Menu:");
			System.out.println("1. Create New Employee Record");
			System.out.println("2. Update Name Based on ID");
			System.out.println("3. Print All Employees");
			System.out.println("4. Print Department-Specific Employees");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
				case 1:
					createNewEmployee(scanner);
					break;
				case 2:
					updateEmployeeName(scanner);
					break;
				case 3:
					printAllEmployees();
					break;
				case 4:
					printDepartmentEmployees(scanner);
					break;
				case 5:
					System.out.println("Exiting the program. Goodbye!");
					break;
				default:
					System.out.println("Invalid choice! Please try again.");
			}
		} while (choice != 5);

		scanner.close();
	}

	// Method to create a new employee record
	private static void createNewEmployee(Scanner scanner) {
		System.out.print("Enter Employee ID: ");
		int id = scanner.nextInt();
		scanner.nextLine();  // Consume newline
		System.out.print("Enter Employee Name (or press Enter for default): ");
		String name = scanner.nextLine();
		System.out.print("Enter Employee Department (or press Enter for default): ");
		String department = scanner.nextLine();

		Employee employee;
		if (name.isEmpty() && department.isEmpty()) {
			employee = new Employee(id);
		} else if (department.isEmpty()) {
			employee = new Employee(id, name);
		} else {
			employee = new Employee(id, name, department);
		}

		employees.add(employee);
		System.out.println("Employee record created successfully.");
	}

	// Method to update the employee's name based on ID
	private static void updateEmployeeName(Scanner scanner) {
		System.out.print("Enter Employee ID to update name: ");
		int id = scanner.nextInt();
		scanner.nextLine();  // Consume newline
		boolean found = false;

		for (Employee employee : employees) {
			if (employee.getId() == id) {
				System.out.print("Enter the new name: ");
				String newName = scanner.nextLine();
				employee.setName(newName);
				System.out.println("Employee name updated successfully.");
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("Employee with ID " + id + " not found.");
		}
	}

	// Method to print all employees
	private static void printAllEmployees() {
		if (employees.isEmpty()) {
			System.out.println("No employee records available.");
		} else {
			System.out.println("All Employees:");
			for (Employee employee : employees) {
				System.out.println(employee);
			}
		}
	}

	// Method to print employees specific to a department
	private static void printDepartmentEmployees(Scanner scanner) {
		System.out.print("Enter Department name to filter: ");
		String department = scanner.next();
		boolean found = false;

		for (Employee employee : employees) {
			if (employee.getDepartment().equalsIgnoreCase(department)) {
				System.out.println(employee);
				found = true;
			}
		}

		if (!found) {
			System.out.println("No employees found in the " + department + " department.");
		}
	}
}
