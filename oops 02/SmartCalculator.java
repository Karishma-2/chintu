package oops;

public class SmartCalculator  extends NewCalculator{

	
	public static Integer add(int a,int b)
	{
		System.out.println(a+" + "+  b+" = "+(a+b));
		return 10;
	}
	
	public void sub(int a,int b)
	{
		System.out.println(a+" - "+b+" = "+(a-b));
	}
	public void mul(int a,int b)
	{
		System.out.println(a+" * "+  b+"  = "+(a*b));
	}
	public void square(int a)
	{
		System.out.println(a+" * "+a+" = "+(a*a));
	}
}
