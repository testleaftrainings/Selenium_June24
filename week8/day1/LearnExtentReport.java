package week8.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	
	public static void main(String[] args) throws IOException {
		
		//Step1: Set the report path
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		
		//Step2: Create obj for ExtentReports
		ExtentReports extent = new ExtentReports();
		
		//Step3: Attach the report the path
		extent.attachReporter(reporter);
		//---------------------------------------------------
		//Step4: create report for the testcase
		ExtentTest test = extent.createTest("TC_001_Login", "Login Testcase with valid credentials");
		
		//Step5: add information for the testcase
		test.assignAuthor("Gokul");
		test.assignCategory("Regression");
		//----------------------------------------------------
		//Step6: for each teststep configure a report(status as pass or fail for each step)
		
		test.info("Browser launched successfully");
		test.info("Url loaded successfully");
		test.pass("username entered successfully");
		test.pass("password entered successfully", MediaEntityBuilder.createScreenCaptureFromPath(".././snap/img1.png").build());
		test.pass("Login button clicked successfully");
		test.fail("Unable to click crmsfa link");
		
		
		ExtentTest test2 = extent.createTest("TC_002_Logout");
		test2.pass("Username entered successfully");
		test2.pass("password entered successfully");
		test2.pass("Login button clicked successfully");
		test2.pass("Logout button clicked successfully");
		//----------------------------------------------------
		//step7: close the report
		extent.flush();
		//-------------------------------------------------------
		System.out.println("end report");
	}
	
}
