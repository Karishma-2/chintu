package webdriverExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
public static void main(String[] args) {
	String expectedTitle="Facebook – log in or sign up";
	System.setProperty("webdriver.chrome.driver","E:\\jarfiles\\drivers\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	String actualTitle=driver.getTitle();
	System.out.println(actualTitle);
	if(expectedTitle.equals(actualTitle))
		System.out.println("Test script pass");
	else
		System.out.println("Test script fail");
	driver.close();
}
}
