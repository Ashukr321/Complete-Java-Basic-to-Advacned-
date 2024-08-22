import java.util.Scanner;

class Student {
	private int id;
	private String name;
	private char gender;
	private String branch;

	public Student(int id, String name, char gender, String branch) {
		setId(id);
		setName(name);
		setGender(gender);
		setBranch(branch);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id >= 100000000 && id <= 999999999) {
			this.id = id;
		} else {
			throw new RuntimeException("ID must be a 9-digit number");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.matches("[a-zA-Z]+")) {
			this.name = name;
		} else {
			throw new RuntimeException("Name must not have special characters and digits");
		}
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		if ((gender == 'M'||gender =='m') || gender == 'F'||gender=='f') {
			this.gender = gender;
		} else {
			throw new RuntimeException("Gender must be either M or F");
		}
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		if (branch.equalsIgnoreCase("ECE") || branch.equalsIgnoreCase("CSE") || branch.equalsIgnoreCase("ME") || branch.equalsIgnoreCase("ECSE") || branch.equalsIgnoreCase("CE") || branch.equalsIgnoreCase("BT") || branch.equalsIgnoreCase("EEE")) {
			this.branch = branch;
		} else {
			throw new RuntimeException("Branch must be either ECE, CSE, ME, ECSE, CE, BT, or EEE");
		}
	}

	@Override
	public String toString() {
		return String.format("ID: %d\nName: %s\nGender: %c\nBranch: %s", id, name, gender, branch);
	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter details for Student 1:");
		System.out.print("ID: ");
		int id1 = scanner.nextInt();
		scanner.nextLine(); // Consume newline left-over
		System.out.print("Name: ");
		String name1 = scanner.nextLine();
		System.out.print("Gender (M/F): ");
		char gender1 = scanner.next().charAt(0);
		scanner.nextLine(); // Consume newline left-over
		System.out.print("Branch (ECE/CSE/ME/ECSE/CE/BT/EEE): ");
		String branch1 = scanner.nextLine();

		Student student1 = new Student(id1, name1, gender1, branch1);

		System.out.println("Enter details for Student 2:");
		System.out.print("ID: ");
		int id2 = scanner.nextInt();
		scanner.nextLine(); // Consume newline left-over
		System.out.print("Name: ");
		String name2 = scanner.nextLine();
		System.out.print("Gender (M/F): ");
		char gender2 = scanner.next().charAt(0);
		scanner.nextLine(); // Consume newline left-over
		System.out.print("Branch (ECE/CSE/ME/ECSE/CE/BT/EEE): ");
		String branch2 = scanner.nextLine();

		Student student2 = new Student(id2, name2, gender2, branch2);

		System.out.println("Student 1: " + student1.toString());
		System.out.println("Student 2: " + student2.toString());
	}
}
