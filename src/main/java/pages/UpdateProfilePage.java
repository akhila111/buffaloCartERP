package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateProfilePage 
{
   WebDriver driver;
   
   @FindBy(name  ="phone")
   public WebElement phoneNumber_text;
   
   @FindBy(className = "pull-right")
   public WebElement logout_button;
   
   @FindBy(xpath="//button[text()='Update Profile']")
   public WebElement updateProfile_button;
    
   public UpdateProfilePage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
	   this.driver=driver;
   }
   
   public String getCurrentPhoneNumber()
   {
	   String currentPhoneNumber=phoneNumber_text.getText();
	   return currentPhoneNumber;
   }
    public void enterPhoneNumber(String phoneNumber)
   {
       phoneNumber_text.clear();
	   phoneNumber_text.sendKeys(phoneNumber);
   }
   
   public void verifyPhoneNumberUpdated() 
   {
	   
   }
   
   public void clickOnUpdateProfileButton() 
   {
	   updateProfile_button.click();
   }
   
}
