import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
	public static void main(String[] args) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("./textFile.txt"))) {
			writer.write("this is ashutosh kumar ");
			writer.newLine();
			writer.write('a');
			writer.close();
		} catch (IOException e) {
			System.out.println("Error writing file: " + e.getMessage());
		}
	}
}