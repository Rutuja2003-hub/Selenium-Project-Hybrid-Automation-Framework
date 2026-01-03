package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage_Pom_1 
{
	public RecruitmentPage_Pom_1(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//li[@class='oxd-main-menu-item-wrapper'])[5]")
	public WebElement recruitment_Button;

	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
	public WebElement jobTitle;

	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
	public WebElement vacancy;

	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[3]")
	public WebElement hiringManager;

	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[4]")
	public WebElement status;

	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[5]")
	public WebElement methodOfApplication;

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	public WebElement candidateName;

	@FindBy(xpath = "(//div[@class='oxd-date-input'])[1]")
	public WebElement dateOfApplication_From;

	@FindBy(xpath = "(//div[@class='oxd-date-input'])[2]")
	public WebElement dateOfApplication_To;

	@FindBy(xpath = "//button[@type='reset']")
	public WebElement resetButton;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement searchButton;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	public WebElement addButton;

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	public WebElement vacancy_Checkbox;

	@FindBy(xpath = "(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[1]")
	public WebElement eyeButton_FirstRow;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
	public WebElement deleteButton_FirstRow;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-download'])[1]")
	public WebElement downloadButton_FirstRow;

	@FindBy(xpath = "(//div[@class='oxd-table-row oxd-table-row--with-border'])[3]")
	public WebElement RecordsFounds_2ndRow;

	@FindBy(xpath = "//li[@class='oxd-topbar-body-nav-tab']")
	public WebElement vacanciesButton;
	
	@FindBy(xpath = "//div[text()='No Records Found']")
	public WebElement noRecordsFound;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-chevron-right'])[1]")
	public WebElement dateOfAppFrom_NextButton;
	
	@FindBy(xpath = "//div[contains(@class,'oxd-calendar-date') and text()='12']")
	public WebElement date;
	
	@FindBy(xpath = "(//span[@class='oxd-text oxd-text--span'])[1]")
	public WebElement recordsFoundText;
	
	
	public void recruitment_Button() {
		recruitment_Button.click();
	}

	public void jobTitle() {
		jobTitle.click();
	}

	public void vacancy() {
		vacancy.click();
	}

	public void hiringManager() {
		hiringManager.click();
	}

	public void status() {
		status.click();
	}

	public void candidateName(String data) {
		candidateName.sendKeys(data);
	}

	public void dateOfApplication_From() {
		dateOfApplication_From.click();
	}

	public void dateOfApplication_To() {
		dateOfApplication_To.click();
	}

	public void resetButton() {
		resetButton.click();
	}

	public void searchButton() {
		searchButton.click();
	}

	public void addButton() {
		addButton.click();
	}

	public void vacancy_Checkbox() {
		vacancy_Checkbox.click();
	}

	public void eyeButton_FirstRow() {
		eyeButton_FirstRow.click();
	}

	public void deleteButton_FirstRow() {
		deleteButton_FirstRow.click();
	}

	public void downloadButton_FirstRow() {
		downloadButton_FirstRow.click();
	}

	public void RecordsFounds_2ndRow() {
		RecordsFounds_2ndRow.click();
	}

	public void vacanciesButton() {
		vacanciesButton.click();
	}
	
	public void methodOfApplication() {
		methodOfApplication.click();
	}
	
	public void dateOfAppFrom_NextButton() {
		dateOfAppFrom_NextButton.click();
	}

	public void date() {
		date.click();
	}
	
	
}
