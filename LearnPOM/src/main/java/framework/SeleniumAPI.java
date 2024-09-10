package framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public interface SeleniumAPI {

	
	/*
	 * setup-chrome setup allbrowsers type- clear and sendkeys click- click any
	 * button selectbyval selectbyindex selectbyvisibletxt switchtoframe
	 * switchtowindows
	 */
	
	
	/**
	 *@Description Method is used to setup chrombrowser 
	 * and launch the specified url
	 * @param url
	 */
	void setup(String url);
	
	
	/**
	 * @author Saranya
	 * @Description Method is used to setup browser based on the parameter 
	 * and launch the specified url
	 * @param browser
	 * @param url
	 */
	void setup(Browsers browser,String url);
	
	
	/**
	 * @Description Method is used to find and return webelement based on attribute and value passed
	 * @param attribute
	 * @param value
	 */
	WebElement element(Locators attribute,String value);
	
	
	
	/**
	 * @Description Method is used to perform click on webelement passed
	 * @param ele
	 */
	void click(WebElement ele);
	
	
	
	/**
	 * @Description Method is used to clear the existing value and 
	 * enter the value based on parameter
	 * @param ele
	 * @param value
	 */
	void type(WebElement ele,String value);
	
	
	
	
	
	
	
	
	/**
	 * @Description Method is used to perform select operation on list object by value
	 * @param ele
	 * @param value
	 */
	void selectbyval(WebElement ele, String value);
	
	
	/**
	 * @Description Method is used to perform select operation on list object by index
	 * @param ele
	 * @param value
	 */
	void selectbyindex(WebElement ele, int value);
	
	
	
	/**
	 * @Description Method is used to perform select operation on list object by visible text
	 * @param ele
	 * @param visibletxt
	 */
	void selectbyvisibletxt(WebElement ele, String visibletxt);
	
	
	

}
