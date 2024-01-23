package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;

import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass
{
	@Test(groups= {"Sanity","Regression"})
	public void test_Login() throws Exception
	{
		logger.info("Starting TC_002_LoginTest");
		
	
			
			LoginPage lp=new LoginPage(driver);
			
			Actions action = new Actions(driver); 
			 
            Thread.sleep(3000);
			action.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();;
			lp.clickSign();
			
			Thread.sleep(3000);
			
			lp.setEmail(rb.getString("email")); // valid email, get it from properties file
			lp.setcontinueclick();
			
			
			Thread.sleep(3000);
			lp.setPassword(rb.getString("password")); // valid password, get it from properties file
			
			Thread.sleep(3000);
			lp.clickLogin();
			

	
		logger.info(" Finished TC_002_LoginTest");
		
	}
	
	
}


