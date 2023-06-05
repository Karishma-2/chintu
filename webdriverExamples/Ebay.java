package webdriverExamples;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Ebay extends WindowHandling{

	public void rightClick(WebElement ele)
	{
		Actions action = new Actions(driver);
		action.contextClick(ele).build().perform();
	}
	public List<WebElement> getLinks()
	{
		By linksL=By.tagName("a");
		return driver.findElements(linksL);
	}
	
	public void displayLinks(List<WebElement> allLinks)
	{
		for (WebElement ele : allLinks) {
			if(ele.isDisplayed())
			{
				System.out.println(ele.getText());
			}
		}
	}
	
	public void verifyLinks(List<WebElement> allLinks) throws Exception
	{
		for (WebElement ele : allLinks) {
			try {
			if(ele.isDisplayed())
			{
			      this.rightClick(ele);
			      this.openLinkInNewTab();
			      String parentId=this.getParentWindowId();
			     Set<String> allWindows= this.getAllWindowId();
			      this.switchToWindows(parentId, allWindows);
			      Thread.sleep(3000);
			      this.closeBrowser();
			      this.switchToWindow(parentId);
			      Thread.sleep(3000);

			}
			}
			catch(Exception e)
			{
			
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		Ebay obj = new Ebay();
		obj.launchBrowser();
		obj.openURL("http://www.ebay.com");
		List<WebElement> allLinks=obj.getLinks();
		obj.displayLinks(allLinks);
		obj.verifyLinks(allLinks);
	}
}






