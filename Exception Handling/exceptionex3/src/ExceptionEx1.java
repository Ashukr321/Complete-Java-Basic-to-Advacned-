import java.util.Scanner;

public class ExceptionEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number a ");
		int a = sc.nextInt();
		System.out.println();
		System.out.println("Enter your 2nd number ");
		int b = sc.nextInt();
//		System.out.println(a/b);
		// if the b 0;
		// this will give the runtime exception -> unchecked exception
		try{
			System.out.println(a/b);
		}catch (Exception e){
			System.out.println("b can't be 0");
			e.printStackTrace();
		}
		System.out.println("After exception handling ");

	}
}
