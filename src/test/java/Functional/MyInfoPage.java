package Functional;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.crm.BaseClass.MyInfo_BaseClass;
import com.crm.Pom.MyInfoPage_Pom_1;

public class MyInfoPage extends MyInfo_BaseClass {
	@Test
	public void tc_001() 
	{
      MyInfoPage_Pom_1 info=new MyInfoPage_Pom_1(driver);
      info.MyInfoModule_Button();
      assertTrue(driver.getCurrentUrl().contains("viewPersonalDetails"),"testcase fail");
      Reporter.log("testcase pass",true);
	}
	@Test
	public void tc_002() 
	{
      MyInfoPage_Pom_1 info=new MyInfoPage_Pom_1(driver);
      info.MyInfoModule_Button();
      assertTrue(driver.getCurrentUrl().contains("viewPersonalDetails"),"testcase fail");
      WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
      wait.until(ExpectedConditions.attributeToBeNotEmpty(info.employee_FirstName, "value"));
      String firstName = info.employee_FirstName.getAttribute("value");
      System.out.println("FisrtName: "+firstName);
      Reporter.log("testcase pass", true);
	}
	@Test
	public void tc_003() 
	{
      MyInfoPage_Pom_1 info=new MyInfoPage_Pom_1(driver);
      info.MyInfoModule_Button();
      assertTrue(driver.getCurrentUrl().contains("viewPersonalDetails"),"testcase fail");
      WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
      wait.until(ExpectedConditions.attributeToBeNotEmpty(info.employee_LastName, "value"));
      String lastName = info.employee_LastName.getAttribute("value");
      System.out.println("LastName: "+lastName);
      Reporter.log("testcase pass", true);
	}
	@Test
	public void tc_004() 
	{
      MyInfoPage_Pom_1 info=new MyInfoPage_Pom_1(driver);
      info.MyInfoModule_Button();
      assertTrue(driver.getCurrentUrl().contains("viewPersonalDetails"),"testcase fail");
      WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
      wait.until(ExpectedConditions.attributeToBeNotEmpty(info.employeeId, "value"));
      String employeeId = info.employeeId.getAttribute("value");
      System.out.println("Employee id: "+employeeId);
      Reporter.log("testcase pass", true);
	}
	@Test
	public void tc_005() 
	{
      MyInfoPage_Pom_1 info=new MyInfoPage_Pom_1(driver);
      info.MyInfoModule_Button();
      assertTrue(driver.getCurrentUrl().contains("viewPersonalDetails"),"testcase fail");
      boolean picture = info.profile_Picture.isDisplayed();
      assertTrue(picture,"testcase fail");
      Reporter.log("testcase pass", true);
	}
	@Test
	public void tc_006() 
	{
      MyInfoPage_Pom_1 info=new MyInfoPage_Pom_1(driver);
      info.MyInfoModule_Button();
      assertTrue(driver.getCurrentUrl().contains("viewPersonalDetails"),"testcase fail");
      info.contactDetails_Button();
      assertTrue(driver.getCurrentUrl().contains("contactDetails"),"testcase fail");
      boolean widget = info.contactDetails_Widget.isDisplayed();
      assertTrue(widget,"testcase fail");
      Reporter.log("testcase pass", true);
	}
	@Test
	public void tc_007() 
	{
      MyInfoPage_Pom_1 info=new MyInfoPage_Pom_1(driver);
      info.MyInfoModule_Button();
      info.emergencyContacts_Button();
      assertTrue(driver.getCurrentUrl().contains("viewEmergencyContacts"), "testcase fail");
      Reporter.log("testcase pass", true);
	}
	@Test
	public void tc_008() 
	{
      MyInfoPage_Pom_1 info=new MyInfoPage_Pom_1(driver);
      info.MyInfoModule_Button();
      info.emergencyContacts_Button();
      assertTrue(driver.getCurrentUrl().contains("viewEmergencyContacts"), "testcase fail");
      Reporter.log("testcase pass", true);
	}
	@Test
	public void tc_009() 
	{
      MyInfoPage_Pom_1 info=new MyInfoPage_Pom_1(driver);
      info.MyInfoModule_Button();
      info.qualifications_Button();
      boolean add = info.addButtonOf_Qualifications.isDisplayed();
      assertTrue(add, "testcase fail");
      info.addButtonOf_Qualifications();
      Reporter.log("testcase pass", true);
	}
	@Test
	public void tc_010() 
	{
      MyInfoPage_Pom_1 info=new MyInfoPage_Pom_1(driver);
      info.MyInfoModule_Button();
      info.membership_Button();;
      boolean add = info.addButton_OfMembership.isDisplayed();
      assertTrue(add, "testcase fail");
      info.addButton_OfMembership();
      Reporter.log("testcase pass", true);
	}
	
}
