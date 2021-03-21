package pageobjects.Login;

import action.ActionBot;
import locators.Locators;

public class SuccessfulLogin extends LoginNew {

	public SuccessfulLogin(String Email, String Password) {
		super(Email, Password);
	}

	@Override
	public void setCredentails() {
		ActionBot.click(Locators.signIn);
		ActionBot.sendKeys(Locators.emailSignInText, super.Emails);
		ActionBot.sendKeys(Locators.passwordSignInText, super.Passwords);
		ActionBot.click(Locators.loginButton);
	}

}
