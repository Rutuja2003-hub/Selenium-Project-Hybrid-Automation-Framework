package Functional;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.crm.BaseClass.Claim_BaseClass;
import com.crm.Pom.Claim_Pom_1;
import com.crm.SeleniumUtility.ActionsUtility;
import com.crm.UtilityFile.ReadFromExcel_ForClaim;

public class ClaimPage extends Claim_BaseClass 
{
	@Test
	public void tc_001() 
	{
      Claim_Pom_1 claim=new Claim_Pom_1(driver);
      claim.ClaimModule_Button();
      assertTrue(driver.getCurrentUrl().contains("claim"), "testcase fail");
      Reporter.log("testcase pass", true);      
	}
	@Test
	public void tc_002() throws EncryptedDocumentException, IOException 
	{
      Claim_Pom_1 claim=new Claim_Pom_1(driver);
      claim.ClaimModule_Button();
      assertTrue(driver.getCurrentUrl().contains("claim"), "testcase fail");
      String employeeName = ReadFromExcel_ForClaim.readExcel(1, 0, "Sheet1");
      claim.employee_Name(employeeName);
      Reporter.log("testcase pass", true);      
	}
	@Test
	public void tc_003() throws EncryptedDocumentException, IOException 
	{
      Claim_Pom_1 claim=new Claim_Pom_1(driver);
      claim.ClaimModule_Button();
      assertTrue(driver.getCurrentUrl().contains("claim"), "testcase fail");
      String employeeName = ReadFromExcel_ForClaim.readExcel(1, 0, "Sheet1");
      claim.employee_Name(employeeName);
      boolean noRecords = claim.noRecordsFound.isDisplayed();
      assertTrue(noRecords,"no Records Found is not displayed");
      Reporter.log("testcase pass", true);      
	}
	@Test
	public void tc_004() throws EncryptedDocumentException, IOException
	{
      Claim_Pom_1 claim=new Claim_Pom_1(driver);
      claim.ClaimModule_Button();
      assertTrue(driver.getCurrentUrl().contains("claim"), "testcase fail");
      String employeeName = ReadFromExcel_ForClaim.readExcel(1, 0, "Sheet1");
      claim.employee_Name(employeeName);
      String refId = ReadFromExcel_ForClaim.readExcel(1, 1, "Sheet1");
      claim.reference_Id(refId);
      Reporter.log("testcase pass", true);      
	}
	@Test
	public void tc_005() throws EncryptedDocumentException, IOException
	{
      Claim_Pom_1 claim=new Claim_Pom_1(driver);
      claim.ClaimModule_Button();
      assertTrue(driver.getCurrentUrl().contains("claim"), "testcase fail");
      String employeeName = ReadFromExcel_ForClaim.readExcel(1, 0, "Sheet1");
      claim.employee_Name(employeeName);
      String refId = ReadFromExcel_ForClaim.readExcel(1, 1, "Sheet1");
      claim.reference_Id(refId);
      claim.eventName();
      ActionsUtility act=new ActionsUtility(driver);
      act.selectByArrowDownAndEnter(1);
      Reporter.log("testcase pass", true);      
	}
	@Test
	public void tc_006() 
	{
      Claim_Pom_1 claim=new Claim_Pom_1(driver);
      claim.ClaimModule_Button();
      assertTrue(driver.getCurrentUrl().contains("claim"), "testcase fail");
      claim.eventName();
      Actions act=new Actions(driver);
      act.keyDown(Keys.ARROW_DOWN);
      act.keyDown(Keys.ENTER);
      claim.search_Button();
      Reporter.log("testcase pass", true);      
	}
	@Test
	public void tc_007() 
	{
      Claim_Pom_1 claim=new Claim_Pom_1(driver);
      claim.ClaimModule_Button();
      assertTrue(driver.getCurrentUrl().contains("claim"), "testcase fail");
      claim.status();
      Actions act=new Actions(driver); 
      act.keyDown(Keys.ARROW_DOWN);
      act.keyDown(Keys.ENTER);
      Reporter.log("testcase pass", true);      
	}
	@Test
	public void tc_008() throws InterruptedException 
	{
      Claim_Pom_1 claim=new Claim_Pom_1(driver);
      claim.ClaimModule_Button();
      assertTrue(driver.getCurrentUrl().contains("claim"), "testcase fail");
      WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
      wait.until(ExpectedConditions.elementToBeClickable(claim.fromDate));
      claim.fromDate();
      for(int i=0;i<12;i++)
      {
    	  try {
    		  wait.until(ExpectedConditions.elementToBeClickable(claim.date));
    		  claim.date();
    		  break;
    	  }catch(Exception e)
    	  {
    		  claim.fromDate_NextButton();
    	  }
    	  Thread.sleep(1000);
      }
      Reporter.log("testcase pass", true);
	}
	@Test
	public void tc_009() 
	{
      Claim_Pom_1 claim=new Claim_Pom_1(driver);
      claim.ClaimModule_Button();
      assertTrue(driver.getCurrentUrl().contains("claim"), "testcase fail");
      boolean toDate = claim.toDate.isEnabled();
      assertTrue(toDate,"testcase fail");
      Reporter.log("testcase pass", true);      
	}
	@Test
	public void tc_010() throws EncryptedDocumentException, IOException, InterruptedException
	{
      Claim_Pom_1 claim=new Claim_Pom_1(driver);
      claim.ClaimModule_Button();
      assertTrue(driver.getCurrentUrl().contains("claim"), "testcase fail");
      String employeeName = ReadFromExcel_ForClaim.readExcel(1, 0, "Sheet1");
      claim.employee_Name(employeeName);
      Thread.sleep(1000);
      claim.eventName();
      claim.reset_Button();
      Reporter.log("testcase pass", true);      
	}
    
}
