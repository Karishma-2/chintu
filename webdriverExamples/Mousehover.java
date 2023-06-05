package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class Mousehover extends CommonMethods {

	public WebElement getElement(String locatorValue)
	{
		By linkL=By.xpath("//span[text()='"+locatorValue+"']");
		WebElement link=driver.findElement(linkL);
		return link;
		//Actions action = new Actions(driver);
		//action.click(link).build().perform();
		//JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click()", link);
	}
	
	public void clickOnLink(WebElement link)
	{
		link.click();
	}
	
	public boolean isLinkDisplayed(WebElement link )
	{
		return link.isDisplayed();
	}
	
	public void mousehoverOnAccounts(String locatorValue)
	{
		By linkL=By.xpath("//span[text()='"+locatorValue+"']");
		WebElement link=driver.findElement(linkL);
		Actions action = new Actions(driver);
		action.moveToElement(link).build().perform();
	}
	
	public String getLabelText()
	{
		By labelL=By.xpath("//span[@class='discover-navigation-tabs-title']");
	    WebElement label=driver.findElement(labelL);
	    return label.getText();
	}
	public static void main(String[] args) throws InterruptedException {
		Mousehover obj = new Mousehover();
		obj.launchBrowser();
		obj.openURL("http://www.amazon.in");
		obj.mousehoverOnAccounts("Account & Lists");
		Thread.sleep(3000);
		WebElement link=obj.getElement("Discover Your Style");
		Assert.assertTrue(obj.isLinkDisplayed(link));
		obj.clickOnLink(link);
		Thread.sleep(3000);
		Assert.assertEquals(obj.getLabelText(), "Discover Your Product Style");
		obj.closeBrowser();
	}
}
