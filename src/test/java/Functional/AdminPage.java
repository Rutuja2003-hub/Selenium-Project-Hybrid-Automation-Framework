package Functional;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.crm.BaseClass.Admin_BaseClass;
import com.crm.Pom.AdminPage_Pom_1;
import com.crm.SeleniumUtility.ActionsUtility;
import com.crm.UtilityFile.ReadFromExcel_ForAdmin;

public class AdminPage extends Admin_BaseClass 
{
	@Test
	public void TC_001() {
		AdminPage_Pom_1 admin = new AdminPage_Pom_1(driver);
		// click on admin button in dashboard page:
		admin.admin_Button();
		// verify that we are in the correct page:
		assertTrue(driver.getCurrentUrl().contains("viewSystemUsers"), "we are in wrong page,testcase fail");
		// keep all fields blank and click on search button:
		admin.search_Button();
		Reporter.log("testcase pass",true);
	}

	@Test
	public void TC_002() throws EncryptedDocumentException, IOException {
		AdminPage_Pom_1 admin = new AdminPage_Pom_1(driver);
		// click on admin button in dashboard page:
		admin.admin_Button();
		// verify that we are in the correct page:
		assertTrue(driver.getCurrentUrl().contains("viewSystemUsers"), "we are in wrong page,testcase fail");
		String username=ReadFromExcel_ForAdmin.readExcel(1, 0,"Sheet1");
		//enter username:
		admin.username_Textfield(username);
		//select any user role:
		admin.user_Role();
		ActionsUtility act=new ActionsUtility(driver); //here i used ACtionsUtility class
		act.selectByArrowDownAndEnter(1); 
		//click on reset button:
		admin.reset_Button();
		Reporter.log("testcase pass",true);
	}
	
	@Test
	public void TC_003() 
	{
		AdminPage_Pom_1 admin = new AdminPage_Pom_1(driver);
		// click on admin button in dashboard page:
		admin.admin_Button();
		// verify that we are in the correct page:
		assertTrue(driver.getCurrentUrl().contains("viewSystemUsers"), "we are in wrong page,testcase fail");
		//click user Role dropdown:
		admin.user_Role();
		//verifying the user role dropdown:
		boolean userRole = admin.user_Role.isEnabled();
		assertTrue(userRole,"not selected,testcase fail");
		Reporter.log("testcase pass",true);
    }
	
	@Test
	public void TC_004() 
	{
		AdminPage_Pom_1 admin = new AdminPage_Pom_1(driver);
		// click on admin button in dashboard page:
		admin.admin_Button();
		// verify that we are in the correct page:
		assertTrue(driver.getCurrentUrl().contains("viewSystemUsers"), "we are in wrong page,testcase fail");
		//verify status dropdown:
		boolean status = admin.status.isEnabled();
		assertTrue(status,"not enabled, testcase fail");
		//click on status dropdown:
		admin.status();
		Reporter.log("testcase pass",true);
	}
	
	@Test
	public void TC_005() 
	{
		AdminPage_Pom_1 admin = new AdminPage_Pom_1(driver);
		// click on admin button in dashboard page:
		admin.admin_Button();
		// verify that we are in the correct page:
		assertTrue(driver.getCurrentUrl().contains("viewSystemUsers"), "we are in wrong page,testcase fail");
		//click on add button:
		admin.add_Button();
		assertTrue(driver.getCurrentUrl().contains("saveSystemUser"),"not in correct page,testcase fail");
		Reporter.log("testcase pass",true);
		
	}
	
	@Test
	public void TC_006() throws EncryptedDocumentException, IOException 
	{
		AdminPage_Pom_1 admin = new AdminPage_Pom_1(driver);
		// click on admin button in dashboard page:
		admin.admin_Button();
		// verify that we are in the correct page:
		assertTrue(driver.getCurrentUrl().contains("viewSystemUsers"), "we are in wrong page,testcase fail");
		//provide employee name:
		String employeeName=ReadFromExcel_ForAdmin.readExcel(1, 1,"Sheet1");
		admin.employee_Name(employeeName);
		//click on search:
		admin.search_Button();
		//verifying the employee name invalid name should be displayed:
		boolean invalid = admin.invalidMessage.isDisplayed();
		System.out.println(invalid);
		assertTrue(invalid,"message not displayed,testcase fail");
		Reporter.log("invalid message is displayed,testcase pass",true);
	}
	
	@Test
	public void TC_007() throws EncryptedDocumentException, IOException 
	{
		AdminPage_Pom_1 admin = new AdminPage_Pom_1(driver);
		// click on admin button in dashboard page:
		admin.admin_Button();
		// verify that we are in the correct page:
		assertTrue(driver.getCurrentUrl().contains("viewSystemUsers"), "we are in wrong page,testcase fail");
		//click pencil button:
		admin.pencil_Button_OfFirstRow();
		Reporter.log("testcase pass",true);
	}
	
	@Test
	public void TC_008() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		AdminPage_Pom_1 admin = new AdminPage_Pom_1(driver);
		// click on admin button in dashboard page:
		admin.admin_Button();
		// verify that we are in the correct page:
		assertTrue(driver.getCurrentUrl().contains("viewSystemUsers"), "we are in wrong page,testcase fail");
		//click delete icon:
		admin.delete_Button_OfFirstRow();
		Reporter.log("testcase pass",true);
	}
	
	@Test
	public void TC_009() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		AdminPage_Pom_1 admin = new AdminPage_Pom_1(driver);
		// click on admin button in dashboard page:
		admin.admin_Button();
		// verify that we are in the correct page:
		assertTrue(driver.getCurrentUrl().contains("viewSystemUsers"), "we are in wrong page,testcase fail");
		//click username checkbox:
		admin.username_Checkbox_1();
		fail("I failed it manually");
	}
	
	@Test
	public void TC_010() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		AdminPage_Pom_1 admin = new AdminPage_Pom_1(driver);
		// click on admin button in dashboard page:
		admin.admin_Button();
		// verify that we are in the correct page:
		assertTrue(driver.getCurrentUrl().contains("viewSystemUsers"), "we are in wrong page,testcase fail");
		//click on nationalities button:
		admin.nationalities_Button();
		Reporter.log("testcase pass", true);	
	}
}
