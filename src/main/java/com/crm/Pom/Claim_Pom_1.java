package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Claim_Pom_1 
{
	public Claim_Pom_1(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Claim']/../..")
	public WebElement ClaimModule_Button;

	@FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
	public WebElement employee_Name;

	@FindBy(xpath = "(//input[@placeholder='Type for hints...'])[2]")
	public WebElement reference_Id;

	@FindBy(xpath = "(//div[text()='-- Select --'])[1]/..")
	public WebElement eventName;

	@FindBy(xpath = "(//div[text()='-- Select --'])[2]/..")
	public WebElement status;

	@FindBy(xpath = "(//input[@placeholder='yyyy-dd-mm'])[1]/..")
	public WebElement fromDate;

	@FindBy(xpath = "(//input[@placeholder='yyyy-dd-mm'])[2]/..")
	public WebElement toDate;

	@FindBy(xpath = "//div[text()='Current Employees Only']/..")
	public WebElement include;

	@FindBy(xpath = "(//button[@type='button'])[5]")
	public WebElement reset_Button;

	@FindBy(xpath = "(//button[@type='submit'])")
	public WebElement search_Button;

	@FindBy(xpath = "(//button[@type='button'])[6]")
	public WebElement assignClaim_Button;

	@FindBy(xpath = "(//button[@type='button'])[7]")
	public WebElement viewDetails_Button;

	@FindBy(css = "li[class='--active oxd-topbar-body-nav-tab --parent']")
	public WebElement configuration_Button;

	@FindBy(xpath = "//a[text()='Submit Claim']/..")
	public WebElement submitClaim_Button;

	@FindBy(xpath = "//a[text()='My Claims']/..")
	public WebElement myClaim_Button;

	@FindBy(xpath = "//div[@role='option']")
	public WebElement noRecordsFound;
	
	@FindBy(xpath = "//div[text()='18' or  text()='November']")
	public WebElement date;
	
	@FindBy(css = "i[class='oxd-icon bi-chevron-right']")
	public WebElement fromDate_NextButton;
	
	
	public void ClaimModule_Button() {
		ClaimModule_Button.click();
	}
	public void employee_Name(String data) {
		employee_Name.sendKeys(data);
	}
	public void reference_Id(String data) {
		reference_Id.sendKeys(data);
	}
	public void eventName() {
		eventName.click();
	}
	public void status() {
		status.click();
	}
	public void fromDate() {
		fromDate.click();
	}
	public void toDate() {
		toDate.click();
	}
	public void include() {
		include.click();
	}
	public void reset_Button() {
		reset_Button.click();
	}
	public void search_Button() {
		search_Button.click();
	}
	public void assignClaim_Button() {
		assignClaim_Button.click();
	}
	public void viewDetails_Button() {
		viewDetails_Button.click();
	}
	public void configuration_Button() {
		configuration_Button.click();
	}
	public void submitClaim_Button() {
		submitClaim_Button.click();
	}
	public void myClaim_Button() {
		myClaim_Button.click();
	}
	public void date() {
		date.click();
	}
	public void fromDate_NextButton() {
		fromDate_NextButton.click();
	}
	
}
