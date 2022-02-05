package buffaloCartERP;

import java.awt.AWTException;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.UserMenuPage;

public class VerifyUpdateProfileTest extends BaseTester
{
	@Test
	void verifyUserCreation() throws AWTException
	{
	LoginPage lp=new LoginPage(driver);
    lp.userLogin("admin", "123456");
	HomePage hp=new HomePage(driver);
	hp.clickOnUserImage();
	UserMenuPage ump=new UserMenuPage(driver);
	ump.clickOnUpdateProfileButton();
	}
	
}
