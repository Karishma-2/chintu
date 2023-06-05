package webdriverExamples;

import java.util.Set;

public class WindowHandling extends RightClick {
	public String getParentWindowId() {
		return driver.getWindowHandle();
	}

	public Set<String> getAllWindowId() {
		return driver.getWindowHandles();
	}

	public void switchToWindows(String parentId, Set<String> allWindows) {
		for (String win : allWindows) {
			if (!win.equals(parentId)) {
				switchToWindow(win);
			}
		}
	}

	public void switchToWindow(String Id) {
		driver.switchTo().window(Id);
	}

	public static void main(String[] args) throws Exception {
		WindowHandling obj = new WindowHandling();
		obj.launchBrowser();
		obj.openURL("http://www.amazon.in");
		obj.rightClick();
		obj.openLinkInNewTab();
		String parentId = obj.getParentWindowId();
		Set<String> allWindows = obj.getAllWindowId();
		obj.switchToWindows(parentId, allWindows);
		Thread.sleep(3000);
		obj.closeBrowser();
		obj.switchToWindow(parentId);
		Thread.sleep(3000);
		obj.closeBrowser();

	}
}