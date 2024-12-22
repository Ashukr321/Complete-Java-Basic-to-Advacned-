import java.util.Scanner;

public class UncheckedExp {

	public static   int getRemainder(int a, int b) throws  ArithmeticException{
		 if(b==0)
		 {
		throw  new ArithmeticException("number can't devide by 0");
		 }
		return a %b;
	}

	public static void main(String[] args) {
		System.out.println("Unchecked Exception");
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a :");
		a = sc.nextInt();
		System.out.println("Enter b:");
		b = sc.nextInt();
		try{

		System.out.println(UncheckedExp.getRemainder(a,b));
		}catch (Exception e){
			System.out.println(e.getMessage());
		}

	}
}
