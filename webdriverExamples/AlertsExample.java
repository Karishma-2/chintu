package webdriverExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class AlertsExample extends CommonMethods{

	private void clickButton(String buttonType)
	{
		By buttonL=By.xpath("//*[contains(text(),'"+buttonType+"')]");
		WebElement button=driver.findElement(buttonL);
		button.click();
	}
	
	public void verifyAlertWithTextBox(String promptData) throws InterruptedException
	{
		Thread.sleep(3000);
		this.clickButton("Alert with Textbox ");
		Thread.sleep(3000);

		this.clickButton("click the button to demonstrate the prompt box");
		Thread.sleep(3000);

		Alert alert=driver.switchTo().alert(); //control shifted to Alert and giving alert reference
	    alert.sendKeys(promptData);
	    alert.accept();
		Thread.sleep(3000);

	}
	
	public boolean verifyLabelContainsText(String expectedText)
	{
		By labelL=By.id("demo1");
		WebElement label=driver.findElement(labelL);
		String actualText=label.getText();
		boolean status=actualText.contains(expectedText);
		return status;
	}
	public static void main(String[] args) throws InterruptedException {
		String testdata="Livetech";
		AlertsExample obj = new AlertsExample();
		obj.launchBrowser();
		obj.openURL("https://demo.automationtesting.in/Alerts.html");
		obj.verifyAlertWithTextBox(testdata);
		boolean status=obj.verifyLabelContainsText(testdata);
		Assert.assertTrue(status,"Test script Failed as label does not contains expected text");
		obj.closeBrowser();
	}
	
	/* if(status)
	System.out.println("Test script PAss");
else
	System.out.println("Test script Fail");*/	
	
}
