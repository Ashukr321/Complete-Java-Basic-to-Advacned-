import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumNum {
	public static void main(String[] args) {
	try(BufferedReader data = new BufferedReader(new FileReader("fileData.txt"))){
		String line;
		int sum = 0;
		while((line = data.readLine())!=null){
			String []numbers = line.split(" ");
//			this is the for Each loop
			for(String num : numbers){
				sum +=Integer.parseInt(num);
			}
		}
		System.out.println("The sum of the number is :"+sum);
	}catch (IOException e){
		System.out.println(e.getMessage());
	}
	}
}
