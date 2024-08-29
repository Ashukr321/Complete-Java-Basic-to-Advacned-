import java.util.Scanner;

public class _5_method_overloading_and_overriding {
	 public static class  Number {
		// overload
		public  int sum(int a, int b){
			return a+b;
		}
		public  double sum(double a ,double b){
			return a+b;
		}
	//overriding  is possible in different class
//		 @Override
//		 public  int sum (int a , int b){
//			return  a+b;
//		 }

	}
	 public  static class  Shape extends   Number{
		 @Override
		public int sum(int a, int b){
			 System.out.println("the sum of the number  a and b"+a+b);
			 return  a+b;
		 }
	}
	public static void main(String[] args) {
		System.out.println("method overloading and overriding");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first num a :");
		double a = sc.nextDouble();
		System.out.println("Enter your 2nd number b  :");
		double b = sc.nextDouble();
		// create object of the class
		Number obj = new Number();
		System.out.println(obj.sum(a,b));
		Shape obj2 = new Shape();
		obj2.sum(23,5);
	}
}
