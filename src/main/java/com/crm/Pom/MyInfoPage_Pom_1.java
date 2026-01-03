package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyInfoPage_Pom_1 
{
	public MyInfoPage_Pom_1(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[@class='oxd-main-menu-item-wrapper'][6]")
	public WebElement MyInfoModule_Button;

	@FindBy(name = "firstName")
	public WebElement employee_FirstName;

	@FindBy(name = "lastName")
	public WebElement employee_LastName;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	public WebElement employeeId;

	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
	public WebElement nationality;

	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
	public WebElement maritalStatus;

	@FindBy(xpath = "(//input[@placeholder='yyyy-dd-mm'])[2]")
	public WebElement dateOfBirth;

	@FindBy(xpath = "(//input[@type='radio'])[2]")
	public WebElement female_Gender;

	@FindBy(xpath = "(//button[@type='submit'])[1]")
	public WebElement saveButton_OfPersonalDetails;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--text']")
	public WebElement addButton_OfPersonalDetails;

	@FindBy(xpath = "(//div[@class='orangehrm-tabs-wrapper'])[2]")
	public WebElement contactDetails_Button;

	@FindBy(xpath = "(//div[@class='orangehrm-tabs-wrapper'])[3]")
	public WebElement emergencyContacts_Button;

	@FindBy(xpath = "//a[text()='Dependents']")
	public WebElement dependent_Button;

	@FindBy(xpath = "(//div[@class='orangehrm-tabs-wrapper'])[5]")
	public WebElement immigration_Button;

	@FindBy(xpath = "(//button[@type='button'])[4]")
	public WebElement assignedImmigrationRecord;

	@FindBy(linkText = "Qualifications")
	public WebElement qualifications_Button;

	@FindBy(xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--text'])[1]")
	public WebElement addButtonOf_Qualifications;

	@FindBy(linkText = "Memberships")
	public WebElement membership_Button;

	@FindBy(xpath = "//h6[text()='Assigned Memberships']")
	public WebElement assignedMemberships_Text;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--text']")
	public WebElement addButton_OfMembership;

	@FindBy(xpath = "//div[@class='orangehrm-edit-employee-image']")
	public WebElement profile_Picture;
	
	@FindBy(className = "orangehrm-edit-employee-content")
	public WebElement contactDetails_Widget;
	
	public void MyInfoModule_Button() {
		MyInfoModule_Button.click();
	}

	public void employee_FirstName(String data) {
		employee_FirstName.sendKeys(data);
	}

	public void employee_LastName(String data) {
		employee_LastName.sendKeys(data);
	}

	public void employeeId(String data) {
		employeeId.sendKeys(data);
	}

	public void nationality() {
		nationality.click();
	}

	public void maritalStatus() {
		maritalStatus.click();
	}

	public void dateOfBirth() {
		dateOfBirth.click();
	}

	public void female_Gender() {
		female_Gender.click();
	}

	public void saveButton_OfPersonalDetails() {
		saveButton_OfPersonalDetails.click();
	}

	public void addButton_OfPersonalDetails() {
		addButton_OfPersonalDetails.click();
	}

	public void contactDetails_Button() {
		contactDetails_Button.click();
	}

	public void emergencyContacts_Button() {
		emergencyContacts_Button.click();
	}

	public void dependent_Button() {
		dependent_Button.click();
	}

	public void immigration_Button() {
		immigration_Button.click();
	}

	public void assignedImmigrationRecord() {
		assignedImmigrationRecord.click();
	}

	public void qualifications_Button() {
		qualifications_Button.click();
	}

	public void addButtonOf_Qualifications() {
		addButtonOf_Qualifications.click();
	}

	public void membership_Button() {
		membership_Button.click();
	}

	public WebElement assignedMemberships_Text() {
		return assignedMemberships_Text;
	}

	public void addButton_OfMembership() {
		addButton_OfMembership.click();
	}

}
