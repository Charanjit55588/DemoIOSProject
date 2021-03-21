package action;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import environment.Singleton;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class ActionBot {

	public static IOSDriver<IOSElement> driver;
	// ----public static Singleton singleton=Singleton.getInstance();
	// public ActionBot(IOSDriver<IOSElement> driver) {
	// this.driver = driver;
	// }
	static {
		try {
			Singleton singleton = Singleton.getInstance();
			ActionBot.driver = singleton.setUpConfiguration();
		} catch (InterruptedException | MalformedURLException e) {
			throw new RuntimeException();
		}
	}

	// resetAppData
	public static void clearAppdata() {
		driver.resetApp();
	}

	// Click
	public static void click(By locator) {
		driver.findElement(locator).click();
		// --singleton.setUpConfiguration().findElement(locator).click();
	}

	// Text Field
	public static void sendKeys(By locator, String text) {
		/*
		 * if (!(driver.findElement(locator) == null)) {
		 * driver.findElement(locator).clear();
		 * driver.findElement(locator).sendKeys(text); } else
		 */
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(text);
		// --singleton.setUpConfiguration().findElement(locator).sendKeys(text);
	}

	// Click on the n radio buttons
	public static void radioButtons(By locator[]) {
		for (int i = 0; i > locator.length; i++) {
			// driver.findElement(locator[i]).click();
		}
	}

	// To verify a button is enabled or not
	public void enabledButton(By locator) {
		// driver.findElement(locator).isEnabled();

	}

	// To scroll a page to the bottom
	public static void scrollDown() {
		// driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
	}

	public static void scrollUp() {
		// driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "up"));
	}

	// setLocation
	public static void setLocation(By locator) {
		// driver.findElement(locator).clear();
	}

}
