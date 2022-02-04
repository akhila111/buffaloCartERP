package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewBugsPage 
{
  WebDriver driver;
  
		@FindBy(name = "bug_title")
		public WebElement bugTitle_text;
		
		@FindBy(id = "check_related")
		public WebElement related_dropdown;
		
		@FindBy(name = "bug_title")
		public WebElement reporter_dropdown;
		
		@FindBy(name = "priority")
		public WebElement priority_dropdown;
		
		@FindBy(name = "severity")
		public WebElement severity_dropdown;
		
		@FindBy(xpath = "//*[@id=\"assign_task\"]/div/div/form/div[8]/div/div/div[6]")
		public WebElement description_text;	
		
		@FindBy(xpath = "//*[@id=\"assign_task\"]/div/div/form/div[9]/div/div/div[6]")
		public WebElement reproducibility_text;	
		
		@FindBy(name = "bug_status")
		public WebElement bugStatus_dropdown;
		
		@FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
		public WebElement save_button;	
		
	  public NewBugsPage(WebDriver driver) 
	  {
		  PageFactory.initElements(driver, this);
		  this.driver=driver;
	  }
	  
		public void enter_bugTitle(String title)
		{
		   bugTitle_text.sendKeys(title);
		}

		public void selectValueFromRelatedDropdown(String related)
		{
			Select select=new Select(related_dropdown);
			select.selectByVisibleText(related);
		}
		public void selectValueFromReporterDropdown(String reporter) 
		{
			
		}

		public void selectValueFromPriorityDropdown(String priority) 
		{
			Select select=new Select(priority_dropdown);
			select.selectByVisibleText(priority);
		}

		public void selectValueFromSeverityDropdown(String severity)
		{
			Select select=new Select(severity_dropdown);
			select.selectByVisibleText(severity);
		}
		
		public void enter_description(String description)
		{
		   description_text.sendKeys(description);
		}

		public void enter_reproducibility(String repr)
		{
		   reproducibility_text.sendKeys(repr);
		}

		
		public void selectValueFromBugStatusDropdown(String bugstatus)
		{
			Select select=new Select(bugStatus_dropdown);
			select.deselectByValue(bugstatus);
		}
		
		public void clickOnSaveButton()
		{
			save_button.click();
		}
	
}
