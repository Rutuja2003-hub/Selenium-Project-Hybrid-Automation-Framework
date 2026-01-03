package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimePage_Pom_1 
{
	public TimePage_Pom_1(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[@class='oxd-main-menu-item-wrapper']/../li[4]")
	public WebElement TimeModule_Button;

	@FindBy(css = "input[placeholder='Type for hints...']")
	public WebElement employee_Name;

	@FindBy(css = "button[type='submit']")
	public WebElement view_Button;

	@FindBy(xpath = "(//li[@class='oxd-topbar-body-nav-tab --parent'])[1]")
	public WebElement attendance_Button;

	@FindBy(xpath = "(//li[@class='oxd-topbar-body-nav-tab --parent'])[2]")
	public WebElement reports_Button;

	@FindBy(xpath = "(//li[@class='oxd-topbar-body-nav-tab --parent'])[3]")
	public WebElement projectInfo_Button;
	
	@FindBy(xpath = "//div[text()='No Records Found']")
	public WebElement noRecordsFound;
	
	@FindBy(xpath = "//span[text()='Required']")
	public WebElement requiredMessage;
	
	@FindBy(className = "oxd-table-body")
	public WebElement employeeRecordsRows;
	
	@FindBy(xpath = "(//button[@type='button'])[4]")
	public WebElement firstRowOfRecordsFound;
	
	@FindBy(css = "ul[role='menu']")
	public WebElement projectInfo_Menu;
	
	public void TimeModule_Button() {
		TimeModule_Button.click();
	}

	public void employee_Name(String data) {
		employee_Name.sendKeys(data);
	}

	public void view_Button() {
		view_Button.click();
	}

	public void attendance_Button() {
		attendance_Button.click();
	}

	public void reports_Button() {
		reports_Button.click();
	}

	public void projectInfo_Button() {
		projectInfo_Button.click();
	}
	
	public void firstRowOfRecordsFound() {
		firstRowOfRecordsFound.click();
	}
	

}
