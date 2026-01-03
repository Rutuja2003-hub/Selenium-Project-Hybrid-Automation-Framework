package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPage_Pom_1 
{
	public PimPage_Pom_1(WebDriver driver)  //constructor
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath= "(//li[@class='oxd-main-menu-item-wrapper'])[2]")
	public WebElement pim_Button;
	
	@FindBy(xpath= "(//input[@placeholder='Type for hints...'])[1]")
	public WebElement employee_Name;
	
	@FindBy(xpath= "(//input[@class='oxd-input oxd-input--active'])[2]")
	public WebElement employee_Id;
	
	@FindBy(xpath= "(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
	public WebElement employment_Status;
	
	@FindBy(xpath= "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
	public WebElement include;
	
	@FindBy(xpath= "(//input[@placeholder='Type for hints...'])[2]")
	public WebElement supervisor_Name;
	
	@FindBy(xpath= "(//div[@class='oxd-select-text oxd-select-text--active'])[3]")
	public WebElement job_Title;
	
	@FindBy(xpath= "(//div[@class='oxd-select-text oxd-select-text--active'])[4]")
	public WebElement sub_Unit;
	
	@FindBy(xpath= "//button[@type='submit']")
	public WebElement search_Button;
	
	@FindBy(xpath= "//button[@type='reset']")
	public WebElement reset_Button;
	
	@FindBy(xpath= "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	public WebElement add_Button;
	
	@FindBy(xpath= "(//input[@type=\"checkbox\"])[1]")
	public WebElement id_Checkbox;
	
	@FindBy(xpath= "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
	public WebElement pencil_Button_OfFirstRow;
	
	@FindBy(xpath= "(//i[@class='oxd-icon bi-trash'])[1]")
	public WebElement delete_Button_OfFirstRow;
	
	@FindBy(xpath= "//a[text()='Add Employee']")
	public WebElement add_Employee;
	
	@FindBy(xpath= "//a[text()='Reports']")
	public WebElement reports;
	
	@FindBy(xpath= "//span[text()='Invalid']")
	public WebElement invalid;
	
	@FindBy(xpath= "//div[@class='orangehrm-modal-footer']/button[2]")
	public WebElement yes_deleteButton;
	

	public void  pim_Button()
	{
		 pim_Button.click();
	}
	public void employee_Name(String data)
	{
		employee_Name.sendKeys(data);
	}
	public void employee_Id(String data)
	{
		employee_Id.sendKeys(data);
	}
	public void  employment_Status()
	{
		employment_Status.click();
	}
	public void  include()
	{
		include.click();
	}
	public void supervisor_Name(String data)
	{
		supervisor_Name.sendKeys(data);
	}
	public void  job_Title()
	{
		job_Title.click();
	}
	public void  sub_Unit()
	{
		sub_Unit.click();
	}
	public void  search_Button()
	{
		search_Button.click();
	}
	public void reset_Button()
	{
		reset_Button.click();
	}
	public void add_Button()
	{
		add_Button.click();
	}
	public void id_Checkbox()
	{
		id_Checkbox.click();
	}
	public void pencil_Button_OfFirstRow()
	{
		pencil_Button_OfFirstRow.click();
	}
	public void delete_Button_OfFirstRow()
	{
		delete_Button_OfFirstRow.click();
	}
	public void add_Employee()
	{
		add_Employee.click();
	}
	public void reports()
	{
		reports.click();
	}
	public void yes_deleteButton()
	{
		yes_deleteButton.click();
	}
	
	
}
