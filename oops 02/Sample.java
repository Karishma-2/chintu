package oops;
public class Sample {

	public void m1(int a)
	{
		System.out.println("M1 method parameter as int");
	}
	public void m1(String a)
	{
		System.out.println("M1 method parameter as String");

	}
	public void m1(String a, int b)
	{
		System.out.println("M1 method parameter as String int");

	}
	public void m1(int b,String a)
	{
		System.out.println("M1 method parameter as int String");

	}
	
	public void add(int a,float b)
	{
		System.out.println("int,float Sum = "+(a+b));
	}
	
	public void add(float a,int b)
	{
		System.out.println("float int Sum = "+(a+b));
	}
	public static void main(String[] args) {
		Sample s  = new Sample();
		//s.m1(12.5f);
		s.add(12, 12.5f);
		s.add(12.5f, 12);
		//s.add(5, 5);

	}
}




