package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateProfilePage {
	WebDriver driver;
	public String phoneNumber;

	@FindBy(name = "phone")
	public WebElement phoneNumber_text;

	@FindBy(xpath = "//button[text()='Update Profile']")
	public WebElement updateProfile_button;

	public UpdateProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void enterPhoneNumber(String pn) {
		phoneNumber_text.clear();
		phoneNumber_text.sendKeys(pn);
		phoneNumber = pn;

	}

	public boolean verifyPhoneNumberUpdated() {
		if (MyDetailsPage.getUserDetails().contains(phoneNumber))
			return true;

		return false;
	}

	public void clickOnUpdateProfileButton() {
		updateProfile_button.click();
	}

}
