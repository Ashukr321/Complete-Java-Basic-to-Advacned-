package MyPackage;

import MyMathematics.MyIntegerMath;

public class MyDemo {
	public static void main(String[] args) {
		MyIntegerMath obj = new MyIntegerMath();
		System.out.println(obj.countDigits(1234));
		System.out.println(obj.isArmstrong(153));
	}
}
