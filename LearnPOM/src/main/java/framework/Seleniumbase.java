package framework;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Seleniumbase implements SeleniumAPI {
	 RemoteWebDriver driver= null;

	WebDriverWait wait=null;
	long maxwait=10;
	String url="https://www.automationexercise.com/login";
	



	@Override
	public void setup(String url) {
		driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(url);
		System.out.println(driver.getTitle());
		wait=new WebDriverWait(driver, null);


	}

	@Override
	public void setup(Browsers browser, String url) {

		switch (browser) {
		case CHROME:
			driver= new ChromeDriver();
			break;

		case EDGE:
			driver= new EdgeDriver();
			break;

		case FIREFOX:
			driver= new FirefoxDriver();
			break;


		default:
			System.err.println("Driver not specified correctly");
			break;

		}
		driver.manage().window().maximize();
		driver.get(url);
		System.out.println(driver.getTitle());


	}

	@Override
	public WebElement element(Locators attribute, String value) {
		//8 locators
		switch (attribute) {
		case id:
			return driver.findElement(By.id(value));

		case name:
			return driver.findElement(By.name(value));


		case xpath:
			return driver.findElement(By.xpath(value));


		case linktext:
			return driver.findElement(By.linkText(value));


		case tagname:
			return driver.findElement(By.tagName(value));


		case className:
			return driver.findElement(By.className(value));


		case cssSelector:
			return driver.findElement(By.cssSelector(value));


		default:
			System.err.println("invalid type");
			break;
		}
		return null;

	}

	/**
	 * @Description Method will wait for element to be clickable status and then perform click
	 */
	@Override
	public void click(WebElement ele) {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));
		element.click();

	}




	@Override
	public void type(WebElement ele,String value) {
		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));
		element.clear();
		element.sendKeys(value);
	}




	@Override
	public void selectbyval(WebElement ele, String value) {



	}

	@Override
	public void selectbyindex(WebElement ele, int value) {


	}

	@Override
	public void selectbyvisibletxt(WebElement ele, String visibletxt) {


	}
	
	public void select(String ele,String opt) throws InterruptedException {
		Thread.sleep(3000);
		try {
			WebElement sel = driver.findElement(By.id(ele));
			Select obj1 = new Select(sel);
			
			obj1.selectByValue(opt);
		} catch (NoSuchElementException e) {
			System.err.println("Check the element");
		}
								
		}

}
