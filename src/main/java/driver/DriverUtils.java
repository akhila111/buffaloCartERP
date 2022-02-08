package driver;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class DriverUtils {

	public static WebDriver maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
		return driver;
	}

	public static void captureScreenshot(WebDriver driver, String fileName) {

		try {
			File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(sourceFile, new File(fileName + ".png"));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
