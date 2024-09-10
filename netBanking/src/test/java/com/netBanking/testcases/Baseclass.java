package com.netBanking.testcases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.random.RandomGenerator;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.netBanking.utilities.Readconfig;

public class Baseclass {
	public static RemoteWebDriver driver;
	public Logger logger;  //Log4j
	Readconfig readconfig= new Readconfig();
	logger=LogManager.getLogger(this.getClass());  //lOG4J2

	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		switch (br) {
		case "chrome":
			driver= new ChromeDriver();
			break;
		case "firefox":
			driver= new FirefoxDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
		default:
			break;
		}

		driver.manage().window().maximize();
		System.out.println(readconfig.geturl());
		driver.get(readconfig.geturl());

	}

	public String handlealert() throws Exception {
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		Thread.sleep(3000);
		alert.accept();
		return alertmsg;
	}
	
	public String Generaterandomchars() {
		return RandomStringUtils.randomAlphabetic(7);
	}
	
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
			
		return targetFilePath;

	}
	

	
	@AfterClass
	public void teardown() {
		System.out.println("browserclosed");
		driver.quit();

	}

}
