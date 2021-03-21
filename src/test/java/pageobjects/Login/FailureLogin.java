package pageobjects.Login;

import action.ActionBot;
import locators.Locators;

public class FailureLogin extends LoginNew {

	FailureLogin(String Email, String Password) {
		super(Email, Password);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setCredentails() {
		ActionBot.click(Locators.signIn);
		ActionBot.sendKeys(Locators.emailSignInText, super.Emails);
		ActionBot.sendKeys(Locators.passwordSignInText, super.Passwords);
		ActionBot.click(Locators.loginButton);

	}

}
