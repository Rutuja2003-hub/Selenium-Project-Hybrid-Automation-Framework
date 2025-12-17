package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage_Pom_1 
{
	public LeavePage_Pom_1(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "(//li[@class='oxd-main-menu-item-wrapper'])[3]")
	public WebElement leave_Button;
	
	@FindBy(xpath= "(//input[@placeholder='yyyy-dd-mm'])[1]")
	public WebElement from_Date;
	
	@FindBy(xpath= "(//input[@placeholder='yyyy-dd-mm'])[2]")
	public WebElement to_Date;
	
	@FindBy(xpath= "(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
	public WebElement showLeave_WithStatus;
	
	@FindBy(xpath= "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
	public WebElement leave_Type;
	

	@FindBy(xpath= "//input[@placeholder='Type for hints...']")
	public WebElement employee_Name;
	
	@FindBy(xpath= "(//div[@class='oxd-select-text oxd-select-text--active'])[3]")
	public WebElement sub_Unit;
	
	@FindBy(xpath= "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	public WebElement include_PastEmployees;
	
	@FindBy(xpath= "//button[@type='submit']")
	public WebElement submit_Button;
	
	@FindBy(xpath= "//button[@type='reset']")
	public WebElement reset_Button;
	
	@FindBy(xpath= "(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[1]")
	public WebElement date_Checkbox;
	
	@FindBy(xpath= "(//button[@class='oxd-button oxd-button--medium oxd-button--label-success oxd-table-cell-action-space'])[1]")
	public WebElement approve_Button_OfFirstRecord;
	
	@FindBy(xpath= "(//button[@class='oxd-button oxd-button--medium oxd-button--label-danger oxd-table-cell-action-space'])[1]")
	public WebElement reject_Button_OfFirstRecord;
	
	@FindBy(xpath= "//a[text()='Apply']")
	public WebElement apply_Button;
	
	@FindBy(xpath= "//a[text()='My Leave']")
	public WebElement myLeave_Button;
	
	@FindBy(xpath= "//li[@class='--active oxd-topbar-body-nav-tab --parent']")
	public WebElement entitlements;
	
	@FindBy(xpath= "(//span[@class='oxd-topbar-body-nav-tab-item'])[2]")
	public WebElement reports;
	
	@FindBy(xpath= "(//span[@class='oxd-topbar-body-nav-tab-item'])[3]")
	public WebElement configure;
	
	@FindBy(xpath= "//a[text()='Assign Leave']")
	public WebElement assignLeave_Button;
	//a[text()='Assign Leave']
	
	
	public void leave_Button()
	{
        leave_Button.click();
	}
	public void from_Date()
	{
		from_Date.click();
	}
	public void to_Date()
	{
		to_Date.click();
	}
	public void showLeave_WithStatus()
	{
		showLeave_WithStatus.click();
	}
	public void leave_Type()
	{
		leave_Type.click();
	}
	public void employee_Name(String data)
	{
		employee_Name.sendKeys(data);
	}
	public void sub_Unit()
	{
		sub_Unit.click();
	}
	public void include_PastEmployees()
	{
		include_PastEmployees.click();
	}
	public void submit_Button()
	{
		submit_Button.click();
	}
	public void reset_Button()
	{
		reset_Button.click();
	}
	public void date_Checkbox()
	{
		date_Checkbox.click();
	}
	public void approve_Button_OfFirstRecord()
	{
		approve_Button_OfFirstRecord.click();
	}
	public void reject_Button_OfFirstRecord()
	{
		reject_Button_OfFirstRecord.click();
	}
	public void apply_Button()
	{
		apply_Button.click();
	}
	public void myLeave_Button()
	{
		myLeave_Button.click();
	}
	public void entitlements()
	{
		entitlements.click();
	}
	public void reports()
	{
		reports.click();
	}
	public void	configure()
	{
		configure.click();
	}
	public void	assignLeave_Button()
	{
		assignLeave_Button.click();
	}

}
