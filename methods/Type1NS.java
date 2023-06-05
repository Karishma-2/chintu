package methods;

import java.util.Scanner;

public class Type1NS{

	//Type1: without returntype without parameter
	public  void product()
	{
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a,b values");
        int a=scan.nextInt(),b=scan.nextInt();
        System.out.println("Type1 static Product : "+(a*b));
	}
	public static void main(String[] args) {
		Type1NS obj1 = new Type1NS();
		obj1.product();
		
	}
}
/*
	//Cannot make a static reference to the non-static method product() from the type Type1NS

*/