import java.io.StringReader;
import java.sql.SQLOutput;
import java.util.Scanner;

public class StringConcat {
	public static void main(String[] args) {
		System.out.println("String concatenation ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name ");
		String fName = sc.next();

		System.out.println("Enter your last Name :");
		String lName = sc.next();
		System.out.println(fName+ " " +lName);
		System.out.println(fName.concat(" ").concat(lName));
	}
}
