package Functional;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.crm.BaseClass.Performance_BaseClass;
import com.crm.Pom.Performance_Pom_1;
import com.crm.SeleniumUtility.ActionsUtility;
import com.crm.UtilityFile.ReadFromExcel_ForPerformance;

public class PerformancePage extends Performance_BaseClass 
{
	@Test
	public void tc_001() 
	{
      Performance_Pom_1 per=new Performance_Pom_1(driver);
      per.PerformanceModule_Button();
      assertTrue(driver.getCurrentUrl().contains("performance"),"testcase fail");
      boolean empName = per.employee_Name.isEnabled();
      assertTrue(empName,"testcase fail, textfield is not enabled");
      Reporter.log("testcase pass",true);
	}
	@Test
	public void tc_002() throws EncryptedDocumentException, IOException 
	{
      Performance_Pom_1 per=new Performance_Pom_1(driver);
      per.PerformanceModule_Button();
      assertTrue(driver.getCurrentUrl().contains("performance"),"testcase fail");
      boolean empName = per.employee_Name.isEnabled();
      assertTrue(empName,"testcase fail, textfield is not enabled");
      String employeeName = ReadFromExcel_ForPerformance.readExcel(1, 0,"Sheet1");
      per.employee_Name(employeeName);
      Reporter.log("testcase pass",true);
	}
	@Test
	public void tc_003() throws EncryptedDocumentException, IOException 
	{
      Performance_Pom_1 per=new Performance_Pom_1(driver);
      per.PerformanceModule_Button();
      assertTrue(driver.getCurrentUrl().contains("performance"),"testcase fail");
      per.jobTitle();
      ActionsUtility act=new ActionsUtility(driver);
      act.selectByArrowDownAndEnter(1);
      Reporter.log("testcase pass",true);
	}
	@Test
	public void tc_004() throws EncryptedDocumentException, IOException 
	{
      Performance_Pom_1 per=new Performance_Pom_1(driver);
      per.PerformanceModule_Button();
      assertTrue(driver.getCurrentUrl().contains("performance"),"testcase fail");
      per.subUnit();
      ActionsUtility act=new ActionsUtility(driver);
      act.selectByArrowDownAndEnter(1);
      Reporter.log("testcase pass",true);
	}
	@Test
	public void tc_005() throws EncryptedDocumentException, IOException 
	{
      Performance_Pom_1 per=new Performance_Pom_1(driver);
      per.PerformanceModule_Button();
      assertTrue(driver.getCurrentUrl().contains("performance"),"testcase fail");
      per.include();
      ActionsUtility act=new ActionsUtility(driver);
      act.selectByArrowDownAndEnter(2);
      Reporter.log("testcase pass",true);
	}
	@Test
	public void tc_006() throws EncryptedDocumentException, IOException 
	{
      Performance_Pom_1 per=new Performance_Pom_1(driver);
      per.PerformanceModule_Button();
      assertTrue(driver.getCurrentUrl().contains("performance"),"testcase fail");
      per.reviewStatus();
      ActionsUtility act=new ActionsUtility(driver);
      act.selectByArrowDownAndEnter(1);
      Reporter.log("testcase pass",true);
	}
	@Test
	public void tc_007() throws EncryptedDocumentException, IOException, InterruptedException 
	{
      Performance_Pom_1 per=new Performance_Pom_1(driver);
      per.PerformanceModule_Button();
      WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
      wait.until(ExpectedConditions.elementToBeClickable(per.fromDate));
      per.fromDate();
      for(int i=0;i<12;i++)
      {
    	  try {
    		  wait.until(ExpectedConditions.elementToBeClickable(per.date));
    		  per.date();
    		  break;
    	  }catch(Exception e)
    	  {
    		  per.fromDate_NextButton();
    	  }
    	  Thread.sleep(1000);
      }
      Reporter.log("testcase pass",true);
	}
	@Test
	public void tc_008() throws EncryptedDocumentException, IOException 
	{
      Performance_Pom_1 per=new Performance_Pom_1(driver);
      per.PerformanceModule_Button();
      assertTrue(driver.getCurrentUrl().contains("performance"),"testcase fail");
      per.toDate();
      boolean calendar = per.toDate_CalendarWidget.isDisplayed();
      assertTrue(calendar,"testcase fail");
      Reporter.log("testcase pass", true);
	}
	@Test
	public void tc_009() throws EncryptedDocumentException, IOException 
	{
      Performance_Pom_1 per=new Performance_Pom_1(driver);
      per.PerformanceModule_Button();
      assertTrue(driver.getCurrentUrl().contains("performance"),"testcase fail");
      per.subUnit();
      per.resetButton();
      Reporter.log("testcase pass", true);
	}
	@Test
	public void tc_010() throws EncryptedDocumentException, IOException 
	{
      Performance_Pom_1 per=new Performance_Pom_1(driver);
      per.PerformanceModule_Button();
      assertTrue(driver.getCurrentUrl().contains("performance"),"testcase fail");
      per.subUnit();
      per.searchButton();
      boolean popup = per.noRecordsFound_Popup.isDisplayed();
      assertTrue(popup,"testcase fail");
      Reporter.log("testcase pass", true);
	}
}
