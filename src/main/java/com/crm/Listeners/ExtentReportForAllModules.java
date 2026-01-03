package com.crm.Listeners;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

//This listener does NOT extend any BaseClass
public class ExtentReportForAllModules implements ITestListener 
{
	private static ExtentReports report = null;
	private static ThreadLocal<ExtentTest> testThread = new ThreadLocal<>();

	@Override
	public void onStart(ITestContext context) 
	{
		Reporter.log("OnStart", true);

		// to Initialize report only once
		if (report == null) 
		{
			ExtentSparkReporter spark = new ExtentSparkReporter(".\\src\\test\\resources\\ExtentReports\\HybridReport.html");
			spark.config().setDocumentTitle("OrangeHRM Automation");
			spark.config().setReportName("Hybrid Framework Report");
			spark.config().setTheme(Theme.DARK);
			report = new ExtentReports();
			report.setSystemInfo("Reporter Name", "Rutuja Halande");
			report.setSystemInfo("System Brand", "Dell");
			report.setSystemInfo("OS", "Windows-11");
			report.setSystemInfo("Browser", "Chrome");
			report.attachReporter(spark);
		}
	}

	@Override
	public void onTestStart(ITestResult result) {
		String className = result.getTestClass().getRealClass().getSimpleName();
		String methodName = result.getMethod().getMethodName();

		Reporter.log(className + "-" + methodName + " is OnTestStart", true);

		// Create ExtentTest for this method
		ExtentTest test = report.createTest(className + "-" + methodName);
		testThread.set(test);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String className = result.getTestClass().getRealClass().getSimpleName();
		String methodName = result.getMethod().getMethodName();
		testThread.get().log(Status.PASS, className + "-" + methodName + " is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String className = result.getTestClass().getRealClass().getSimpleName();
		String methodName = result.getMethod().getMethodName();

		Reporter.log(className + "-" + methodName + " is OnTestFailure", true);

		// Get driver from test class instance using getter
		Object currentClass = result.getInstance(); // the test class object

		WebDriver driver = null;

		try {
			// Each module BaseClass must have: public WebDriver getDriver()
			driver = (WebDriver) currentClass.getClass().getMethod("getDriver").invoke(currentClass);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (driver != null) {
			try {
				Thread.sleep(2000);
				TakesScreenshot ts = (TakesScreenshot) driver;
				String screenshotBase64 = ts.getScreenshotAs(OutputType.BASE64);
				testThread.get().addScreenCaptureFromBase64String(screenshotBase64);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		testThread.get().log(Status.FAIL, className + "-" + methodName + " is failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String className = result.getTestClass().getRealClass().getSimpleName();
		String methodName = result.getMethod().getMethodName();
		testThread.get().log(Status.SKIP, className + "-" + methodName + " is skipped");
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("OnFinish", true);
		report.flush();
	}
}
