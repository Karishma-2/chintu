package webdriverExamples;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AmazonAutoCompleteFeature extends CommonMethods{

	public void setTextinAmazonSearchBox(String data)
	{
		By amazonSearchBL=By.xpath("//input[@type='text']");
	    WebElement amazonSearchB= driver.findElement(amazonSearchBL);
	    amazonSearchB.sendKeys(data);
	}
	
	public void getSuggestedList()
	{
		//By suggestedListL=By.xpath("//div[@class='autocomplete-results-container']//child::div[contains(@class,'suggestion')]//span[@class='s-heavy']//span");
		//By suggestedListL=By.xpath("//*[@class='autocomplete-results-container']//child::div//child::div");
		By suggestedListL=By.cssSelector("div.autocomplete-results-container>div:nth-of-type(n)");
		List<WebElement> suggestedList=driver.findElements(suggestedListL);
	    List<String> suggestedValues = new ArrayList<String>();
		for (WebElement ele : suggestedList) {
			suggestedValues.add(ele.getText());
		}
		System.out.println(suggestedValues);
	}
	
	public static void main(String[] args) {
		AmazonAutoCompleteFeature obj = new AmazonAutoCompleteFeature();
		obj.launchBrowser();
		obj.openURL("http://www.amazon.in");
		obj.setTextinAmazonSearchBox("Smart");
		obj.getSuggestedList();
	}
}
