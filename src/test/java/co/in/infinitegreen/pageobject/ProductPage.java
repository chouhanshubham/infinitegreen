package co.in.infinitegreen.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage 
{
	WebDriver driver;
	public ProductPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//click on first product after search 
	@FindBy(xpath = "//img[@alt='66c479b186e9487427d6238b']")
	WebElement firstItem;
	
	@FindBy(xpath = "//button[contains(@class, 'text-[13px]') and contains(@class, 'md:text-sm') and contains(@class, 'font-semibold') and contains(@class, 'text-[#79A206]') and contains(@class, 'bg-heading') and contains(@class, 'border-[#79A206]')]\r\n")
	WebElement addToCart;
	
	@FindBy(css = "button span:contains('Buy Now')")
	WebElement buynowButton;

	
	public void clickOnFirstItem() 
	{
		firstItem.click();
		
	}
	
	public void clickOnAddToCart() 
	{
		addToCart.click();
		
	}
	
	public void clickOnBuynowButton() 
	{
		buynowButton.click();
		
	}
	
//	public String getUsername() 
//	{
//		String text = firstItem.getText();
//		return text;
//		
//	}

}
