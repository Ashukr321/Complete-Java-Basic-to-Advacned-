import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Intro {
	public static void main(String[] args) {
		try {
			System.out.println("File handling in the java ! ");
			// file is use for reading the file in the java
			File file = new File("textFile.txt");
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
