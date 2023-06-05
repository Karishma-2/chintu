package methods;

import java.util.Scanner;

public class Type2 {
//Type2: with return type Without parameter
	public int product()
	{
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter a,b values");
        int a=scan.nextInt(),b=scan.nextInt();
      	int c=a*b;
		return c;
	}
	public static void main(String[] args) {
		Type2 obj2 = new Type2();
		int c=obj2.product();
		System.out.println("Type2 Product : "+c);
	    System.out.println(c+100);
	    
	    //obj2.product(12,12);//The method product() in the type Type2 is not applicable for the arguments (int, int)
	       obj2.product(); 
	}
	
}
