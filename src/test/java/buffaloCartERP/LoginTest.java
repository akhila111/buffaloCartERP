package buffaloCartERP;

import org.testng.Assert;
import org.testng.annotations.Test;
import dataProviders.GetUsersData;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTester {
	@Test(dataProvider = "UserLogin", dataProviderClass = GetUsersData.class)
	public void verify_login(String username, String password) {
		LoginPage lp = new LoginPage(driver);
		lp.enter_userName(username);
		lp.enter_password(password);
		lp.click_submitButton();
		HomePage bcHomePage = new HomePage(driver);
		Assert.assertTrue(bcHomePage.isERPLogoPresent(), "ERP logo is  not present in the page");
	}
}
