package co.in.infinitegreen.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage 
{
        WebDriver driver;
		public CartPage(WebDriver driver) 
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
		
		@FindBy(xpath = "p[class='text-[0.9rem] leading-[200%] font-medium text-white']")
		WebElement backToShop;
		
		@FindBy(xpath = "button[class='cursor-pointer w-max min-w-max border rounded-md text-[#0D6EFD] bg-white p-2 px-4']")
		WebElement removeAll;
		
		@FindBy(xpath = "//button[contains(text(),'Checkout')]")
		WebElement checkout;
		
		@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/*[1]")
		WebElement crossButton;
		
		@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]/*[1]")
		WebElement wishlist;
		
		@FindBy(xpath = "button[class='flex items-center justify-center h-full flex-shrink-0 focus:outline-none w-10 md:w-12 border-s border-gray-300']")
		WebElement plusQuantity;
		
		@FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > button:nth-child(1)")
		WebElement minusQuantity;
		
		@FindBy(css="(//a[contains(@class,'flex items-center gap-1 border border-transparent p-2 rounded-lg hover:border-blue-600 hover:bg-blue-100')])[1]")
		WebElement cart;
		
		public void clickOnbackToShop() 
		{
			backToShop.click();
			
		}
		
		public void clickOnRemoveCart() 
		{
			removeAll.click();
			
		}
		
		public void clickOnCheckout() 
		{
			checkout.click();
		
		}
		
		public void clickOnCrossButton() 
		{
			crossButton.click();
		}
		
		public void ClickOnWishlist() 
		{
			wishlist.click();
			
		}
		
		public void clickOnPlus() 
		{
			plusQuantity.click();
			
		}
		
		public void clickOnMinus() 
		{
			minusQuantity.click();
			
		}
		
		public void clickOnCart() 
		{
			cart.click();
			
		}

}
