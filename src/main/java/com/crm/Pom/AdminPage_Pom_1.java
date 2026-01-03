package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage_Pom_1 
{
		public AdminPage_Pom_1(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "(//li[@class='oxd-main-menu-item-wrapper'])[1]")
		public WebElement admin_Button;

		@FindBy(xpath = "(//input['oxd-input oxd-input--active'])[2]")
		public WebElement username_Textfield;

		@FindBy(xpath = "//div[text()='-- Select --']/..")
		public WebElement user_Role;

		@FindBy(xpath = "//input[@placeholder='Type for hints...']")
		public WebElement employee_Name;

		@FindBy(xpath = "(//div[text()='-- Select --'])[2]")
		public WebElement status;

		@FindBy(xpath = "//button[@type='submit']")
		public WebElement search_Button;

		@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")
		public WebElement reset_Button;

		@FindBy(xpath = "(//button[@type='button'])[6]")
		public WebElement add_Button;

		@FindBy(xpath = "(//span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input'])[1]")
		public WebElement username_Checkbox_1;

		@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
		public WebElement delete_Button_OfFirstRow;

		@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
		public WebElement pencil_Button_OfFirstRow;

		@FindBy(xpath = "(//div[@class='oxd-table-row oxd-table-row--with-border'])[2]")
		public WebElement firstRow_InRecordsFound;

		@FindBy(xpath = "(//span[@class='oxd-topbar-body-nav-tab-item'])[2]")
		public WebElement job_Dropdown;

		@FindBy(xpath = "(//span[@class='oxd-topbar-body-nav-tab-item'])[3]")
		public WebElement organization_Dropdown;

		@FindBy(xpath = "(//span[@class='oxd-topbar-body-nav-tab-item'])[4]")
		public WebElement qualification_Dropdown;

		@FindBy(xpath = "//a[text()='Nationalities']")
		public WebElement nationalities_Button;

		@FindBy(xpath = "//a[text()='Corporate Branding']")
		public WebElement corporateBranding_Button;

		@FindBy(xpath = "(//span[@class='oxd-topbar-body-nav-tab-item'])[5]")
		public WebElement configuration_Dropdown;
		
		@FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
		public WebElement invalidMessage;
		
		@FindBy(xpath = "//div[@class='oxd-toast oxd-toast--error oxd-toast-container--toast']")
		public WebElement cannotBeDeleted_Message;
		
		@FindBy(xpath = "//h6[text()='Nationalities']")
		public WebElement nationalities_Page;
		
		public void admin_Button() {
			admin_Button.click();
		}

		public void username_Textfield(String data) {
			username_Textfield.sendKeys(data);
		}

		public void user_Role() {
			user_Role.click();
		}

		public void employee_Name(String data) {
			employee_Name.sendKeys(data);
		}

		public void status() {
			status.click();
		}

		public void search_Button() {
			search_Button.click();
		}

		public void reset_Button() {
			reset_Button.click();
		}

		public void add_Button() {
			add_Button.click();
		}

		public void username_Checkbox_1() {
			username_Checkbox_1.click();
		}

		public void delete_Button_OfFirstRow() {
			delete_Button_OfFirstRow.click();
		}

		public void pencil_Button_OfFirstRow() {
			pencil_Button_OfFirstRow.click();
		}

		public void firstRow_InRecordsFound() {
			firstRow_InRecordsFound.click();
		}

		public void job_Dropdown() {
			job_Dropdown.click();
		}

		public void organization_Dropdown() {
			organization_Dropdown.click();
		}

		public void qualification_Dropdown() {
			qualification_Dropdown.click();
		}

		public void configuration_Dropdown() {
			configuration_Dropdown.click();
		}

		public void nationalities_Button() {
			nationalities_Button.click();
		}

		public void corporateBranding_Button() {
			corporateBranding_Button.click();
		}
		
		

}


