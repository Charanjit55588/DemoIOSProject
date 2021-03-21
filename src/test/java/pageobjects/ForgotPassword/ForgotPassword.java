package pageobjects.ForgotPassword;

import action.ActionBot;
import locators.Locators;

public class ForgotPassword {
   
    public void resetPassword() {

        ActionBot.click(Locators.signIn);
        ActionBot.click(Locators.forgotPasswordLink);
        ActionBot.click(Locators.forgotPasswordemailText);
        ActionBot.sendKeys(Locators.forgotPasswordemailText, "bob@mailinator.com");
        ActionBot.click(Locators.forgotPasswordRequestResetLink);

    }
}
