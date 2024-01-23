package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage
{   
	WebDriver driver;
	
	public SearchPage(WebDriver driver)
	{
		super(driver);
	}	
	
		@FindBy(xpath="//input[@id='twotabsearchtextbox']")
		List<WebElement> searchProducts;
				
		@FindBy(xpath="//input[@id='nav-search-submit-button']")
		WebElement searchButton;
		
		@FindBy(xpath="//select[@id='searchDropdownBox']")
		WebElement searchCategory;
		
		@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[3]")
		WebElement btnclick;
		
		@FindBy(xpath="//input[@id='add-to-cart-button']")
		WebElement btnclick1;
		
		@FindBy(xpath="//span[text()='Related searches']")
		WebElement wait;
		
		@FindBy(xpath=".//span[@class='a-size-medium a-color-base a-text-normal']")
		WebElement list;
		
		
		@FindBy(xpath="//div[contains(text(),'Success: You have added')]")
		WebElement cnfMsg;
		
		public boolean isProductExist(String productName)
		{
			boolean flag=false;
			for(WebElement product:searchProducts)
			{				
				if(product.getAttribute("title").equals(productName))
				{
				flag=true;
				break;
				}
			}
			
			return flag;
		
		}
		
		public void selectProduct(String productName)
		{
			for(WebElement product:searchProducts)
			{				
				if(product.getAttribute("title").equals(productName))
				{
					product.click();
				}
			}
		
		}
		
		
		
		public void addToCart() throws Exception
		{
			Thread.sleep(3000);
			btnclick.click();
		}
		public void addToCart1() throws Exception
		{
			Thread.sleep(3000);
			btnclick1.click();
		}
		public void waitExplicit()
		{
			list.click();
		}
		
		public boolean checkConfMsg()
		{
			try
			{
			return cnfMsg.isDisplayed();
			}
			catch(Exception e)
			{
				return false;
			}
		}
		
}

