package webdriverExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethods {
public static  WebDriver driver;

public static  WebDriver launchBrowser()
{
	System.setProperty("webdriver.chrome.driver","E:\\jarfiles\\drivers\\chromedriver.exe" );
    driver=new ChromeDriver();
    return driver;
}

public static void openURL(String url)
{
	driver.get(url);
}

public String getCurrentPageTitle()
{
	return driver.getTitle();
}

public  static boolean compareTitle(String expectedTitle,String actualTitle)
{
	// return expectedTitle.equals(actualTitle);
	return actualTitle.toLowerCase().contains(expectedTitle.toLowerCase());
}
public static void displayTestScriptStatus(boolean status)
{
	if(status)
		System.out.println("Test script passed");
	else
		System.out.println("Test script Failed");
}
public  static void closeBrowser()
{
	driver.close();
}
}
