package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver ldriver;
	@FindBy(name="email") WebElement txtemail;
	@FindBy(name="password")  WebElement txtpass;
	@FindBy(xpath="//div[contains(text(),'Login')]")
	WebElement btnlogin;


	public Loginpage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}

	public void enteruser(){
		txtemail.sendKeys("vprsaran@gmail.com");
	}
	
	public void enterpass() {
		txtpass.sendKeys("Saranya@123");
	}
	
	public void clicklogin() {
		btnlogin.click();
	}
	
	public void login() {
		enteruser();
		enterpass();
		clicklogin();
		
	}
	

}
