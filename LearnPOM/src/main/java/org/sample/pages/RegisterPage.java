package org.sample.pages;

import org.openqa.selenium.By;

import base.Baseclass;

public class RegisterPage extends Baseclass {
	
	//pageactions
	public boolean validateregis() {
		return driver.findElement(By.xpath("//b[contains(text(),'Enter Account Information')]")).isDisplayed();
	}
	

}
