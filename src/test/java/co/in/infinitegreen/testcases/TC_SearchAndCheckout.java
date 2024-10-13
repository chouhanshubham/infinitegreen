package co.in.infinitegreen.testcases;

import java.io.IOException;

import java.time.Duration;

import org.testng.annotations.Test;

import co.in.infinitegreen.pageobject.CartPage;
import co.in.infinitegreen.pageobject.HomePage;
import co.in.infinitegreen.pageobject.ProductPage;

public class TC_SearchAndCheckout extends BaseClass
{
	@Test
	public void VerifySearchandCheckout() throws IOException 
	{
		driver.get(url);
		logger.info("*****URL Opened" +url+ "*****");
		
		// search elements in HomePage of Website
		HomePage homePageObj = new HomePage(driver);
		homePageObj.search("tulsi");
		homePageObj.clickOnSearchIcon();
		
		//Go to Product Page API
		ProductPage productPageObj = new ProductPage(driver);
		productPageObj.clickOnFirstItem();
		captureScreenshots(driver, "VerifySearchandCheckout");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		try {
			productPageObj.clickOnBuynowButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//productPageObj.clickOnAddToCart();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		//Cart Page
		CartPage cartPageObj = new CartPage(driver);
		cartPageObj.clickOnCart();
		cartPageObj.clickOnCheckout();
		
		
		
	}

}
