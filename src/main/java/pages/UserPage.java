package pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
	WebDriver driver;

	@FindBy(id = "DataTables")
	public WebElement user_table;

	@FindBy(xpath = "//table[@id='DataTables']/tbody/tr/td[2]")
	public List<WebElement> user_list;

	@FindBy(xpath = "//a[text()='New User']")
	public WebElement newUser_link;

	public UserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public boolean isUserTablePresent() {
		return user_table.isDisplayed();
	}

	public boolean isASpecificUserPresent(String username) {
		System.out.println("List Size is " + user_list.size());
		boolean flag = false;
		for (WebElement ul : user_list) {
			String name = ul.getText();
			if (name.equals(username))
				flag = true;
		}
		return flag;
	}

	public void clickOnNewUserLink() {
		newUser_link.click();
	}

}
