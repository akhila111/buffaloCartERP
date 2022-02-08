package buffaloCartERP;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import driver.DriverFactory;
import driver.DriverUtils;
import utils.ReadPropertyFile;

public class BaseTester {
	WebDriver driver;

	@Parameters("browser")
	@BeforeMethod
	void openingBrowser(@Optional("chrome") String browserName) {
		driver = DriverFactory.createBrowser(browserName);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver = DriverUtils.maximizeWindow(driver);
		driver.get(ReadPropertyFile.getURL());
	}

	@AfterMethod
	void closingBrowser() {
		driver.quit();
	}

	@AfterMethod
	void afterMethod(ITestResult iTestResult) {
		String screenshotName = iTestResult.getName() + "_"
				+ String.valueOf(new SimpleDateFormat("dd.MM.yyyy_HH.mm.ss").format(new Date()));
		if (iTestResult.getStatus() == 2) {
			DriverUtils.captureScreenshot(driver, screenshotName + "_failed");
		}
		if (iTestResult.getStatus() == 1) {
			DriverUtils.captureScreenshot(driver, screenshotName + "_passed");
		}
	}
}
