package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[@id='nav-link-accountList']")
	WebElement accountBtn;
	
	@FindBy(xpath = "//span[contains(text(),'Sign in')]")
	WebElement signinBtn;

	@FindBy(xpath = "//input[@id='ap_email']")
	WebElement txtEmailAddress;
	
	@FindBy(xpath = "//input[@id='continue']")
	WebElement btnContinue;


	@FindBy(xpath = "//input[@id='ap_password']")
	WebElement txtPassword;
	
	//(//button[@class='mat-focus-indicator input-data sys mb-10 mat-raised-button mat-button-base ng-star-inserted'])[1]
   
	
	
	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement btnLogin;
	
	public void clickAccount() throws Exception {
		
		Thread.sleep(2000);
		accountBtn.click();
	}
	
	public void clickSign() throws Exception {
		Thread.sleep(2000);
		signinBtn.click();
	}

	public void setEmail(String email) throws Exception {
		Thread.sleep(2000);
		txtEmailAddress.sendKeys(email);
	}

	public void setcontinueclick() throws Exception {
		Thread.sleep(2000);
		btnContinue.click();
	}
	public void setPassword(String pwd) throws Exception {
		Thread.sleep(2000);
		txtPassword.sendKeys(pwd);
	}

	public void clickLogin() throws Exception {
		Thread.sleep(2000);
		btnLogin.click();
	}

	

}
