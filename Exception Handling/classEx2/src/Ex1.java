import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		String str= "Amity";
		System.out.println(str);
		int index;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your index :");
		int idx = sc.nextInt();
		try{
		System.out.println(str.charAt(idx));
		}catch (Exception e){
			System.out.println("we can't access charAt index " + idx);
		}

	}
}
