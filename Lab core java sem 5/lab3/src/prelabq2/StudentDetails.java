package prelabq2;
import javax.swing.JOptionPane;


public class StudentDetails {
	public static void main(String[] args) {
		// Read Student ID
		String studentID = JOptionPane.showInputDialog("Enter Student ID:");

		// Read Name
		String name = JOptionPane.showInputDialog("Enter Student Name:");

		// Read Age
		String age = JOptionPane.showInputDialog("Enter Student Age:");

		// Read Gender
		String gender = JOptionPane.showInputDialog("Enter Student Gender (M/F):");

		// Print Student Details
		String message = "Student Details:\n"
				+ "ID: " + studentID + "\n"
				+ "Name: " + name + "\n"
				+ "Age: " + age + "\n"
				+ "Gender: " + gender;

		JOptionPane.showMessageDialog(null, message, "Student Details", JOptionPane.INFORMATION_MESSAGE);
	}
}

//+---------------+
//		|  StudentDetails  |
//		+---------------+
//		| - studentID: String  |
//		| - name: String      |
//		| - age: String       |
//		| - gender: String    |
//		+---------------+
//		| + main(args: String[]) |
//		+---------------+

