import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
	public static void main(String[] args) {
	try(BufferedReader reader = new BufferedReader(new FileReader("./textFile.txt"))){
	String line ;
	while((line = reader.readLine())!=null){
		System.out.println(line);
	}
	}catch (IOException e){
		System.out.println(e.getMessage());
	}
	}
}
