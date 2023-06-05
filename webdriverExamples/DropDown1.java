package webdriverExamples;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class DropDown1 extends CommonMethods{
	Select select ;
	int count;
	public WebElement getElement()
	{
		By dropdownL=By.xpath("//*[@title='Search in']");
		WebElement dropdown=driver.findElement(dropdownL);
		return dropdown;
	}
	
	public String  getValue(WebElement dropdown)
	{
		String data=dropdown.getAttribute("value");
		System.out.println(data);
		return data;
	}
	
	public List<String> getAllOptions(WebElement dropdown)
	{
		 select = new Select(dropdown);
		List<WebElement> allOptions=select.getOptions();
		List<String > allOptionsValues = new ArrayList<String>();
		for (WebElement opt : allOptions) {
			System.out.println(opt.getText());
			allOptionsValues.add(opt.getText());
		}
		System.out.println("Total Options : "+allOptions.size());
		return allOptionsValues;
	}
	
	public boolean checkSpecificValueExistOrNot(List<String> allOptionsValues,String value)
	{
		 count=0;
		for (String data : allOptionsValues) {
			if(value.equals(data))
				count++;
		}
		if(count==0)
			return false;
		else
			return true;
	}
	
	public static void main(String[] args) throws InterruptedException {
		DropDown1 obj = new DropDown1();
		obj.launchBrowser();
		obj.openURL("http://amazon.in");
		WebElement dropdown=obj.getElement();
		List<String> allOptionsValues=obj.getAllOptions(dropdown);
		obj.select.selectByIndex(9);//Beauty
		Thread.sleep(3000);		
		obj.select.selectByValue("search-alias=mobile-apps");//apps and games
		Thread.sleep(3000);
		obj.select.selectByVisibleText("Garden & Outdoors");
		Thread.sleep(3000);
        boolean status=obj.checkSpecificValueExistOrNot(allOptionsValues, "Watches");
		Assert.assertTrue(status,"Test script Failed as Dropdown does contains expected Option");
		Assert.assertEquals(obj.count, 1,"Test script fail as dropdown contains duplicate values");
		 obj.select.selectByVisibleText("Watches");
		Thread.sleep(3000);
		String actualData=obj.getValue(dropdown);
		 status=actualData.toLowerCase().contains("Watches".toLowerCase());
		Assert.assertTrue(status,"After Selecting Option It is not Displayed on UI");
           obj.closeBrowser();
	}
}
