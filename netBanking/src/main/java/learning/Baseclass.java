package learning;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	public static RemoteWebDriver driver;
	public static WebDriverWait wt;
	public String br="chrome";
	public String url="https://ui.cogmento.com/";


	@BeforeClass
	public void setup() {
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
		wt= new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		driver.get(url);

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


	public void moveaction(WebElement ele) {
		Actions act= new Actions(driver);
		//	WebElement ele = driver.findElement(By.xpath("//a[contains(@href,'contacts')]"));
		act.moveToElement(ele);
		ele.click();
	}

	public WebElement webdriverwaitclickable(By ele) {

		WebElement until = wt.until(ExpectedConditions.elementToBeClickable(ele));
		return until;
	}

	public WebElement webdriverwait_visible(WebElement ele) {

		WebElement until = wt.until(ExpectedConditions.visibilityOf(ele));
		return until;
	}

	public boolean isdisplayed(WebElement ele) {
		try {
			boolean displayed = webdriverwait_visible(ele).isDisplayed();
			System.out.println("WebElement "+ ele + "is displayed");
			return displayed;
		}
		catch(Exception e) {
			e.getMessage();
			//TODO add logger msg and capture screenshot
			System.out.println("Webelemnt "+ ele + "is not displayed");
		}
		return false;

		}


		//@AfterClass
		public void teardown() {
			System.out.println("browserclosed");
			driver.quit();

		}

	}
