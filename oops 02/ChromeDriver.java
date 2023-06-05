package oops;

public class ChromeDriver implements WebDriver  {

	@Override
	public void get() {
	System.out.println("Get Method By Chrome");
	}

	@Override
	public void click() {
		System.out.println("Click Method By Chrome");
	}
	
	public void display()
	{
		System.out.println("Welcome to Chrome Browser");
	}

}
