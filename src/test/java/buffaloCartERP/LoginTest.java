package buffaloCartERP;

import org.testng.Assert;
import org.testng.annotations.Test;

import driver.DriverUtils;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTester
{
        @Test
        public void verify_login()
        {
            LoginPage bcLoginpage=new LoginPage(driver);
            DriverUtils.captureScreenshot(driver, "SC1");
            bcLoginpage.enter_userName("admin");
            bcLoginpage.enter_password("123456");
            bcLoginpage.click_submitButton();
            HomePage bcHomePage=new HomePage(driver);
            Assert.assertTrue(bcHomePage.isERPLogoPresent(),"ERP logo is  not present in the page");
        }
}
