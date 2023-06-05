package oops;

public interface WebDriver {
public void get();
public void click();
public static void screenshot()
{
	System.out.println("Screenshot");
}

public default void doubleClick()
{
	hello();	
}

private void hello()
{
	System.out.println("Hello Im private method");
}



}
