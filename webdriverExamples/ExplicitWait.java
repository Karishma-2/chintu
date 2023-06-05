package webdriverExamples;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait extends CommonMethods {

	public void clickButton()
	{
		By buttonL=By.xpath("/html/body/button");
		WebElement button=driver.findElement(buttonL);
		button.click();
	}
	
	public void waitUntillAlertPresent()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public void handleAlert()
	{
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
	
	public static void main(String[] args) {
		ExplicitWait obj = new ExplicitWait();
		obj.launchBrowser();
		obj.openURL("file:///D:/selniumfiles/htmlpages/waitExample.html");
		obj.clickButton();
		obj.waitUntillAlertPresent();
		obj.handleAlert();
		obj.closeBrowser();
	}
}
