package com.netBanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class LoginpageUsingHow  {
	
	
	//locators
	
	WebDriver ldriver;
	@FindBy(how=How.NAME,using="uid")
	WebElement txtuser;
	
	@FindBy(how=How.NAME,using="password")
	WebElement txtpass;
	
	@FindBy(how=How.NAME,using="btnLogin")
	WebElement btnlogin;
	
	
	public LoginpageUsingHow(WebDriver rdriver){
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	//actions
	public void enteruser(String user){
		txtuser.sendKeys(user);
		System.out.println("enter user");
	}
	
	public void enterpass(String pass) {
		txtpass.sendKeys(pass);
		System.out.println("enter pass");
	}
	
	public void clicklogin() {
		btnlogin.click();
		System.out.println("login btn clicked");
	}
	

}
