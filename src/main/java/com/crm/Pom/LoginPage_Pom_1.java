package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Pom_1 
{
	public LoginPage_Pom_1(WebDriver driver) //constructor
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name = "username")
	private WebElement username;   //to achieve the security we uses data hiding by making variables private.
	
	@FindBy(css= "input[type='password']")
	private WebElement password;
	
	@FindBy(xpath= "//button[@type='submit']")
	public WebElement login_button;
	
	@FindBy(xpath= "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	public WebElement forget_password;
	
	@FindBy(linkText = "OrangeHRM, Inc")
	public WebElement orangeHRM_Inc;
	
    @FindBy(xpath= "(//a['@target=_blank'])[1]")
	public WebElement linked_In;
    
    @FindBy(xpath= "(//a['@target=_blank'])[2]")
   	public WebElement facebook;
    
    @FindBy(xpath= "(//a['@target=_blank'])[3]")
   	public WebElement twitter;
    
    @FindBy(xpath= "(//a['@target=_blank'])[4]")
   	public WebElement youtube;
    
	
	public void username(String data) {
		username.sendKeys(data);
	}
	public WebElement username() {
		return username;
	}
	public void password(String data) {
		password.sendKeys(data);
	}
	public WebElement password() {
		return password;
	}
	public void login_Button() {
		login_button.click();
	}
	public WebElement login_Button1() {
		return login_button;
	}
	public void forgotPassword() {
		forget_password.click();
	}
	public WebElement forgotPassword1() {
		return forget_password;
	}
	public void orangeHRM_Inc() {
		orangeHRM_Inc.click();
	}
	public void linkedIn() {
		linked_In.click();
	}
	public void facebook() {
		facebook.click();
	}
	public void twitter() {
		twitter.click();
	}
	public void youtube() {
		youtube.click();
	}
}
