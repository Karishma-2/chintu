package oops;

import java.util.Scanner;

public class CommonMethods {
	public Scanner scan;
	
	public CommonMethods()
	{
		scan=new Scanner(System.in);
	}
public int scanArraySize()
{
	System.out.println("Enter size");
	return scan.nextInt();
}

public int[] getArrayValues(int size)
{
	int a[] = new int[size];
	System.out.println("Enter array values");
	for(int i=0;i<a.length;i++)
		a[i]=scan.nextInt();
	return a;
}
public void displayArray(int a[],String type)
{
	System.out.println(type);
	for(int x : a)
	{
		System.out.println(x);
	}
}

public String scanString()
{
	System.out.println("Enter name");
	return scan.nextLine();
}

public char[] convertStringToCharArray(String name)
{
	char a[]=name.toCharArray();
	return a;
}

public String convertCharArrayToString(char a[])
{
	String str = new String(a);
	return str;
}

public void displayString(String type,String str)
{
	System.out.println(type+str);
}
public boolean isPalindromeString(String str1,String str2)
{
	return str1.equals(str2);
}

public void displayPalindromeOrNot(boolean status)
{
	if(status)
		System.out.println("Palindrome");
	else
		System.out.println("Not a Palindrome");
}
}
