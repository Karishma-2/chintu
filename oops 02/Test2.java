package oops;

import java.util.Scanner;

public class Test2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Browser name");
	String browsername=scan.next();
	WebDriver driver;
	if(browsername.equals("chrome"))
		driver=new ChromeDriver();
	else
		driver=new EdgeDriver();
	
	driver.get();
	driver.click();
	driver.doubleClick();
	WebDriver.screenshot();
	
}
}
