package buffaloCartERP;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.UserPage;

public class VerifyUserNameInListTest extends BaseTester
{
	@Test
	public void verifyUser()
	{
		//LoginTest lt=new LoginTest();
		//lt.verify_login();
        LoginPage lp=new LoginPage(driver);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        lp.enter_userName("admin");
        lp.enter_password("123456");
        lp.click_submitButton();
		HomePage hp=new HomePage(driver);
		hp.clickOnUserMenu();
		UserPage up=new UserPage(driver);
		Assert.assertTrue(up.isASpecificUserPresent("Obsqura"),"The particular user is not listed the user list");	
	}
}
