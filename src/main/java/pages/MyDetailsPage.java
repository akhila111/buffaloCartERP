package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyDetailsPage {
	WebDriver driver;

	public static String userDetails;

	@FindBy(xpath = "//*[@id='basic_info']")
	public static WebElement userdetails_data;

	public MyDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public static String getUserDetails() {
		userDetails = userdetails_data.getText();
		return userDetails;
	}

}
