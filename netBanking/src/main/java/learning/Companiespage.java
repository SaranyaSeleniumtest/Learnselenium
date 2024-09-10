package learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Companiespage {
	
	WebDriver ldriver;
	
	@FindBy(xpath="//a[contains(@href,'contacts')]")
	WebElement lnkcontacts;

	@FindBy(name="first_name")
	WebElement btnfirstnam;
	
	@FindBy(name="last_name")
	WebElement lastnam;
	
	@FindBy(name="last_name")
	WebElement lastnam;
	
	
	@FindBy(name="middle_name")
	WebElement lastnam;
	
	
	
	
	
	
	
	
	//initiate driver

	public Companiespage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);

	}


	//actions

	public void clickhome() {
		
	}
		lnkhome.click();
	


}
