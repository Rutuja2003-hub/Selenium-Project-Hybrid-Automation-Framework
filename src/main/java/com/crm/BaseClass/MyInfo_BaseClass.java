package com.crm.BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.crm.UtilityFile.ReadFile;

public class MyInfo_BaseClass {
	public static WebDriver driver;

	@BeforeClass
	public void preCondition() throws IOException {
		String browser = ReadFile.propertiesFile("browser");
		String url = ReadFile.propertiesFile("url");

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}

	@BeforeMethod(alwaysRun = true)
	public void login() throws InterruptedException, IOException {
		String username = ReadFile.propertiesFile("username");
		String password = ReadFile.propertiesFile("password");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
	}

	@AfterMethod
	public void logout() throws InterruptedException {
		driver.findElement(By.xpath("//li[@class='oxd-userdropdown']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

	@AfterClass
	public void postCondition() {
		driver.quit();
	}

	// Getter method for listener
	public WebDriver getDriver() {
		return driver;
	}
}
