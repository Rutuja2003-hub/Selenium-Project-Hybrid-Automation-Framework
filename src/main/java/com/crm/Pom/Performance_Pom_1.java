package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Performance_Pom_1 
{
	public Performance_Pom_1(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Performance']/../..")
	public WebElement PerformanceModule_Button;

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	public WebElement employee_Name;

	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
	public WebElement jobTitle;

	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[4]")
	public WebElement reviewStatus;

	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
	public WebElement subUnit;

	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[3]")
	public WebElement include;

	@FindBy(xpath = "(//input[@placeholder='dd-mm-yyyy'])[1]")
	public WebElement fromDate;

	@FindBy(xpath = "(//input[@placeholder='dd-mm-yyyy'])[2]")
	public WebElement toDate;

	@FindBy(css = "button[type='reset']")
	public WebElement resetButton;

	@FindBy(css = "button[type='submit']")
	public WebElement searchButton;

	@FindBy(xpath = "//a[text()='My Trackers']/..")
	public WebElement myTrackers_Button;

	@FindBy(xpath = "//a[text()='Employee Trackers']/..")
	public WebElement employeeTrackers_Button;

	@FindBy(css = "li[class='--active oxd-topbar-body-nav-tab --parent']")
	public WebElement configure_Button;
	
	@FindBy(css = ".oxd-icon.bi-chevron-right")
	public WebElement fromDate_NextButton;
	
	@FindBy(xpath = "//div[@class='oxd-calendar-date' and text()='20']")
	public WebElement date;
	
	@FindBy(css = "div[class='oxd-calendar-wrapper']")
	public WebElement toDate_CalendarWidget;
	
	@FindBy(xpath = "//p[text()='No Records Found']")
	public WebElement noRecordsFound_Popup;
	
	
	public void PerformanceModule_Button() {
		PerformanceModule_Button.click();
	}

	public void employee_Name(String data) {
		employee_Name.sendKeys(data);
	}

	public void jobTitle() {
		jobTitle.click();
	}

	public void subUnit() {
		subUnit.click();
	}

	public void reviewStatus() {
		reviewStatus.click();
	}

	public void include() {
		include.click();
	}

	public void fromDate() {
		fromDate.click();
	}
	
	public void date() {
		date.click();
	}

	public void fromDate_NextButton() {
		fromDate_NextButton.click();
	}
	
	public void toDate() {
		toDate.click();
	}

	public void resetButton() {
		resetButton.click();
	}

	public void searchButton() {
		searchButton.click();
	}

	public void myTrackers_Button() {
		myTrackers_Button.click();
	}

	public void employeeTrackers_Button() {
		employeeTrackers_Button.click();
	}

	public void configure_Button() {
		configure_Button.click();
	}
	
}
