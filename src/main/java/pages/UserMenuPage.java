package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserMenuPage 
{
   WebDriver driver;
   
   @FindBy(className ="pull-left")
   public WebElement updateProfile_button;
   
   @FindBy(className = "pull-right")
   public WebElement logout_button;
  
   @FindBy(xpath="//a[text()='My Details']")
   public WebElement myDetails_link;
   
   @FindBy(xpath="//ul[@class='dropdown-menu animated zoomIn']")
   public WebElement userMenu_zoomedIn;
    
   public UserMenuPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
	   this.driver=driver;
   }
   
   public boolean isUserMenuZoomedInPresent()
   {
	   return userMenu_zoomedIn.isDisplayed();
   }
   
   public boolean isUpdateProfileButtonPresent()
   {
	   return updateProfile_button.isDisplayed();
   }
   
   public void clickOnUpdateProfileButton() 
   {
   	updateProfile_button.click();
   }
   
   public boolean isLogoutButtonPresent()
   {
	   return logout_button.isDisplayed();
   }
   
   public void clickOnLogoutButton() 
   {
   	logout_button.click();
   	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   
   public void clickOnMyDetailsLink() 
   {
   	myDetails_link.click();
   }
   
   
}
