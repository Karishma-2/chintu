package oops;

public class EdgeDriver implements WebDriver  {

	@Override
	public void get() {
	System.out.println("Get Method By Edge");
	}

	@Override
	public void click() {
		System.out.println("Click Method By Edge");
	}
	
	public void print()
	{
		System.out.println("Welcome to Edge Browser");
	}

}
