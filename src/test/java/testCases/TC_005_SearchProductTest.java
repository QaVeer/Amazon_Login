package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SearchPage;
import testBase.BaseClass;

@Test
public class TC_005_SearchProductTest extends BaseClass {

	public void test_pruductSearch() throws Exception {
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

	}
}
