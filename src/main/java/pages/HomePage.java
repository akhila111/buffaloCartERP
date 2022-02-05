package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;
	  
	@FindBy(xpath = "//div[@class='user-block-status']/img")
	public WebElement logo_image;
	
	@FindBy(xpath ="//li[@class='dropdown user user-menu']")
	public WebElement user_image;
	
	@FindBy(xpath="//a[contains(@title,'User')]")
	public WebElement user_menu;
	
	public HomePage(WebDriver driver) 
	  {
		  PageFactory.initElements(driver, this);
		  this.driver=driver;
	  }
	
	public boolean isERPLogoPresent()
	{
		return logo_image.isDisplayed();
	}
	
	public void clickOnUserMenu()
	{
	   user_menu.click();	
	}
	
	public void clickOnUserImage()
	{
	   user_image.click();	
	}


	public void clickOnMenuWithName(String menuname)
	{
		String menuXpath="//a[contains(@title,'"+menuname+"')]";
		driver.findElement(By.xpath(menuXpath)).click();
		
	}

}
