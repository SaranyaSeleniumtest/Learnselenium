package framework;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testing extends Seleniumbase {
	
	@Test
	public void  login() {
		setup(Browsers.CHROME,url);
		WebElement element = element(Locators.name, "name");
		type(element, "Automation");
		type(element(Locators.name,"email"), "abc.gmail.com");
		click(element(Locators.xpath,"//button[text()='Signup']"));
		
		
	}

}
