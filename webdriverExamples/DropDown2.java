package webdriverExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 extends CommonMethods{
	Select select ;
	List<WebElement> allOptions;
	public WebElement getElement()
	{
		By dropdownL =By.xpath("//*[@id='tools']");
	    return driver.findElement(dropdownL);
	}
	
	public void getAllOptions(WebElement dropdown,String firstOption,String secondOption)
	{
		 select = new Select(dropdown);
	 allOptions=select.getOptions();
		for (WebElement ele : allOptions) {
			
			String value=ele.getText();
			if(value.equals(firstOption)||value.equals(secondOption))
				select.selectByVisibleText(value);
		}
	}
	
	
	public void displaySlectedOptions()
	{
		System.out.println("Selected Options :");
		List<WebElement> allselectedOptions=select.getAllSelectedOptions();
		for (WebElement ele : allselectedOptions) {
			System.out.println(ele.getText());
		}
	}
	
	public void displayNonSelectedElements()
	{
		System.out.println("Non Selected Elements");
		for (WebElement ele : allOptions) {
			if(!ele.isSelected())
				System.out.println(ele.getText());
		}
	}
	
	public void displayAllOptions()
	{
		System.out.println("All Options:");
		for (WebElement ele : allOptions) {
			
				System.out.println(ele.getText());
		}
	}
	
	public static void main(String[] args) {
		DropDown2 obj = new DropDown2();
		obj.launchBrowser();
		obj.openURL("file:///D:/selniumfiles/htmlpages/multiplebox1.html");
		WebElement dropdown=obj.getElement();
		obj.getAllOptions(dropdown, "Selenium IDE", "SElenium Grid");
	    obj.displayAllOptions();
	    obj.displaySlectedOptions();
	    obj.displayNonSelectedElements();
	}
	
}
