package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Baseclass{

	WebDriver ldriver;

	@FindBy(xpath="//a[contains(@href,'contacts')]")
	WebElement lnkcontacts;

	@FindBy(xpath="//a[contains(@href,'home')]")
	WebElement lnkhome;
	
	@FindBy(xpath="//b[text()='startupcompany']")
	WebElement elestartup;

	//initiate driver

	public Homepage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);

	}


	//actions

	public void clickhome() {
		lnkhome.click();
		
	}

	public void clickcontacts() {
		//lnkcontacts.click();
		moveaction(lnkcontacts);

	}
	
	public boolean verifylogin() {
		return isdisplayed(elestartup);
	}
	
	

}
