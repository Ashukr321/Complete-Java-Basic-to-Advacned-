import java.awt.*;
import java.util.Scanner;

class Shape {
	double dim;

	double area() {
		return dim * dim;
	}
	int sumNum(int n1 ,int n2){
		return  n1+n2;
	}
}

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number n1 ");
		int n1 = sc.nextInt();
		System.out.println("Enter your number n2 ");
		int n2 = sc.nextInt();

		Shape s =new Shape() {
			@Override
			double area() {
				System.out.println("child call");
				return 2 * 3.14 * 3;
			}
			int sumNum(int n1 ,int n2){
				return  n1+n2;
			}

		};
		System.out.println(s.area());
		System.out.println(s.sumNum(n1,n2));
	}
}