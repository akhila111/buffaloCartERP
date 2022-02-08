package driver;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWait {

	// Explicit Wait
	public static Wait explicitWait(WebDriver driver) {
		Wait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
		return wdw;
	}

	// Fluent wait
	public static Wait fluentWait(WebDriver driver) {
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.ignoring(NoSuchElementException.class);
		return wait;
	}
}
