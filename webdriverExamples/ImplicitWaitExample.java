package webdriverExamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWaitExample extends CommonMethods{

	
	public void setUsername(String uname)
{
	By usernameL=By.name("username");
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(3));
	wait.until(ExpectedConditions.visibilityOfElementLocated(usernameL));
    usernameL=By.name("username");
	WebElement username=driver.findElement(usernameL);
	username.sendKeys(uname);
	
}

public void setPassword(String pass)
{
	By passwordL=By.name("password");
	WebElement password=driver.findElement(passwordL);
	password.sendKeys(pass);
}

public void clickOnLogin()
{
	By loginL=By.xpath("//button[normalize-space()='Login']");
	WebElement login=driver.findElement(loginL);
	login.click();
	
}

public static void main(String[] args) {
	ImplicitWaitExample obj = new ImplicitWaitExample();
	obj.launchBrowser();
	obj.openURL("https://opensource-demo.orangehrmlive.com/");
	obj.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	obj.setUsername("Admin");
	obj.setPassword("admin123");
	obj.clickOnLogin();
	//obj.closeBrowser();
}
}
