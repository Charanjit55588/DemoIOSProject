package mobile.ios;

import java.net.MalformedURLException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import pageobjects.Login.*;
import pageobjects.CreateAccount.*;
import pageobjects.ForgotPassword.*;

class FireN {
	public static IOSDriver<IOSElement> driver;

	@BeforeSuite
	public void fire() throws InterruptedException, MalformedURLException {
	}

	@AfterSuite
	public void q() {
		System.out.println("Quite from the After Suite FireN Class");
		driver.quit();
	}

	@Test(priority = 1, enabled = true)
	public void signIn() throws InterruptedException, MalformedURLException {
		// Login object1= new Login(driver);
		// object1.successfulAttempt();

		// CreateAccount account=new CreateAccount();
		// account.createAccount();
		// System.out.println("Sign In Method in Fire Class");

		LoginNew successlogin = new SuccessfulLogin("bob@mailinator.com", "Password1234");
		successlogin.setCredentails();
		System.out.println("Sign In Method in Fire Class");

	}

	@Test(priority = 2, enabled = true)
	public void createAccount() throws InterruptedException, MalformedURLException {
		CreateAccount account = new CreateAccount();
		account.createAccount();
		System.out.println("Sign In Method in Fire Class");
	}

	@Test(priority = 3, enabled = true)
	public void resetMyPassword() throws InterruptedException, MalformedURLException {
		ForgotPassword resetPassord = new ForgotPassword();
		resetPassord.resetPassword();
	}

}
