package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage_Pom_1 
{
	public DashboardPage_Pom_1(WebDriver driver) // constructor
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@alt='client brand banner']")
	public WebElement orangeHRM_logo;

	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement search_field;

	@FindBy(xpath = "(//li[@class='oxd-main-menu-item-wrapper'])[1]")
	public WebElement admin_Button;

	@FindBy(xpath = "(//li[@class='oxd-main-menu-item-wrapper'])[2]")
	public WebElement pim_Button;

	@FindBy(xpath = "(//li[@class='oxd-main-menu-item-wrapper'])[3]")
	public WebElement leave_Button;

	@FindBy(xpath = "(//li[@class='oxd-main-menu-item-wrapper'])[4]")
	public WebElement time_Button;

	@FindBy(xpath = "(//li[@class='oxd-main-menu-item-wrapper'])[5]")
	public WebElement recruitment_Button;

	@FindBy(xpath = "//div[@class='orangehrm-upgrade-container']")
	public WebElement upgrade_Button;

	@FindBy(xpath = "//li[@class='oxd-userdropdown']")
	public WebElement user_profile_rightCorner;

	@FindBy(xpath = "//i[@class='oxd-icon bi-stopwatch']")
	public WebElement timeAtWork_Clock_Logo;

	@FindBy(xpath = "(//div[@class='orangehrm-todo-list-item'])[1]")
	public WebElement myActions_TimesheetsToApprove;

	@FindBy(xpath = "(//div[@class='orangehrm-todo-list-item'])[2]")
	public WebElement myActions_PendingSelfReview;

	@FindBy(xpath = "(//div[@class='orangehrm-todo-list-item'])[3]")
	public WebElement myActions_CandidateToInterview;

	@FindBy(xpath = "//button[@title='Assign Leave']")
	public WebElement assignLeave_Logo;

	@FindBy(xpath = "//button[@title='Leave List']")
	public WebElement leaveList_Logo;

	@FindBy(xpath = "//button[@title='Timesheets']")
	public WebElement timeSheets_Logo;

	@FindBy(xpath = "//button[@title='Apply Leave']")
	public WebElement applyLeave_Logo;

	@FindBy(xpath = "//button[@title='My Leave']")
	public WebElement myLeave_Logo;

	@FindBy(xpath = "//button[@title='My Timesheet']")
	public WebElement myTimesheet_Logo;
	
	@FindBy(xpath = "(//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--white orangehrm-dashboard-widget'])[2]")
	public WebElement myAction_Widget;
	
	@FindBy(xpath = "(//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--white orangehrm-dashboard-widget'])[4]")
	public WebElement buzzLatestPosts;
	
	@FindBy(xpath = "//p[text()='Quick Launch']")
	public WebElement quickLunch_Text;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	public WebElement employee_NameOfTimeSheet;
	
	@FindBy(xpath= "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
	public WebElement leave_Type;
	
	
	public void orangeHRM_logo() {
		orangeHRM_logo.click();
	}

	public void searchFiled(String data) {
		search_field.sendKeys(data);
	}

	public void admin_Button() {
		admin_Button.click();
	}

	public void pim_Button() {
		pim_Button.click();
	}

	public void leave_Button() {
		leave_Button.click();
	}

	public void time_Button() {
		time_Button.click();
	}

	public void recruitment_Button() {
		recruitment_Button.click();
	}

	public void upgrade_Button() {
		upgrade_Button.click();
	}
	
	public WebElement myAction_Widget()
	{
		return myAction_Widget;
	}
	
	public WebElement buzzLatestPost() {
		return buzzLatestPosts;
	}

	public void user_profile_rightCorner() {
		user_profile_rightCorner.click();
	}

	public void timeAtWork_Clock_Logo() {
		timeAtWork_Clock_Logo.click();
	}

	public void myActions_TimesheetsToApprove() {
		myActions_TimesheetsToApprove.click();
	}

	public void myActions_PendingSelfReview() {
		myActions_PendingSelfReview.click();
	}

	public void myActions_CandidateToInterview() {
		myActions_CandidateToInterview.click();
	}

	public void assignLeave_Logo() {
		assignLeave_Logo.click();
	}

	public void leaveList_Logo() {
		leaveList_Logo.click();
	}

	public void timeSheets_Logo() {
		timeSheets_Logo.click();
	}

	public void applyLeave_Logo() {
		applyLeave_Logo.click();
	}

	public void myLeave_Logo() {
		myLeave_Logo.click();
	}

	public void myTimesheet_Logo() {
		myTimesheet_Logo.click();
	}
	
	public WebElement quickLunch_Text()
	{
		return quickLunch_Text;
	}
	
	public void employee_NameOfTimeSheet(String data)
	{
		employee_NameOfTimeSheet.sendKeys(data);
	}
	
	public WebElement employee_NameOfTimeSheet1()
	{
		return employee_NameOfTimeSheet;
	}
	public void leave_Type()
	{
		leave_Type.click();
	}
}
