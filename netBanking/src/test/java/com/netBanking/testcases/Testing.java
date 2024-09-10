package com.netBanking.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Testing 
{
	static WebDriver driver;
	static WebDriverWait wt;

	//	public  String test() {
	//		
	//		//return Generaterandomchars();
	//	}

	public void moveaction() {
		Actions act= new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//a[contains(@href,'contacts')]"));
		act.moveToElement(ele);
		ele.click();
	}

	public WebElement webdriverwaitclickable(By ele) {
		 wt= new WebDriverWait(driver, Duration.ofSeconds(6000));
		WebElement until = wt.until(ExpectedConditions.elementToBeClickable(ele));
		return until;
	}
	
	public WebElement webdriverwait_visible(WebElement ele) {
		 wt= new WebDriverWait(driver, Duration.ofSeconds(30000));
		 
		WebElement until = wt.until(ExpectedConditions.visibilityOf(ele));
		return until;
	}

	public void setup() throws Exception {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://ui.cogmento.com/");
		driver.findElement(By.name("email")).sendKeys("vprsaran@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Saranya@123");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		
	}
	
	public WebElement verifylogin() {
		return driver.findElement(By.xpath("//b[text()='startupcompany']"));
	}
	public static void main(String[] args) throws Exception {
		Testing obj= new Testing();
		obj.setup();
	
		WebElement webdriverwait_visible = obj.webdriverwait_visible(obj.verifylogin());
		if(webdriverwait_visible.isDisplayed())
		{
			System.out.println("inside assert");
			Assert.assertEquals(true, true);
		}
		 By contacts = By.xpath("//a[contains(@href,'contacts')]");
		//Thread.sleep(5000);
		if(obj.webdriverwaitclickable(contacts).isDisplayed())
				{
			//String test = obj.test();
			//	driver.get("https://ui.cogmento.com/contacts/new/");
			obj.moveaction();
			System.out.println("completed");
				}
		//System.out.println("Mail id is : "+ test+"@gmail.com");
	}

}
