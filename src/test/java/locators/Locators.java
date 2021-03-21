package locators;

import org.openqa.selenium.By;
import io.appium.java_client.MobileBy;

public class Locators {

	public static By joinThriveButton = MobileBy.name("Join Thrive");

	public static By firstNameText = MobileBy.AccessibilityId("Enter your First Name");
	public static By lastNameText = MobileBy.AccessibilityId("Enter your Last Name");
	public static By emailText = MobileBy.AccessibilityId("Enter your Email");
	public static By passwordText = MobileBy.AccessibilityId("Enter your Password");
	public static By getMostFromThrive = MobileBy.AccessibilityId("Get the most from Thrive");
	public static By createAccount = MobileBy.name("Create Account");

	// signin
	public static By signIn = MobileBy
			.iOSNsPredicateString("type ='XCUIElementTypeStaticText'  AND name CONTAINS[cd] 'log In'");
	public static By emailSignInText = MobileBy.AccessibilityId("Enter your Email");
	public static By passwordSignInText = MobileBy.AccessibilityId("Enter your Password");
	public static By loginButton = MobileBy.name("Log In");

	// forgot password
	public static By forgotPasswordLink = MobileBy.name("Forgot Password?");
	public static By forgotPasswordemailText = MobileBy.AccessibilityId("Enter your Email");
	public static By forgotPasswordRequestResetLink = MobileBy.AccessibilityId("Request Reset Link");

}
