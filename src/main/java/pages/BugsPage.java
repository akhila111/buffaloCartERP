package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BugsPage 
{
  WebDriver driver;

	@FindBy(xpath = "//a[contains(text(),'New Bugs')]")
	public WebElement newbugs_link;
	
  public BugsPage(WebDriver driver) 
  {
	  PageFactory.initElements(driver, this);
	  this.driver=driver;
  }
  
	public void click_newBugsLink()
	{
		newbugs_link.click();
	}
	
}
