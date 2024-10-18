import java.util.Scanner;

public class Ex {

	int a ; // Instance variable
	Ex(int a){
		this.a = a;
	}
	// Inner class
	class InnerClass {
		int y ;
		InnerClass(int y){
			this.y = y;
		}
		public void printData() {
			System.out.println(y);
			System.out.println(a); // Accessing instance variable of the outer class
		}
	}


	public void outerDisplay() {
		int y ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of y :");
		y = sc.nextInt();
		InnerClass innerClass = new InnerClass(y);
		innerClass.printData();
	}

	public static void main(String[] args) {
		Ex obj = new Ex(20);
		obj.outerDisplay();
	}
}