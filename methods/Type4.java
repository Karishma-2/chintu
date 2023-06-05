package methods;

import java.util.Scanner;

public class Type4 {
//Type4: with returntype with parameter
	public int product(int a,int b)
	{
		int c=a*b;
		return c;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter a,b values");
        int a=scan.nextInt(),b=scan.nextInt();
        Type4 obj4 = new Type4();
       int c= obj4.product(a, b);
       System.out.println("Type4 Product : "+c);
	}
}
