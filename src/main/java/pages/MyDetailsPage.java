package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyDetailsPage {
	WebDriver driver;

	public static String phoneNumber_userDetails;

	@FindBy(xpath = "//*[@id=\"basic_info\"]/div/div[2]/div[12]/div/p")
	public static WebElement phoneNumber;

	public MyDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public static String getMyPhoneNumber() {
		phoneNumber_userDetails = phoneNumber.getText();
		return phoneNumber_userDetails;
	}

}
