package webdriverExamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RightClick extends CommonMethods{
	
	public void rightClick()
	{
		By electronicsL=By.xpath("//*[starts-with(text(),' Electronics')]");
		WebElement electronics=driver.findElement(electronicsL);
		Actions action = new Actions(driver);
		action.contextClick(electronics).build().perform();
	}
	
	public void openLinkInNewTab() throws Exception
	{
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
	}
public static void main(String[] args) throws Exception {
	RightClick obj = new RightClick();
	obj.launchBrowser();
	obj.openURL("http://www.amazon.in");
	obj.rightClick();
	obj.openLinkInNewTab();
	//obj.closeBrowser();
	Thread.sleep(3000);
	//obj.closeBrowser();
	obj.driver.quit();
	
}
	
}
