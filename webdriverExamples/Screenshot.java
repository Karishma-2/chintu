package webdriverExamples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	public static void takePicture(WebDriver driver,String imagename) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(".//screenshots//"+imagename+".png"));
	}
}
