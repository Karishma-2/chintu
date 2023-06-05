package webdriverExamples;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FileUpload extends CommonMethods {
public void clickOnUploadFileBtn()
{
	By fileuploadBtnL=By.xpath("//input[@title='Upload']");
	WebElement fileuploadBtn=driver.findElement(fileuploadBtnL);
	//JavascriptExecutor js = (JavascriptExecutor)driver;
    //js.executeScript("arguments[0].click()", fileuploadBtn);
    // fileuploadBtn.click(); 
	Actions action = new Actions(driver);
	action.click(fileuploadBtn).build().perform();
}

public static void main(String[] args) throws IOException, InterruptedException {
	FileUpload obj = new FileUpload();
	obj.launchBrowser();
	obj.openURL("https://www.sejda.com/word-to-pdf");
	obj.clickOnUploadFileBtn();
	Thread.sleep(3000);
	Runtime.getRuntime().exec("E:\\livetechOfflineBatches\\seleniumSep830am\\Selenium830am\\fileupload.exe");
}

}
