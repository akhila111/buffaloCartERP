package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.DriverUtils;
import driver.SeleniumWait;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class NewUserPage
{

	   WebDriver driver;
	   
	   @FindBy(name="fullname")
	   public WebElement fullName_text;
	   
	   @FindBy(name="employment_id")
	   public WebElement employmentID_text;
	   
	   @FindBy(id="check_username")
	   public WebElement userName_text;
	   
	   @FindBy(id="new_password")
	   public WebElement password_text;
	   
	   @FindBy(name="confirm_password")
	   public WebElement confirmPassword_text;
	   
	   @FindBy(id="check_email_addrees")
	   public WebElement email_text;
	   
	   @FindBy(xpath="//span[@title='English (United States)']")
	   public WebElement locale_dropdown;
	 
	   
	   @FindBy(xpath="//span[@id='select2-language-8r-container']")
	   public WebElement language_dropdown;
	   
	   @FindBy(name="phone")
	   public WebElement phone_text;
	   
	   @FindBy(name="mobile")
	   public WebElement mobile_text;
	   
	   @FindBy(name="skype")
	   public WebElement skypeid_text;
	   
	   @FindBy(xpath="//input[@id='myImg']")
	   public WebElement chooseFile_Button;
	   
	   @FindBy(id="user_type")
	   public WebElement userType_dropdown;
	   
	   @FindBy(className ="filter-option")
	   public WebElement direction_dropdown;
	   
	   @FindBy(id ="select2-designations_id-vk-container")
	   public WebElement designation_dropdown;
	   
	   @FindBy(className="fa-check")
	   public WebElement departmentHead_checkbox;
	   
	   @FindBy(xpath ="//span[@class='fa fa-circle']")
	   public WebElement permission_radiobutton1;
	   
	   @FindBy(xpath ="//span[@class='fa fa-circle']")
	   public WebElement permission_radiobutton2;
	   
	   @FindBy(xpath ="//button[text()='Create User']")
	   public WebElement createuser_button; 
	    
	   public NewUserPage(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
		   this.driver=driver;
	   }
	   
	   public void enterFullName(String fn)
	   {
		   fullName_text.sendKeys(fn);
	   }
	   
	   public void enterEmploymentID(String id)
	   {
		   employmentID_text.sendKeys(id);
	   }

	   public void enterUserName(String un)
	   {
		   userName_text.sendKeys(un);
	   }

	   public void enterPassword(String pwd)
	   {
		   password_text.sendKeys(pwd);
	   }

	   public void enterConfirmPassword(String cnfmpwd)
	   {
		   confirmPassword_text.sendKeys(cnfmpwd);
	   }
	   public void enterEmailaddress(String ea)
	   {
		   email_text.sendKeys(ea);
	   }
	   
	   public void selectLocaleDropdownValue(String locale)
	   {
		    locale_dropdown.click();
		    String localeoption="//span[contains(@title,'"+locale+"')]";
		    System.out.println("The xpath is :"+localeoption);
			WebElement element= driver.findElement(By.xpath(localeoption));
			WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(element));
			element.click();	   			
	   }
	   	   

	   public void selectLanguageDropdownValue()
	   {
			WebElement element= driver.findElement(By.xpath("//span[@title='English']"));
			//WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
			SeleniumWait.explicitWait(driver).until(ExpectedConditions.visibilityOf(element));
			element.click();	   			
	   }
	   
	   public void enterPhoneNumber(String phone)
	   {
		   phone_text.sendKeys(phone);
	   }
	   
	   public void enterMobileNumber(String mobno)
	   {
		   mobile_text.sendKeys(mobno);
	   }
	   
	   public void enterSkypeID(String skypeid)
	   {
		   skypeid_text.sendKeys(skypeid);
	   }
	   
	   public void uploadFile(String imagePath) throws AWTException
		{
		    JavascriptExecutor executor = (JavascriptExecutor)driver;
		    executor.executeScript("arguments[0].click();", chooseFile_Button);
		    StringSelection img = new StringSelection(imagePath);
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(img, null);	
		     Robot robot = new Robot();
		     robot.delay(250);
		     robot.keyPress(KeyEvent.VK_CONTROL);
		     robot.keyPress(KeyEvent.VK_V);
		     robot.keyRelease(KeyEvent.VK_V);
		     robot.keyRelease(KeyEvent.VK_CONTROL);
		     robot.keyPress(KeyEvent.VK_ENTER);
		     robot.delay(90);
		     robot.keyRelease(KeyEvent.VK_ENTER);
		   }
	   
	   
	   public void selectUserType(String ut)
	   {

		   Select select = new Select(userType_dropdown);
		   select.selectByVisibleText(ut);
	   }
	   
	   public void selectDirection(String dir)
	   {
		   Select select = new Select(direction_dropdown);
		   select.selectByVisibleText(dir);
	   }
	   
	   public void selectDesignation(String desg)
	   {
		   Select select = new Select(designation_dropdown);
		   select.selectByVisibleText(desg);
	   }
	   
	   public void clickOnDepartmentHeadCheckbox()
	   {
		   departmentHead_checkbox.click();
	   }
	   
	   public void ChoosePermissionRadioButton(int per)
	   {
		   if(per==1)
		   {
			   permission_radiobutton1.click();
		   }
		   
		   else if(per==2)
		   {
			   permission_radiobutton2.click();
		   }
	   }
	   
	   public void clickOnCreateUserButton()
	   {
		   createuser_button.click();
	   }

	
	   
}
