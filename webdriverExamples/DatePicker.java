package webdriverExamples;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class DatePicker extends CommonMethods{
public void scroll(int h ,int v)
{
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("scroll("+h+","+v+")");
}

public void scroll(WebElement ele)
{
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)",ele);
}

public WebElement getElement(String locatorValue)
{
By elementL=By.xpath("//*[text()='"+locatorValue+"']");
return driver.findElement(elementL);
}

public void clickTextBox()
{
	By textBoxL=By.cssSelector("input#datepicker");
	WebElement textBox=driver.findElement(textBoxL);
	textBox.click();
}

public void clickNextBtn(int n) throws InterruptedException, IOException
{
	for(int i=1;i<=n;i++)
	{
		WebElement nextBtn=this.getElement("Next");
		nextBtn.click();
		Thread.sleep(3000);
		Screenshot.takePicture(driver, "img"+(5+i));

	}
}

public void selectDate(String date)
{
	By tableL=By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td");
	List<WebElement> table=driver.findElements(tableL);
    for (WebElement ele : table) {
		String data= ele.getText();
		if(data.equals(date))
			ele.click();
	}
}

public static void main(String[] args) throws InterruptedException, IOException {
	DatePicker obj = new DatePicker();
	obj.launchBrowser();
	Screenshot.takePicture(obj.driver, "img1");
	obj.openURL("https://jqueryui.com/datepicker/");
	Thread.sleep(3000);
	Screenshot.takePicture(obj.driver, "img2");
	obj.driver.manage().window().maximize();
	Thread.sleep(3000);
	Screenshot.takePicture(obj.driver, "img3");
	//obj.scroll(0, 400);
	WebElement examples=obj.getElement("Examples");
	obj.scroll(examples);
	Screenshot.takePicture(obj.driver, "img4");
	obj.driver.switchTo().frame(0);
	obj.clickTextBox();
	Thread.sleep(3000);
	Screenshot.takePicture(obj.driver, "img5");
	obj.clickNextBtn(5);
	Thread.sleep(3000);
    obj.selectDate("13");
	Screenshot.takePicture(obj.driver, "img11");
}
}
