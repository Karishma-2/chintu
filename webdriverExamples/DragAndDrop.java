package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends DatePicker {
	
	
	public void dragAndDrop(WebElement source ,WebElement target)
	{
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
	}
	
	public void maximizeScrollAndShift()
	{
		driver.manage().window().maximize();
		WebElement examples=this.getElement("Examples");
		this.scroll(examples);
		driver.switchTo().frame(0);
	}
	public static void main(String[] args) {
		DragAndDrop obj = new DragAndDrop();
		obj.launchBrowser();
		obj.openURL("https://jqueryui.com/droppable/");
		obj.maximizeScrollAndShift();
		WebElement source=obj.getElement("Drag me to my target");
		WebElement target=obj.getElement("Drop here");
        obj.dragAndDrop(source, target);
	
	}
}
