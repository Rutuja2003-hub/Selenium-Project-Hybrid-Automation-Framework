package Functional;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.crm.BaseClass.Leave_BaseClass;
import com.crm.Pom.LeavePage_Pom_1;
import com.crm.SeleniumUtility.ActionsUtility;
import com.crm.UtilityFile.ReadFromExcel_ForLeave;

public class LeavePage extends Leave_BaseClass {
	@Test
	public void TC_001() throws InterruptedException 
	{
      LeavePage_Pom_1 leave=new LeavePage_Pom_1(driver);
      leave.leave_Button();
      Thread.sleep(1000);
      assertTrue(driver.getCurrentUrl().contains("viewLeaveList"),"testcase fail");
      Reporter.log("testcase pass",true);
	}
	@Test
	public void TC_002() throws InterruptedException 
	{
      LeavePage_Pom_1 leave=new LeavePage_Pom_1(driver);
      leave.leave_Button();
      leave.assignLeave_Button();
      leave.leave_Type();
      Thread.sleep(1000);
      ActionsUtility act=new ActionsUtility(driver);
      act.selectByArrowDownAndEnter(1);
      Reporter.log("testcase pass",true);
    }
	@Test
	public void TC_003() 
	{
      LeavePage_Pom_1 leave=new LeavePage_Pom_1(driver);
      leave.leave_Button();
      leave.apply_Button();
      Reporter.log("testcase pass",true);
    }
	@Test
	public void TC_004() throws EncryptedDocumentException, IOException 
	{
      LeavePage_Pom_1 leave=new LeavePage_Pom_1(driver);
      leave.leave_Button();
      String employeeName = ReadFromExcel_ForLeave.readExcel(1, 0,"Sheet1");
      leave.employee_Name(employeeName);
      Reporter.log("testcase pass",true);
    }
	@Test
	public void TC_005()  
	{
      LeavePage_Pom_1 leave=new LeavePage_Pom_1(driver);
      leave.leave_Button();
      leave.date_Checkbox();
      Reporter.log("testcase pass",true);
    }
	@Test
	public void TC_006()  
	{
      LeavePage_Pom_1 leave=new LeavePage_Pom_1(driver);
      leave.leave_Button();
      leave.leave_Type();
      Reporter.log("testcase pass",true);
    }
	@Test
	public void TC_007()  
	{
      LeavePage_Pom_1 leave=new LeavePage_Pom_1(driver);
      leave.leave_Button();
      leave.configure();
      List<WebElement> options = driver.findElements(By.cssSelector("ul.oxd-dropdown-menu li"));
      options.get(2).click();
      assertTrue(driver.getCurrentUrl().contains("defineWorkWeek"),"testcase fail");
      Reporter.log("testcase pass",true);
    }
	@Test
	public void TC_008()  
	{
      LeavePage_Pom_1 leave=new LeavePage_Pom_1(driver);
      leave.leave_Button();
      leave.submit_Button();
      Reporter.log("testcase pass",true);
    }
	@Test
	public void TC_009() throws InterruptedException  
	{
      LeavePage_Pom_1 leave=new LeavePage_Pom_1(driver);
      leave.leave_Button();
      WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
      wait.until(ExpectedConditions.elementToBeClickable(leave.from_Date));
      leave.from_Date(); //opens the fromDate calender
      for(int i=0;i<12;i++)
      {
    	  try{
    		 wait.until(ExpectedConditions.elementToBeClickable(leave.date));
    		 leave.date();;  //"12may" date click karo
    		 break; //date milne ke baad break the loop
    	  }
    	  catch(NoSuchElementException e) {
    		  leave.fromDateCalendar_nextButton(); //jb tk date nhi mil jati next month pe click karte raho
    	  }
    	  Thread.sleep(1000);
      }
      Reporter.log("testcase pass",true);
    }
	@Test
	public void TC_010()  
	{
      LeavePage_Pom_1 leave=new LeavePage_Pom_1(driver);
      leave.leave_Button();
      leave.reports();
      Reporter.log("testcase pass",true);
    }
}
