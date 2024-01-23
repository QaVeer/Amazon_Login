package testCases;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



import pageObjects.HomePage;
import pageObjects.LoginPage;

import pageObjects.SearchPage;

import testBase.BaseClass;

public class TC_007_EndToEndTest extends BaseClass {
	
	@Test
	public void endToendTest() throws Exception
	
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
	logger.info(" Starting TC_004_SearchProductTest ");

	
	
	HomePage hm=new HomePage(driver);
	
	Thread.sleep(3000);
	
	//hm.enterProductName("iPhone");
	hm.enterProductName("earpods");
	
	Thread.sleep(3000);
	hm.clickSearch();
	
/*		SearchPage sp=new SearchPage(driver);
	sp.isProductExist("earpods");

	Assert.assertEquals(sp.isProductExist("earpods"),true);

} catch (Exception e) {
	Assert.fail();
} */

logger.info(" Finished TC_005_SearchProductTest ");
logger.info(" Starting TC_005_AddToCartPageTest ");



HomePage hp=new HomePage(driver);

Thread.sleep(3000);

//hm.enterProductName("iPhone");
hp.enterProductName("earpods");

Thread.sleep(3000);
hp.clickSearch();

SearchPage sp=new SearchPage(driver);
Thread.sleep(4000);
//		driver.findElement(By.id("nav-search-bar-form")).submit();
//to perform Scroll on application using Selenium
 JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,350)", "");
 
Thread.sleep(4000);
sp.addToCart();
Thread.sleep(4000);

Set<String> s=driver.getWindowHandles();
ArrayList ar= new ArrayList<>(s);

System.out.println(ar.get(0));
System.out.println(ar.get(1));

driver.switchTo().window((String)ar.get(1));

 JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js1.executeScript("window.scrollBy(0,250)", "");
 sp.addToCart1();
}

}