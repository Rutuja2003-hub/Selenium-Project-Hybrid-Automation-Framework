package com.crm.Listeners;

import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.crm.BaseClass.Login_BaseClass;
import com.crm.BaseClass.Main_BaseClass;

public class Simple implements ITestListener{

	  public static ExtentSparkReporter spark=null;
	  public static ExtentReports report=null;
	  public static ExtentTest test=null;
	  
	  @Override
		public void onTestStart(ITestResult result) {
			String name = result.getMethod().getMethodName();
			Reporter.log(name+" is OnTestStart", true);
			//create testcase name and attach details:
			test=report.createTest(name);
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			String name = result.getMethod().getMethodName();
			test.log(Status.PASS, name+"is pass");
		}

		@Override
		public void onTestFailure(ITestResult result) {
			String date = LocalDateTime.now().toString().replace(':','-');
			String name = result.getMethod().getMethodName();
			String dynamic = name+date;
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) 
			{
	         e.printStackTrace();
			}
		    Reporter.log(name+" is OnTestFailure", true);
			TakesScreenshot ts=(TakesScreenshot) Login_BaseClass.driver;
			String from = ts.getScreenshotAs(OutputType.BASE64);
			test.addScreenCaptureFromBase64String(from);
			test.log(Status.FAIL, name+"is fail");
		
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			String name = result.getMethod().getMethodName();
			test.log(Status.SKIP, name+"is skipped");
		}

		@Override
		public void onStart(ITestContext context) {
			Reporter.log("OnStart", true);
			// create object of ExtentSparkReport
			spark = new ExtentSparkReporter(".\\src\\test\\resources\\ExtentReports\\LoginPage.html");
			// configure ExtentSparkReport
			spark.config().setDocumentTitle("OrangeHRM");
			spark.config().setReportName("Rutuja");
			spark.config().setTheme(Theme.DARK);
			// create object of ExtentReports
			report = new ExtentReports();
			// set system confiuration for ExtentReport
			report.setSystemInfo("System Brand", "Dell");
			report.setSystemInfo("OS", "windows-11");
			report.setSystemInfo("Browser", "Chrome");
			// attach spark to report
			report.attachReporter(spark);
		}

		@Override
		public void onFinish(ITestContext context) {
			Reporter.log("OnFinish", true);
			report.flush();
		}

	
}
