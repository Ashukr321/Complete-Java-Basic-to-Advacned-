package mOverloading;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Scanner;

public class Calculator {
	public  void add(int a,int b){
		System.out.println(a+b);
	}
	public  void  add(double a,double b){
		System.out.println(a+b);
	}
	public  void  add(double a ,int b){
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number a :");
		int a = sc.nextInt();
		System.out.println("Enter b :");
		int b = sc.nextInt();
		// create the object  the  Calculator class
		Calculator obj = new Calculator();
		obj.add(a,b);
	}
}
