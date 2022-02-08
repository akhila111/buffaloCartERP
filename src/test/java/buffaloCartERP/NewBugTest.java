package buffaloCartERP;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BugsPage;
import pages.HomePage;
import pages.LoginPage;
import pages.NewBugsPage;

public class NewBugTest extends BaseTester {
	@Test
	public void verify_addNewBug() {
		LoginPage lp = new LoginPage(driver);
		lp.userLogin();
		HomePage hp = new HomePage(driver);
		hp.clickOnMenuWithName("Bugs");
		BugsPage bp = new BugsPage(driver);
		bp.clickOnNewBugsLink();
		NewBugsPage nbp = new NewBugsPage(driver);
		nbp.enterBugTitle();
		// nbp.selectValueFromRelatedDropdown("Projects");
		// nbp.selectValueFromReporterDropdown("demo (Admin)");
		// nbp.selectValueFromPriorityDropdown("High");
		// nbp.selectValueFromSeverityDropdown("Minor");
		nbp.enterDescription("This is a new bug");
		nbp.enterReproducibility("Steps to Reproduce");
		nbp.clickOnSaveButton();
		bp.clickOnAllBugsLink();
		Assert.assertTrue(bp.verifyNewBugAddedInList(), "Bug is not created");

	}
}
