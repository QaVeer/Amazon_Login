package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(xpath = "//span[contains(text(),'veer swami')]")
	WebElement lnkMyaccount;

	@FindBy(linkText = "Register")
	WebElement lnkRegister;

	@FindBy(linkText = "Login")   // Login link added in step6
	WebElement linkLogin;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchProducts;
	
	
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement clickSearch1;

	
		
	// Action Methods
	public void clickMyAccount() throws Exception {
		//lnkMyaccount.click();
		Thread.sleep(3000);
		Actions action = new Actions(driver); 
		action.moveToElement(lnkMyaccount).build().perform();
	}

	public void clickRegister() {
		lnkRegister.click();
	}
	
	public void clickLogin()    // added in step6
	{
		linkLogin.click();
	}

	public void enterProductName(String pname) throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		searchProducts.sendKeys(pname);
	}

	public void clickSearch() throws Exception {
		
		Thread.sleep(2000);
		clickSearch1.click();
		
		
		
	}
	
	
	
}
