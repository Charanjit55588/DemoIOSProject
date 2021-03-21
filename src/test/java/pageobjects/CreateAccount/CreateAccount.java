package pageobjects.CreateAccount;

import action.ActionBot;
import locators.Locators;

public class CreateAccount {

	public void createAccount() {

		ActionBot.click(Locators.joinThriveButton);
		ActionBot.sendKeys(Locators.firstNameText, "Adam");
		ActionBot.sendKeys(Locators.lastNameText, "Peter");
		ActionBot.sendKeys(Locators.emailText, "bob1@mailinator.com");
		ActionBot.sendKeys(Locators.passwordText, "Password1234");
		ActionBot.click(Locators.getMostFromThrive);
		// ActionBot.click(Locators.createAccount);
	}
}
