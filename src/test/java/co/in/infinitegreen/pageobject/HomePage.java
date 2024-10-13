package co.in.infinitegreen.pageobject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;
	public HomePage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//find elements using locators
	@FindBy(xpath ="//input[@placeholder='Search']")
	WebElement searchItem;
	
	@FindBy(css = "img[class='p-[0.05vw]'")
    WebElement searchIcon;
	
	public void search(String str) //search any items
	{
		searchItem.sendKeys(str);
	}
	
	public void clickOnSearchIcon() 
	{
		searchIcon.click();
		
	}
	


}
