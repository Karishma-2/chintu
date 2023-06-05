package oops;

import java.util.Scanner;

public class Exception1 {
public static void main(String[] args) {
	System.out.println("main method execution started...");
	int a=100;
	try {
	String name="Afsara";
	System.out.println(name.charAt(14));
	Scanner scan=null;	
	System.out.println("Enter value");
	a=scan.nextInt();
	int b=a/0;
	System.out.println("B = "+b);
	}
	catch(ArithmeticException e) {
		//e.printStackTrace();
		System.out.println("Number cannot divide by zero");
	}
	catch(NullPointerException e)
	{
		System.out.println(e.getMessage());
	}
	finally
	{
		System.out.println("Hello im always here");
	}
	System.out.println("main method normally terminated");
}
}
