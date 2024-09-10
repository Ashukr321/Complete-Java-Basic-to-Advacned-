import javax.swing.*;
import java.util.Scanner;

public class string_to_char_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("Enter your string :");
		name = sc.nextLine();
		// tocharArray () => this will convert string in to array
		char[] charArr = name.toCharArray();
		for (int i = 0 ; i<charArr.length; i++){
			System.out.println(charArr[i]);
		}

	}
}
