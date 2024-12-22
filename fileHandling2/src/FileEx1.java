import java.io.*;

public class FileEx1 {
	public static void main(String[] args) {
//	create the file
//		try {
//			FileWriter fs = new FileWriter("about.txt");
//			BufferedWriter bw = new BufferedWriter(fs);
//			bw.write("hello");
//			bw.newLine();
//			bw.write("This is a new line. this is amazing");
//			bw.close();
//		} catch (IOException e) {
//			System.out.println("File not found Exception");
//			e.printStackTrace();
//		}
// read file data

		try {
			FileReader fr = new FileReader("about.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			// Read each line until the end of the file
			while ((line = br.readLine()) != null) {
				System.out.println(line); // Print each line to the console
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}