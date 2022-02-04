package buffaloCartERP;

import org.testng.annotations.Test;
import pages.BugsPage;
import pages.HomePage;
import pages.LoginPage;
import pages.NewBugsPage;

public class NewBugTest extends BaseTester
{
        @Test
        public void verify_addNewBug()
        {
        	LoginPage bcLoginpage=new LoginPage(driver);
            bcLoginpage.userLogin("admin", "123456");
        	HomePage hp=new HomePage(driver);
        	hp.clickOnMenuWithName("Bugs");
        	BugsPage bp=new BugsPage(driver);
        	bp.click_newBugsLink();
        	NewBugsPage nbp=new NewBugsPage(driver);
        	nbp.enter_bugTitle("Bug1");
        	nbp.selectValueFromRelatedDropdown("Projects");
        	nbp.selectValueFromReporterDropdown("demo (Admin)");
        	nbp.selectValueFromPriorityDropdown("High");
        	nbp.selectValueFromSeverityDropdown("Minor");
        	nbp.enter_description("This is the description");
        	nbp.enter_reproducibility("This is the reproducibility");
        	//nbp.selectValueFromBugStatusDropdown("1");
        	nbp.clickOnSaveButton();

        	
        }
}
