package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage 
{
  WebDriver driver;
  
	@FindBy(name = "user_name")
	public WebElement userName_text;
	
	@FindBy(name = "password")
	public WebElement password_text;
	
	@FindBy(xpath = "//button[text()='Sign in ']")
	public WebElement submit_button;
	
  public LoginPage(WebDriver driver) 
  {
	  PageFactory.initElements(driver, this);
	  this.driver=driver;
  }
  
  public boolean isCurrentPageisLoginPage(String expectedPageTitle)
  {
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(userName_text));
    	String actualPageTitle=driver.getTitle();
	  if(actualPageTitle.equals(expectedPageTitle))
	  {
		  return true;
	  }
	return false; 	  
  }
  
	public void enter_userName(String username)
	{
		userName_text.sendKeys(username);
	}
	
	public void enter_password(String password)
	{
		password_text.sendKeys(password);
	}
	
	public void click_submitButton()
	{
		submit_button.click();
	}
	
	public void userLogin(String un,String pwd)
	{
		enter_userName(un);
		enter_password(pwd);
		click_submitButton();
	}
	
	
}
