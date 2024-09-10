package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AutomationReport {
	
	public static void main(String[] args) {
		//blank html or template
		ExtentSparkReporter report= new ExtentSparkReporter("./Testreport.html");
		
		//actual report
		ExtentReports  extent = new ExtentReports();
		
		//attach actual report to template
		extent.attachReporter(report);
		
		
		ExtentTest test = extent.createTest("TC001-login");
		test.pass("Enter url");
		test.pass("username");
		test.pass("enterpassword");
		test.fail("click login");
		test.pass("Homepage displayed");
		
		ExtentTest test2 = extent.createTest("TC002-searchpdt", "Verify search pdt functionality");
		
		test2.pass("login app");
		test2.pass("enter search");
		
		//capture screenshot with MediaEntity Builder
		test2.fail("search pdt is displayed",MediaEntityBuilder.
				createScreenCaptureFromPath("failcase.png").
				build());
		
		//last  code to save the report
		extent.flush();
		
	}

}
