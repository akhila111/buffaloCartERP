package buffaloCartERP;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.UserMenuPage;

public class VerifyLogoutTest extends BaseTester {
	@Test
	void verifyUserCreation() throws AWTException {
		LoginPage lp = new LoginPage(driver);
		lp.userLogin();
		HomePage hp = new HomePage(driver);
		hp.clickOnUserImage();
		UserMenuPage ump = new UserMenuPage(driver);
		ump.clickOnLogoutButton();
		Assert.assertTrue(lp.isCurrentPageisLoginPage("Welcome to Codecarrots"), "Not in login page");
	}

}
