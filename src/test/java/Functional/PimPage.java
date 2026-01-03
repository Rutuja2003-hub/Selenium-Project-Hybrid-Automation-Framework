package Functional;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.crm.BaseClass.Pim_BaseClass;
import com.crm.Pom.PimPage_Pom_1;
import com.crm.SeleniumUtility.ActionsUtility;
import com.crm.UtilityFile.ReadFromExcel_ForPim;

public class PimPage extends Pim_BaseClass {
	@Test
	public void TC_001() {
		PimPage_Pom_1 pim = new PimPage_Pom_1(driver);
		// click on pim module:
		pim.pim_Button();
		// get url of the page:
		assertTrue(driver.getCurrentUrl().contains("viewEmployeeList"), "testcase fail");
		Reporter.log("testcase pass", true);
	}

	@Test
	public void TC_002() throws EncryptedDocumentException, IOException, InterruptedException {
		PimPage_Pom_1 pim = new PimPage_Pom_1(driver);
		pim.pim_Button();
		// pass the data from excel file:
		String employeeName = ReadFromExcel_ForPim.readExcel(1, 0, "Sheet1");
		pim.employee_Name(employeeName);
		Thread.sleep(1000);
		// click on reset button:
		pim.reset_Button();
		Reporter.log("testcase pass", true);
	}

	@Test
	public void TC_003() throws EncryptedDocumentException, IOException, InterruptedException {
		PimPage_Pom_1 pim = new PimPage_Pom_1(driver);
		pim.pim_Button();
		// pass the data from excel file:
		String employeeName = ReadFromExcel_ForPim.readExcel(1, 0, "Sheet1");
		pim.employee_Name(employeeName);
		Thread.sleep(1000);
		String employeeId = ReadFromExcel_ForPim.readExcel(1, 1, "Sheet1");
		pim.employee_Id(employeeId);
		// click on search button:
		pim.search_Button();
		Reporter.log("testcase pass", true);
	}

	@Test
	public void TC_004() {
		PimPage_Pom_1 pim = new PimPage_Pom_1(driver);
		pim.pim_Button();
		boolean status = pim.employment_Status.isDisplayed();
		assertTrue(status, "testcase fail");
		pim.employment_Status();
	    ActionsUtility act=new ActionsUtility(driver);
	    act.selectByArrowDownAndEnter(1);
		Reporter.log("testcase pass", true);
	}

	@Test
	public void TC_005() {
		PimPage_Pom_1 pim = new PimPage_Pom_1(driver);
		pim.pim_Button();
		boolean status = pim.include.isDisplayed();
		assertTrue(status, "testcase fail");
		pim.include();
		ActionsUtility act=new ActionsUtility(driver);
	    act.selectByArrowDownAndEnter(1);
		Reporter.log("testcase pass", true);
	}

	@Test
	public void TC_006() throws EncryptedDocumentException, IOException {
		PimPage_Pom_1 pim = new PimPage_Pom_1(driver);
		pim.pim_Button();
		boolean supervisor = pim.supervisor_Name.isDisplayed();
		assertTrue(supervisor, "testcase fail");
		String supervisorName = ReadFromExcel_ForPim.readExcel(1, 2, "Sheet1");
		pim.supervisor_Name(supervisorName);
		pim.search_Button();
		boolean errorMessage = pim.invalid.isDisplayed();
		assertTrue(errorMessage, "error message not displayed, testcase fail");
		Reporter.log("testcase pass", true);
	}

	@Test
	public void TC_007() throws EncryptedDocumentException, IOException, InterruptedException {
		PimPage_Pom_1 pim = new PimPage_Pom_1(driver);
		pim.pim_Button();
		boolean jobTitle = pim.job_Title.isDisplayed();
		assertTrue(jobTitle, "not displayed, testcase fail");
		pim.job_Title();
		ActionsUtility act=new ActionsUtility(driver);
	    act.selectByArrowDownAndEnter(1);
		Reporter.log("testcase pass", true);
	}

	@Test
	public void TC_008() throws EncryptedDocumentException, IOException, InterruptedException {
		PimPage_Pom_1 pim = new PimPage_Pom_1(driver);
		pim.pim_Button();
		pim.pencil_Button_OfFirstRow();
		assertTrue(driver.getCurrentUrl().contains("viewPersonalDetails"), "testcase fail");
		Reporter.log("testcase pass", true);
	}

	@Test
	public void TC_009() throws EncryptedDocumentException, IOException, InterruptedException {
		PimPage_Pom_1 pim = new PimPage_Pom_1(driver);
		pim.pim_Button();
		pim.delete_Button_OfFirstRow();
		pim.yes_deleteButton();
		Reporter.log("testcase pass", true);
	}

	@Test
	public void TC_010() throws EncryptedDocumentException, IOException, InterruptedException {
		PimPage_Pom_1 pim = new PimPage_Pom_1(driver);
		pim.pim_Button();
		pim.reports();
		assertTrue(driver.getCurrentUrl().contains("viewDefinedPredefinedReports"), "testcase fail");
		Reporter.log("testcase pass", true);
		fail("I failed it manually");
	}

}
