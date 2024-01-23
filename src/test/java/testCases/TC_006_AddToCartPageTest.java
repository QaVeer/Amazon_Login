package testCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC_006_AddToCartPageTest extends BaseClass {
	
	@Test
	public void test_addToCart() throws Exception {
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

		//logger.info(" Finished TC_004_SearchProductTest ");

		}
	}
