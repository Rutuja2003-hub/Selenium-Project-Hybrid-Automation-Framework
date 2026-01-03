package Functional;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.crm.BaseClass.Login_BaseClass;
import com.crm.Pom.LoginPage_Pom_1;
import com.crm.UtilityFile.ReadFromExcel_ForLogin;

public class LoginPage extends Login_BaseClass 
{
	@Test
	public void tc_001() {
		LoginPage_Pom_1 login = new LoginPage_Pom_1(driver);
		//verification of username textfield:
		boolean output = login.username().isEnabled();
		assertTrue(output, "username textfield is disabled and defect is found");
		Reporter.log("testcase pass", true);

	}

	@Test
	public void tc_002() {
		LoginPage_Pom_1 login = new LoginPage_Pom_1(driver);
		//verification of password textfield:
		boolean output = login.password().isEnabled();
		assertTrue(output, "password textfield is disabled and defect is found");
		Reporter.log("testcase pass", true);
	}

	@Test
	public void tc_003() {
		LoginPage_Pom_1 login = new LoginPage_Pom_1(driver);
		//verification of Login button:
		boolean output = login.login_Button1().isEnabled();
		assertTrue(output, "login button is disabled and defect is found");
		Reporter.log("testcase pass", true);

	}

	@Test
	public void tc_004() {
		LoginPage_Pom_1 login = new LoginPage_Pom_1(driver);
		//verification of forgotPassword link:
		boolean output = login.forgotPassword1().isEnabled();
		assertTrue(output, "forget password link is disabled and defect is found");
		Reporter.log("testcase pass", true);

	}
	@Test
	public void tc_005() 
	{
		LoginPage_Pom_1 login = new LoginPage_Pom_1(driver);
		boolean logo = login.orangeHRM_Inc.isDisplayed();
		assertTrue(logo,"not displayed,testcase fail");
		Reporter.log("testcase pass",true);
	}
	

	@Test
	public void tc_006() throws EncryptedDocumentException, IOException, InterruptedException {
		//reading the data from excel file:(valid data):
		String validUsername = ReadFromExcel_ForLogin.readExcel(0, 0, "Sheet1");
		String validPassword = ReadFromExcel_ForLogin.readExcel(0, 1, "Sheet1");
		LoginPage_Pom_1 login = new LoginPage_Pom_1(driver);
		login.username(validUsername);
		login.password(validPassword);
		//click on login button:
		login.login_Button();
		Thread.sleep(2000);
		Reporter.log("testcase pass", true);
	}

	@Test(priority = 7)
	public void tc_007() throws EncryptedDocumentException, IOException, InterruptedException {
		LoginPage_Pom_1 login = new LoginPage_Pom_1(driver);
		//reading the data from excel file:(invalid data):
		String wrongUser = ReadFromExcel_ForLogin.readExcel(1, 0, "Sheet1");
		String wrongPass = ReadFromExcel_ForLogin.readExcel(1, 1, "Sheet1");
		login.username(wrongUser);
		login.password(wrongPass);
		login.login_Button();
		Thread.sleep(3000);
		assertTrue(driver.getCurrentUrl().contains("Dashboard"), "testcase fail because of invalid data");

	}
	@Test
	public void tc_008() throws EncryptedDocumentException, IOException, InterruptedException {
		LoginPage_Pom_1 login = new LoginPage_Pom_1(driver);
		//reading the data from excel file:(invalid data):
		String wrongUser = ReadFromExcel_ForLogin.readExcel(2, 0, "Sheet1");
		String wrongPass = ReadFromExcel_ForLogin.readExcel(2, 1, "Sheet1");
		login.username(wrongUser);
		login.password(wrongPass);
		login.login_Button();
		Thread.sleep(3000);
		assertTrue(driver.getCurrentUrl().contains("Dashboard"),"testcase fail because of invalid data");
	}
	@Test
	public void tc_009() throws EncryptedDocumentException, IOException, InterruptedException {
		LoginPage_Pom_1 login = new LoginPage_Pom_1(driver);
		//reading the data from excel file:(invalid data):
		String wrongUser = ReadFromExcel_ForLogin.readExcel(3, 0, "Sheet1");
		String wrongPass = ReadFromExcel_ForLogin.readExcel(3, 1, "Sheet1");
		login.username(wrongUser);
		login.password(wrongPass);
		login.login_Button();
		Thread.sleep(3000);
		assertTrue(driver.getCurrentUrl().contains("Dashboard"),"testcase fail because of invalid data");
	}
	@Test
	public void tc_010() throws EncryptedDocumentException, IOException, InterruptedException {
		LoginPage_Pom_1 login = new LoginPage_Pom_1(driver);
		//reading the data from excel file:(invalid data):
		String wrongUser = ReadFromExcel_ForLogin.readExcel(4, 0, "Sheet1");
		String wrongPass = ReadFromExcel_ForLogin.readExcel(4, 1, "Sheet1");
		login.username(wrongUser);
		login.password(wrongPass);
		login.login_Button();
		Thread.sleep(3000);
		assertTrue(driver.getCurrentUrl().contains("Dashboard"),"testcase fail because of invalid data");
	}



}
