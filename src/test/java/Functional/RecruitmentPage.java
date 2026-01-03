package Functional;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.crm.BaseClass.Recruitment_BaseClass;
import com.crm.Pom.RecruitmentPage_Pom_1;
import com.crm.SeleniumUtility.ActionsUtility;
import com.crm.UtilityFile.ReadFromExcel_ForRecruitment;

public class RecruitmentPage extends Recruitment_BaseClass 
{
	@Test
	public void tc_001() {
		RecruitmentPage_Pom_1 rec = new RecruitmentPage_Pom_1(driver);
		rec.recruitment_Button();
		boolean button1 = rec.jobTitle.isDisplayed();
		assertTrue(button1, "testcase fail");
		rec.jobTitle();
		Reporter.log("testcase pass", true);
	}

	@Test
	public void tc_002() {
		RecruitmentPage_Pom_1 rec = new RecruitmentPage_Pom_1(driver);
		rec.recruitment_Button();
		boolean button2 = rec.vacancy.isDisplayed();
		assertTrue(button2, "testcase fail");
		rec.vacancy();
		boolean display = rec.noRecordsFound.isDisplayed();
		assertTrue(display, "message not displayed");
		Reporter.log("testcase pass", true);
	}

	@Test
	public void tc_003() {
		RecruitmentPage_Pom_1 rec = new RecruitmentPage_Pom_1(driver);
		rec.recruitment_Button();
		boolean button3 = rec.hiringManager.isDisplayed();
		assertTrue(button3, "testcase fail");
		rec.hiringManager();
		boolean display = rec.noRecordsFound.isDisplayed();
		assertTrue(display, "message not displayed");
		Reporter.log("testcase pass", true);
	}

	@Test
	public void tc_004() {
		RecruitmentPage_Pom_1 rec = new RecruitmentPage_Pom_1(driver);
		rec.recruitment_Button();
		boolean button4 = rec.status.isDisplayed();
		assertTrue(button4, "testcase fail");
		rec.status();
		ActionsUtility act=new ActionsUtility(driver);
	    act.selectByArrowDownAndEnter(2);
		Reporter.log("testcase pass", true);
	}

	@Test
	public void tc_005() {
		RecruitmentPage_Pom_1 rec = new RecruitmentPage_Pom_1(driver);
		rec.recruitment_Button();
		boolean button5 = rec.methodOfApplication.isDisplayed();
		assertTrue(button5, "testcase fail");
		rec.methodOfApplication();
		ActionsUtility act=new ActionsUtility(driver);
	    act.selectByArrowDownAndEnter(1);
		Reporter.log("testcase pass", true);
	}

	@Test
	public void tc_006() throws EncryptedDocumentException, IOException {
		RecruitmentPage_Pom_1 rec = new RecruitmentPage_Pom_1(driver);
		rec.recruitment_Button();
		String candidateName = ReadFromExcel_ForRecruitment.readExcel(1, 0, "Sheet1");
		rec.candidateName(candidateName);
		Reporter.log("testcase pass", true);
	}

	@Test
	public void tc_007() throws EncryptedDocumentException, IOException {
		RecruitmentPage_Pom_1 rec = new RecruitmentPage_Pom_1(driver);
		rec.recruitment_Button();
		String candidateName = ReadFromExcel_ForRecruitment.readExcel(1, 0, "Sheet1");
		rec.candidateName(candidateName);
		boolean message = rec.noRecordsFound.isDisplayed();
		assertTrue(message, "testcase fail");
		Reporter.log("testcase pass", true);
	}

	@Test
	public void tc_008() throws EncryptedDocumentException, IOException, InterruptedException {
		RecruitmentPage_Pom_1 rec = new RecruitmentPage_Pom_1(driver);
		rec.recruitment_Button();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(rec.dateOfApplication_From));
		rec.dateOfApplication_From();
		for (int i = 0; i < 12; i++) {
			try {
				wait.until(ExpectedConditions.elementToBeClickable(rec.date));
				rec.date(); // "12" date click karo
				break; // date milne ke baad break the loop
			} catch (Exception e) {
				rec.dateOfAppFrom_NextButton(); // jb tk date nhi mil jati next month pe click karte raho
			}
			Thread.sleep(1000);
		}
		Reporter.log("testcase pass");
	}

	@Test
	public void tc_009() throws EncryptedDocumentException, IOException {
		RecruitmentPage_Pom_1 rec = new RecruitmentPage_Pom_1(driver);
		rec.recruitment_Button();
		String candidateName = ReadFromExcel_ForRecruitment.readExcel(1, 0, "Sheet1");
		rec.candidateName(candidateName);
		boolean message = rec.noRecordsFound.isDisplayed();
		assertTrue(message, "testcase fail");
		rec.resetButton();
		Reporter.log("testcase pass", true);
	}

	@Test
	public void tc_010() throws EncryptedDocumentException, IOException {
		RecruitmentPage_Pom_1 rec = new RecruitmentPage_Pom_1(driver);
		rec.recruitment_Button();
		rec.resetButton();
		boolean display = rec.recordsFoundText.isDisplayed();
		assertTrue(display, "testcase fail");
		Reporter.log("testcase pass", true);
	}
}
