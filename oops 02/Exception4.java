package oops;

import java.util.Scanner;

public class Exception4 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter age");
	int age=scan.nextInt();
	if(age>=21 && age<=75)
	{
		System.out.println("You can drive");
	}
	else
	{
		System.out.println("You cannot drive");
		throw new ArithmeticException("You cannot drive");
	}
}
}
