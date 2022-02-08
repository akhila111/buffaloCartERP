package buffaloCartERP;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.NewUserPage;
import pages.UserPage;

public class AddNewUserTest extends BaseTester {
	@Test(groups = { "regression", "Smoke" })
	void verifyUserCreation() throws AWTException {
		LoginPage lp = new LoginPage(driver);
		lp.userLogin();
		HomePage hp = new HomePage(driver);
		hp.clickOnMenuWithName("User");
		UserPage up = new UserPage(driver);
		up.clickOnNewUserLink();
		NewUserPage nup = new NewUserPage(driver);
		nup.enterFullName("Akhila");
		nup.enterEmploymentID("123");
		nup.enterUserName("akhila123");
		nup.enterPassword("abcd1234");
		nup.enterConfirmPassword("abcd1234");
		nup.enterEmailaddress("abcd@gmail.com");
		nup.selectLocaleDropdownValue("English (Zambia)");
		nup.enterPhoneNumber("123456789");
		// nup.enterMobileNumber("9876543221");
		// nup.enterSkypeID("test123");
		nup.uploadFile("C:\\Users\\kmrz1\\Desktop\\Pic.jpg");
		// nup.selectUserType("Admin");
		// nup.selectDirection("LTR");
		// nup.selectDesignation("Manager");
		// nup.clickOnDepartmentHeadCheckbox();
		// nup.ChoosePermissionRadioButton(1);
		// nup.clickOnCreateUserButton();

	}

}
