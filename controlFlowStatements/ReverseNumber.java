package controlFlowStatements;

import java.util.Scanner;

public class ReverseNumber {
public Scanner scan ;
public ReverseNumber()
{
	scan= new Scanner(System.in);
}
public  int scanNvalue()
{
	System.out.println("Enter n value");
	int n=scan.nextInt();
	return n;
}

public int getReverseOfNumber(int n)
{
	int rev=0;
	while(n>0)
	{
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	return rev;
}
public void displayReverse(int n,int rev)
{
	System.out.println("Reverse of "+n+" : "+rev);
}

public void displayPalindromeNumber(boolean status,int rev)
{
	if(status)
		System.out.println(rev);
}

public boolean isPalindrome(int n,int rev)
{
	return n==rev;
}

public void displayPalindromeOrNot(boolean status)
{
	if(status)
		System.out.println("Palindrome ");
	else
		System.out.println("Not a Palindrome");
}

}
