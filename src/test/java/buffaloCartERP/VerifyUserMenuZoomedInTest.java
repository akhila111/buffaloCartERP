package buffaloCartERP;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.UserMenuPage;

public class VerifyUserMenuZoomedInTest extends BaseTester {
	@Test
	void verifyUserCreation() throws AWTException {
		LoginPage lp = new LoginPage(driver);
		lp.userLogin();
		HomePage hp = new HomePage(driver);
		hp.clickOnUserImage();
		UserMenuPage ump = new UserMenuPage(driver);
		Assert.assertTrue(ump.isUpdateProfileButtonPresent(), "Update profile Button is not present in the page");
		Assert.assertTrue(ump.isLogoutButtonPresent(), "Logout button is not present in the page");
	}

}
