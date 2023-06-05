package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Frames  extends CommonMethods{

	public void setText(String locatorValue,String data)
	{
		By textboxL=By.xpath("//*[@id='"+locatorValue+"']");
		WebElement textbox=driver.findElement(textboxL);
		textbox.sendKeys(data);
	}
	
	public WebElement getWebElement()
	{
		By frame2L=By.xpath("/html/frameset/frame[2]");
		WebElement frame2=driver.findElement(frame2L);
		return frame2;
	}
	
	public void framesTestMethod()
	{
		driver.switchTo().frame(0);
		this.setText("001", "Hello");
		driver.switchTo().defaultContent();
		
		WebElement frame2=this.getWebElement();
		driver.switchTo().frame(frame2);
		this.setText("002", "Welcome");
		driver.switchTo().defaultContent();

		driver.switchTo().frame("frame3");
		this.setText("003", "Bye");
		driver.switchTo().defaultContent();

	}
	public static void main(String[] args) {
		Frames obj = new Frames();
		obj.launchBrowser();
		obj.openURL("file:///D:/selniumfiles/htmlpages/frames.html");
		obj.framesTestMethod();
		obj.closeBrowser();
	}
	
}
