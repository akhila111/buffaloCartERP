package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BugsPage {
	WebDriver driver;

	@FindBy(xpath = "//a[contains(text(),'New Bugs')]")
	public WebElement newBugs_link;

	@FindBy(xpath = "//a[contains(text(),'All Bugs')]")
	public WebElement allBugs_link;

	@FindBy(xpath = "//label[contains(text(),'Search all columns')]")
	public WebElement search_text;

	@FindBy(xpath = "//*[@id=\"table_0\"]")
	public WebElement firstRow_bugList;

	public BugsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void clickOnNewBugsLink() {
		newBugs_link.click();
	}

	public void clickOnAllBugsLink() {
		newBugs_link.click();
	}

	public void searchForNewlyAddedBug() {
		String textToSearch = NewBugsPage.bugName;
		search_text.sendKeys(textToSearch);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean verifyNewBugAddedInList() {
		if (firstRow_bugList.getText().contains(NewBugsPage.bugName))
			return true;
		return false;
	}

}
