package Functional;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;
import java.io.IOException;
import java.util.List;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.crm.BaseClass.Time_BaseClass;
import com.crm.Pom.TimePage_Pom_1;
import com.crm.UtilityFile.ReadFromExcel_ForTime;

public class TimePage extends Time_BaseClass 
{
	@Test
	public void tc_001() {
		TimePage_Pom_1 time = new TimePage_Pom_1(driver);
		boolean button = time.TimeModule_Button.isDisplayed();
		assertTrue(button, "testcase fail");
		time.TimeModule_Button();
		Reporter.log("testcase pass", true);
	}

	@Test
	public void tc_002() throws EncryptedDocumentException, IOException {
		TimePage_Pom_1 time = new TimePage_Pom_1(driver);
		boolean button = time.TimeModule_Button.isDisplayed();
		assertTrue(button, "testcase fail");
		time.TimeModule_Button();
		assertTrue(driver.getCurrentUrl().contains("viewEmployeeTimesheet"), "testcase fail");
		boolean empName = time.employee_Name.isDisplayed();
		assertTrue(empName, "testcase fail");
		String invalidEmployee = ReadFromExcel_ForTime.readExcel(1, 0, "Sheet1");
		time.employee_Name(invalidEmployee);
		assertTrue(time.noRecordsFound.isDisplayed(), "testcase fail");
		Reporter.log("testcase pass", true);
	}

	@Test
	public void tc_003() throws EncryptedDocumentException, IOException {
		TimePage_Pom_1 time = new TimePage_Pom_1(driver);
		boolean button = time.TimeModule_Button.isDisplayed();
		assertTrue(button, "testcase fail");
		time.TimeModule_Button();
		boolean empName = time.employee_Name.isDisplayed();
		assertTrue(empName, "testcase fail");
		String invalidEmployee = ReadFromExcel_ForTime.readExcel(2, 0, "Sheet1");
		time.employee_Name(invalidEmployee);
		time.view_Button();
		Reporter.log("testcase pass", true);
	}

	@Test
	public void tc_004() {
		TimePage_Pom_1 time = new TimePage_Pom_1(driver);
		boolean button = time.TimeModule_Button.isDisplayed();
		assertTrue(button, "testcase fail");
		time.TimeModule_Button();
		time.view_Button();
		boolean required = time.requiredMessage.isDisplayed();
		assertTrue(required, "testcase fail");
		Reporter.log("testcase pass", true);
	}

	@Test
	public void tc_005() {
		TimePage_Pom_1 time = new TimePage_Pom_1(driver);
		boolean button = time.TimeModule_Button.isDisplayed();
		assertTrue(button, "testcase fail");
		time.TimeModule_Button();
		boolean rows = time.employeeRecordsRows.isDisplayed();
		assertTrue(rows, "testcase fail, no rows are displayed");
		Reporter.log("testcase pass", true);
		fail("i failed it manually");
	}

	@Test
	public void tc_006() {
		TimePage_Pom_1 time = new TimePage_Pom_1(driver);
		boolean button = time.TimeModule_Button.isDisplayed();
		assertTrue(button, "testcase fail");
		time.TimeModule_Button();
		boolean rows = time.employeeRecordsRows.isDisplayed();
		assertTrue(rows, "testcase fail, no rows are displayed");
		time.firstRowOfRecordsFound();
		assertTrue(driver.getCurrentUrl().contains("employeeId"), "testcase fail");
		Reporter.log("testcase pass", true);
	}

	@Test
	public void tc_007() {
		TimePage_Pom_1 time = new TimePage_Pom_1(driver);
		boolean button = time.TimeModule_Button.isDisplayed();
		assertTrue(button, "testcase fail");
		time.TimeModule_Button();
		time.attendance_Button();
		List<WebElement> options = driver.findElements(By.cssSelector("ul.oxd-dropdown-menu li"));
		options.get(2).click();
		Reporter.log("testcase pass", true);
	}

	@Test
	public void tc_008() {
		TimePage_Pom_1 time = new TimePage_Pom_1(driver);
		boolean button = time.TimeModule_Button.isDisplayed();
		assertTrue(button, "testcase fail");
		time.TimeModule_Button();
		time.reports_Button();
		List<WebElement> options = driver.findElements(By.cssSelector("ul.oxd-dropdown-menu li"));
		options.get(1).click();
		assertTrue(driver.getCurrentUrl().contains("displayEmployeeReportCriteria"), "testcase fail");
		Reporter.log("testcase pass", true);
	}

	@Test
	public void tc_009() {
		TimePage_Pom_1 time = new TimePage_Pom_1(driver);
		boolean button = time.TimeModule_Button.isDisplayed();
		assertTrue(button, "testcase fail");
		time.TimeModule_Button();
		boolean button1 = time.projectInfo_Button.isDisplayed();
		assertTrue(button1, "testcase fail");
		time.projectInfo_Button();
		boolean menu = time.projectInfo_Menu.isDisplayed();
		assertTrue(menu, "testcase fail");
		Reporter.log("testcase pass", true);
	}

	@Test
	public void tc_010() {
		TimePage_Pom_1 time = new TimePage_Pom_1(driver);
		boolean button = time.TimeModule_Button.isDisplayed();
		assertTrue(button, "testcase fail");
		time.TimeModule_Button();
		boolean button1 = time.projectInfo_Button.isDisplayed();
		assertTrue(button1, "testcase fail");
		time.projectInfo_Button();
		List<WebElement> options = driver.findElements(By.cssSelector("ul.oxd-dropdown-menu li"));
		options.get(1).click();
		Reporter.log("testcase pass", true);
	}
}
