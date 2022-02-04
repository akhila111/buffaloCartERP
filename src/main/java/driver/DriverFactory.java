package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory
{

	public static WebDriver createBrowser(String browserName) {

		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("firefox"))
		{
			System.out.println("Test running in Firefox Browser........");
			System.setProperty("webdriver.gecko.driver", "C://Users//Akhila//Drivers//geckodriver.exe");
			driver= new FirefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			System.out.println("Test running in Chrome Browser.........");
			System.setProperty("webdriver.chrome.driver", "C://Users//Akhila//Drivers//chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			//options for chrome
			driver= new ChromeDriver(options);
		}
		
		return driver;
	}

}
