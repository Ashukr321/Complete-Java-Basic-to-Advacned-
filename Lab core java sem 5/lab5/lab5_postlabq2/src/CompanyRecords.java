import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Employee {
	// Private data fields
	private int id;
	private String name;
	private String department;
	private LocalDate dateOfJoining;

	// Default values
	private static final int DEFAULT_ID = 0;
	private static final String DEFAULT_NAME = "#";
	private static final String DEFAULT_DEPARTMENT = "#";
	private static final LocalDate DEFAULT_DATE_OF_JOINING = LocalDate.now();

	// Constructor with no arguments (uses default values)
	public Employee() {
		this(DEFAULT_ID, DEFAULT_NAME, DEFAULT_DEPARTMENT, DEFAULT_DATE_OF_JOINING);
	}

	// Constructor with all fields (ID, Name, Department, Date of Joining)
	public Employee(int id, String name, String department, LocalDate dateOfJoining) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.dateOfJoining = dateOfJoining;
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

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	// Setter methods (Mutators)
	public void setName(String name) {
		this.name = name;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	// Overriding toString() method
	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		return "Employee ID: " + id + ", Name: " + name + ", Department: " + department + ", Date of Joining: " + dateOfJoining.format(formatter);
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
			System.out.println("2. Print Details of All Employees");
			System.out.println("3. Print Details Based on ID");
			System.out.println("4. Modify Employee Name Based on ID");
			System.out.println("5. Remove a Student Based on ID");
			System.out.println("6. Print Employees Who Joined in 2019");
			System.out.println("7. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
				case 1:
					createNewEmployee(scanner);
					break;
				case 2:
					printAllEmployees();
					break;
				case 3:
					printEmployeeByID(scanner);
					break;
				case 4:
					modifyEmployeeName(scanner);
					break;
				case 5:
					removeEmployeeByID(scanner);
					break;
				case 6:
					printEmployeesJoinedIn2019();
					break;
				case 7:
					System.out.println("Exiting the program. Goodbye!");
					break;
				default:
					System.out.println("Invalid choice! Please try again.");
			}
		} while (choice != 7);

		scanner.close();
	}

	// Method to create a new employee record
	private static void createNewEmployee(Scanner scanner) {
		System.out.print("Enter Employee ID: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // Consume newline
		System.out.print("Enter Employee Name: ");
		String name = scanner.nextLine();
		System.out.print("Enter Employee Department: ");
		String department = scanner.nextLine();
		System.out.print("Enter Date of Joining (dd-MM-yyyy): ");
		String dateOfJoiningStr = scanner.nextLine();
		LocalDate dateOfJoining = LocalDate.parse(dateOfJoiningStr, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

		Employee employee = new Employee(id, name, department, dateOfJoining);
		employees.add(employee);
		System.out.println("Employee record created successfully.");
	}

	// Method to print details of all employees
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

	// Method to print details based on ID
	private static void printEmployeeByID(Scanner scanner) {
		System.out.print("Enter Employee ID: ");
		int id = scanner.nextInt();

		for (Employee employee : employees) {
			if (employee.getId() == id) {
				System.out.println(employee);
				return;
			}
		}
		System.out.println("Employee with ID " + id + " not found.");
	}

	// Method to modify employee name based on ID
	private static void modifyEmployeeName(Scanner scanner) {
		System.out.print("Enter Employee ID to modify name: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // Consume newline

		for (Employee employee : employees) {
			if (employee.getId() == id) {
				System.out.print("Enter new name: ");
				String newName = scanner.nextLine();
				employee.setName(newName);
				System.out.println("Employee name updated successfully.");
				return;
			}
		}
		System.out.println("Employee with ID " + id + " not found.");
	}

	// Method to remove an employee based on ID
	private static void removeEmployeeByID(Scanner scanner) {
		System.out.print("Enter Employee ID to remove: ");
		int id = scanner.nextInt();

		for (Employee employee : employees) {
			if (employee.getId() == id) {
				employees.remove(employee);
				System.out.println("Employee removed successfully.");
				return;
			}
		}
		System.out.println("Employee with ID " + id + " not found.");
	}

	// Method to print details of employees who joined in 2019
	private static void printEmployeesJoinedIn2019() {
		boolean found = false;
		for (Employee employee : employees) {
			if (employee.getDateOfJoining().getYear() == 2019) {
				System.out.println(employee);
				found = true;
			}
		}

		if (!found) {
			System.out.println("No employees found who joined in 2019.");
		}
	}
}
