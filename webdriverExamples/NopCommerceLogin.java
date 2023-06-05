package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NopCommerceLogin {

	WebDriver driver;
	
	public NopCommerceLogin(WebDriver driver)
	{
		this.driver=driver;
	}
	private void setEmail(String emailId) throws Exception
	{
		String email_L=ReadData.getLocator("loginpage", "email_L");
		By emailL=By.id(email_L);
		WebElement email=driver.findElement(emailL);
		Thread.sleep(3000);
		email.sendKeys(Keys.chord(Keys.CONTROL,"a"),emailId);
	}
	
	private void setPassword(String pass) throws Exception
	{
		String password_L=ReadData.getLocator("loginpage", "password_L");
		By passwordL=By.id(password_L);
		WebElement password=driver.findElement(passwordL);
		password.clear();
		Thread.sleep(3000);
		password.sendKeys(pass);
	}
	
	private void clickOnLogin() throws Exception
	{

		String loginBtn_L=ReadData.getLocator("loginpage", "loginBtn_L");
		By loginBtnL=By.xpath(loginBtn_L);
		WebElement loginBtn=driver.findElement(loginBtnL);
		loginBtn.click();
	}
	
	public void nopCommerceLogin(String emailId,String pass) throws Exception
	{
		this.setEmail(emailId);
		this.setPassword(pass);
		this.clickOnLogin();
	}
	
}
