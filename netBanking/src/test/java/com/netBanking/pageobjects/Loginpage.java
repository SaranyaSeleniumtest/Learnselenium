package com.netBanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Loginpage  {
	
	
	//locators
	
	WebDriver ldriver;
	@FindBy(name="uid")
	WebElement txtuser;
	
	@FindBy(name="password")
	WebElement txtpass;
	
	@FindBy(name="btnLogin")
	WebElement btnlogin;
	
	
	public Loginpage(WebDriver rdriver){
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	//actions
	public void enteruser(){
		txtuser.sendKeys("test");
		System.out.println("enter user");
	}
	
	public void enterpass() {
		txtpass.sendKeys("testing");
		System.out.println("enter pass");
	}
	
	public void clicklogin() {
		btnlogin.click();
		System.out.println("login btn clicked");
	}
	

}
