package Functional;


import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.crm.BaseClass.Dashboard_BaseClass;
import com.crm.Pom.DashboardPage_Pom_1;
import com.crm.SeleniumUtility.ActionsUtility;

public class DashboardPage extends Dashboard_BaseClass 
{
	@Test
	public void TC_001() 
	{
		DashboardPage_Pom_1 dash=new DashboardPage_Pom_1(driver);
		//verify timeatwork logo is displayed or not:
		boolean time = dash.timeAtWork_Clock_Logo.isDisplayed();
		assertTrue(time,"timeAtWork logo is not displayed, testcase fail");
		Reporter.log("testcase pass",true);
	}
	@Test
	public void TC_002()
	{
		DashboardPage_Pom_1 dash=new DashboardPage_Pom_1(driver);
	    boolean widget = dash.myAction_Widget.isDisplayed();
		assertTrue(widget,"myActions is not displayed , testcase fail");
		Reporter.log("testcase pass",true);
	}
	@Test
	public void TC_003() throws InterruptedException
	{
		DashboardPage_Pom_1 dash=new DashboardPage_Pom_1(driver);
		dash.timeSheets_Logo(); //clicking on this logo
		//after clicking verifying the url to check we are into correct page 
		assertTrue(driver.getCurrentUrl().contains("viewEmployeeTimesheet"),"timeSheets Logo is not clicked,testcase fail");
		//verify the employee name textfield in timesheets:
		boolean enabled = dash.employee_NameOfTimeSheet1().isEnabled();
		assertTrue(enabled,"employee name textfield is not enabled");
		Reporter.log("testcase pass",true);
		Thread.sleep(2000);		
	}
	@Test
	public void TC_004()
	{
		DashboardPage_Pom_1 dash=new DashboardPage_Pom_1(driver);
		dash.assignLeave_Logo();
		//verification after clicking:
		assertTrue(driver.getCurrentUrl().contains("assignLeave"),"we are not in assignLeave page, testcase fail");
		Reporter.log("testcase pass",true);
	}
	@Test
	public void TC_005()
	{
		DashboardPage_Pom_1 dash=new DashboardPage_Pom_1(driver);
		dash.leaveList_Logo();
		//verifying the page:
		assertTrue(driver.getCurrentUrl().contains("viewLeaveList"),"leaveList button is not clicked, testcase fail");
		//click on LeaveType dropdown:
		dash.leave_Type();
		//select one leave type:
		ActionsUtility act=new ActionsUtility(driver);
		act.selectByArrowDownAndEnter(1);
		Reporter.log("testcase pass",true);
	}
	@Test
	public void TC_006()
	{
		DashboardPage_Pom_1 dash=new DashboardPage_Pom_1(driver);
		dash.applyLeave_Logo();
		//verification after clicking:
		assertTrue(driver.getCurrentUrl().contains("applyLeave"),"applyLeave button is not clicked, testcase fail");
		Reporter.log("testcase pass",true);
	}
	@Test
	public void TC_007()
	{
		DashboardPage_Pom_1 dash=new DashboardPage_Pom_1(driver);
		dash.myLeave_Logo();
		//verification after clicking:
		assertTrue(driver.getCurrentUrl().contains("viewMyLeaveList"),"myLeave button is not clicked, testcase fail");
		Reporter.log("testcase pass",true);
	}
	@Test
	public void TC_008()
	{
		DashboardPage_Pom_1 dash=new DashboardPage_Pom_1(driver);
		dash.myTimesheet_Logo();;
		//verification after clicking:
		assertTrue(driver.getCurrentUrl().contains("viewMyTimesheet"),"myTimeSheet button is not clicked, testcase fail");
		Reporter.log("testcase pass",true);
	}
	@Test
	public void TC_009()
	{
		DashboardPage_Pom_1 dash=new DashboardPage_Pom_1(driver);
		boolean buzz = dash.buzzLatestPosts.isDisplayed();
		assertTrue(buzz,"buzzLatestPosts widgest is not displayed, testcase fail");
		Reporter.log("testcase pass",true);
	}
	@Test
	public void TC_010()
	{
		DashboardPage_Pom_1 dash=new DashboardPage_Pom_1(driver);
		boolean quickLaunch = dash.quickLunch_Text.isDisplayed();
		assertTrue(quickLaunch,"quick Launch text is not displayed,testcase fail");
		fail("I failed it manually");
		
	}
}
