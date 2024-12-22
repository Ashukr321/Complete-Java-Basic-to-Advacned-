import java.util.Scanner;
import java.io.FileReader;
public class CheckedExp {
	public static void main(String[] args) {
		System.out.println("checked exception");
		/*
		the exception which is detected at the time of compilation of the code
		example of the checked exception
		ficsp
		fileNotFoundException
		IOException
		classNotFoundException
		SQLException
		parsException

		 */
		// io exception
		try
		{

		FileReader fl = new FileReader("./nofile.txt");
		}catch (Exception e){
			e.printStackTrace();
		}

		// dns
		// description name and stack trace
	}
}
