package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrowserAuthenticationAlerts extends CommonMethods {

	public void clickBasicAuth()
	{
		By basicAuthL=By.xpath("//*[text()='Basic Auth']");
		WebElement basicAuth=driver.findElement(basicAuthL);
		basicAuth.click();
	}
	public static void main(String[] args) {
		BrowserAuthenticationAlerts obj = new BrowserAuthenticationAlerts();
		obj.launchBrowser();
		obj.openURL("https://the-internet.herokuapp.com/");
		//obj.openURL("http://admin:admin@the-internet.herokuapp.com/");
		obj.clickBasicAuth();
	   //obj.driver.switchTo().alert();
	}
}
