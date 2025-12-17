package Login;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.Login_BaseClass;
import com.crm.Pom.LoginPage_Pom_1;

@Listeners(com.crm.Listeners.Simple.class)
public class LoginPage extends Login_BaseClass {
	@Test
	public void tc_001() {
		LoginPage_Pom_1 login = new LoginPage_Pom_1(driver);
		boolean output = login.username().isEnabled();
		assertTrue(output, "username textfield is disabled and defect is found");
		Reporter.log("testcase pass", true);
	}

	@Test
	public void tc_002() {
		LoginPage_Pom_1 login = new LoginPage_Pom_1(driver);
		boolean output = login.password().isEnabled();
		assertTrue(output, "password textfield is disabled and defect is found");
		Reporter.log("testcase pass", true);
	}

	@Test
	public void tc_003() throws EncryptedDocumentException, IOException, InterruptedException {
		String validUsername = ReadFromExcel_ForLogin.readExcel(0, 0, "Sheet1");
		String validPassword = ReadFromExcel_ForLogin.readExcel(0, 1, "Sheet1");
		LoginPage_Pom_1 login = new LoginPage_Pom_1(driver);
		login.username(validUsername);
		login.password(validPassword);
		login.login_Button();
		Thread.sleep(2000);
		Reporter.log("testcase pass", true);
	}

	@Test
	public void tc_004() throws EncryptedDocumentException, IOException, InterruptedException {
		String WrongUsername = ReadFromExcel_ForLogin.readExcel(1, 0, "Sheet1");
		String WrongPassword = ReadFromExcel_ForLogin.readExcel(1, 1, "Sheet1");
		LoginPage_Pom_1 login = new LoginPage_Pom_1(driver);
		login.username(WrongUsername);
		login.password(WrongPassword);
		login.login_Button();
		Thread.sleep(2000);
		assertTrue(driver.getCurrentUrl().contains("Dashboard"), "Invalid credentials – testcase failed");

	}

	@Test
	public void tc_005() {
		LoginPage_Pom_1 login = new LoginPage_Pom_1(driver);
		boolean output = login.login_Button1().isEnabled();
		assertTrue(output, "login button is disabled and defect is found");
		Reporter.log("testcase pass", true);
	}

	@Test
	public void tc_006() {
		LoginPage_Pom_1 login = new LoginPage_Pom_1(driver);
		boolean output = login.forgotPassword1().isDisplayed();
		assertTrue(output, "forgot password link is disabled and defect is found");
		Reporter.log("testcase pass", true);
	}

}
