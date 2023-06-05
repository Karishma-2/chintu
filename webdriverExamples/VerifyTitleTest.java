package webdriverExamples;

public class VerifyTitleTest {
public static void main(String[] args) {
	CommonMethods obj = new CommonMethods();
	obj.launchBrowser();
	obj.openURL("https://www.livetech.in");
	String actualTitle=obj.getCurrentPageTitle();
	boolean status=obj.compareTitle("livetech", actualTitle);
    obj.displayTestScriptStatus(status);
    obj.closeBrowser();
}
}
