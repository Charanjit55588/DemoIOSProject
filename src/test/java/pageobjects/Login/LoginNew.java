package pageobjects.Login;

public abstract class LoginNew {
	String Emails;
	String Passwords;

	LoginNew(String Email, String Password) {
		this.Emails = Email;
		this.Passwords = Password;
	}

	abstract public void setCredentails();
}
