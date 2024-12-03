import java.util.Scanner;


public class MyClass {
	 static  public void getRemainder(int a, int b) throws InvalidInput {
		//
		if (b == 0) {
			throw new InvalidInput("b must be > 0");
		}
		int rem = a / b;
		System.out.println("remainder is :" + rem);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Enter a:");
		a = sc.nextInt();
		System.out.println("\nEnter b:");
		b = sc.nextInt();
		// call the methods
		try{

		MyClass.getRemainder(a,b);
		}catch (Exception e){
			e.printStackTrace();
		}
//		System.out.println("cool");

	}
}
