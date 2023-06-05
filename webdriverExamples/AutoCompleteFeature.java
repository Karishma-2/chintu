package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class AutoCompleteFeature extends CommonMethods{
	WebElement googleSearchBox;
public void setTextInGoogleSearchBox(String data)
{
	//write locator
	By googleSearchBL=By.xpath("//input[@name='q']");
	//Find Locator
	 googleSearchBox=driver.findElement(googleSearchBL);
   //Do Action
	googleSearchBox.sendKeys(data);
}
public void selectOptionFromSuggestedList(int pos) throws Exception
{
	for(int i=1;i<=pos;i++)
	{
		 Thread.sleep(3000);
		 googleSearchBox.sendKeys(Keys.ARROW_DOWN);
	}
	 googleSearchBox.sendKeys(Keys.ENTER);
	 Thread.sleep(3000);
}
public static void main(String[] args) throws Exception {
	AutoCompleteFeature  obj = new AutoCompleteFeature();
	obj.launchBrowser();
	obj.openURL("https://www.google.com");
	obj.setTextInGoogleSearchBox("Selenium");
	obj.selectOptionFromSuggestedList(3);
	obj.closeBrowser();
}	
}
