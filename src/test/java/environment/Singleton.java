package environment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class Singleton {

	private static Singleton instance;

	private Singleton() {
	}

	synchronized public static Singleton getInstance() {
		if (instance == null) {
			// if instance is null, initialize
			instance = new Singleton();
			System.out.println("driver is requested from Singleton");
		}
		return instance;
	}

	// logger
	public Logger logger() {
		final Logger logger = Logger.getLogger(Singleton.class.getName());
		System.out.println("Creating new instance");
		return logger;
	}

	public IOSDriver<IOSElement> setUpConfiguration() throws InterruptedException, MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("app", "com.compassCan.businessSectorApp");
		caps.setCapability("deviceName", "iPhone 12 Pro Max");
		caps.setCapability("automationName", "XCUITest");
		caps.setCapability("platformName", "iOS");
		caps.setCapability("platformVersion", "14.4");
		caps.setCapability("locale", "en_US");
		// caps.setCapability("newCommandTimeout","newCommandTimeout");
		caps.setCapability("orientation", "PORTRAIT");
		// caps.setCapability("noReset","true");
		// caps.setCapability("fullReset", "false");

		IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		return driver;
	}

}
