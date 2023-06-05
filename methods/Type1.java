package methods;

import java.util.Scanner;

public class Type1 {

	//Type1: without returntype without parameter
	public static void product()
	{
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a,b values");
        int a=scan.nextInt(),b=scan.nextInt();
        System.out.println("Type1 static Product : "+(a*b));
	}
	public static void main(String[] args) {
		//Type1.xyz();//The method xyz() is undefined for the type Type1
	      //  int c=Type1.product();//Type mismatch: cannot convert from void to int
	Type1.product();
	}
	
}
/*
1. one method Defination should not be written inside another method defination
2. Method syntax:
access_specifier static/non static returntype methodname(declare parameters)
{

}
3. How to call methods?
   1. Check method is static/non static
   2. If method is static call with Classname.methodname()
   3. If method is non static call with Object name.
   Object means we have to create Object for class:
   classname objectname = new Classname();
   objectname is userdefined
   new keyword to initiate a class at run time
   
4. How to Identify method is static or non static?
   * In method signature if we found static keyword then it is known as static method.
   * In Method signature if we do not found static keyword it is known as non static method.
   * 
   

*/