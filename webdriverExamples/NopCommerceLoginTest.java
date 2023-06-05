package webdriverExamples;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NopCommerceLoginTest {
	WebDriver driver;
	@BeforeMethod
public void setup() //pre condition
{
	driver=CommonMethods.launchBrowser();
	CommonMethods.openURL("https://admin-demo.nopcommerce.com/login");
}

	@AfterMethod
public void teardown() //post condition   Configuration
{
CommonMethods.closeBrowser();
}

@Test
public void verifyNopCommerceLogin() throws Exception
{
	List<String> loginData=ReadData.getData("info", 1);
	String emailId=loginData.get(0);
	String pass=loginData.get(1);

	NopCommerceLogin login = new NopCommerceLogin(driver);
	login.nopCommerceLogin(emailId, pass);
	Thread.sleep(7000);
}
}
