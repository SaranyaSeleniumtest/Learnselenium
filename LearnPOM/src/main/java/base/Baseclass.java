package base;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class Baseclass {

	protected static RemoteWebDriver driver;
	
	@BeforeMethod
	public static void setup() {
		driver= new ChromeDriver();
		try {
			driver.get("https://www.automationexercise.com/");
			driver.manage().window().maximize();
			boolean displayed = driver.findElement(By.xpath("//img[@alt='Website for automation practice']")).isDisplayed();
			Assert.assertEquals(displayed, true);
			System.out.println("Launch application Completed");
		} catch (NoSuchElementException e) {

			System.out.println(e.getMessage());
		}		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public void teardown() {
		driver.quit();
	}

}
