package com.crm.BaseClass;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.crm.UtilityFile.ReadFile;

public class Login_BaseClass {
	public static WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	public void preCondition() throws IOException {
		String browser = ReadFile.propertiesFile("browser");
		String url = ReadFile.propertiesFile("url");

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}

	@AfterMethod
	public void postCondition() {
		driver.quit();
	}

	// Getter method for listener
	public WebDriver getDriver() {
		return driver;
	}
}
