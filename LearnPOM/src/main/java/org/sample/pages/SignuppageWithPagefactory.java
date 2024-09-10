package org.sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.Baseclass;

public class SignuppageWithPagefactory extends Baseclass {
	
	//pagelocators
	
	@FindBy(name="name")WebElement eleuser;
	
	@FindBy(name="email")WebElement eleemail;
	
	@FindBy(xpath="//button[text()='Signup']")
	WebElement eleSignup;
	
	@FindBy(xpath="//a[contains(text(),'Signup')]")
	WebElement eleRegister;
	
	
		//pageactions
		public SignuppageWithPagefactory enterusername(String user) {
			eleuser.sendKeys(user);
			return this;
		}
		
		public SignuppageWithPagefactory enteremail(String email) {
			eleemail.sendKeys(email);
			return this;
		}
		
		public RegisterPage clicksignup() {
			eleSignup.click();
			return new RegisterPage();
		}
		
		public SignuppageWithPagefactory Register() {
			eleRegister.click();
			return this;
			
		}
		
		public RegisterPage signup(String user,String email) {
			eleuser.sendKeys(user);
			eleemail.sendKeys(email);
			eleSignup.click();
			return new RegisterPage();
			
			
		}
	

}
