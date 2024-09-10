package org.sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.Baseclass;

public class Signuppage  extends Baseclass {
	

	
	//pagelocators
	
	
	//pageactions
	public void enterusername(String user) {
		driver.findElement(By.name("name")).sendKeys(user);
	}
	
	public void enteremail(String email) {
		driver.findElement(By.name("email")).sendKeys(email);
	}
	
	public void clicksignup() {
		driver.findElement(By.xpath("//button[text()='Signup']")).click();
	}
	
	public void Register() {
		driver.findElement(By.xpath("//a[contains(text(),'Signup')]")).click();
	}
	
	public void signup(String user,String email) {
		driver.findElement(By.name("name")).sendKeys(user);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.xpath("//button[text()='Signup']")).click();
		
		
	}
	
	
	

}
