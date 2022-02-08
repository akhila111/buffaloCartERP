package buffaloCartERP;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MyDetailsPage;
import pages.UpdateProfilePage;
import pages.UserMenuPage;

public class VerifyUpdateProfileTest extends BaseTester {
	@Test
	void verifyUserCreation() throws AWTException {
		LoginPage lp = new LoginPage(driver);
		lp.userLogin();
		HomePage hp = new HomePage(driver);
		hp.clickOnUserImage();
		UserMenuPage ump = new UserMenuPage(driver);
		ump.clickOnUpdateProfileButton();
		UpdateProfilePage upp = new UpdateProfilePage(driver);
		upp.enterPhoneNumber("7777777777");
		upp.clickOnUpdateProfileButton();
		hp.clickOnUserImage();
		ump.clickOnMyDetailsLink();
		MyDetailsPage.getMyPhoneNumber();
		Assert.assertTrue(upp.verifyPhoneNumberUpdated(), "Phone number not updated");
	}

}
