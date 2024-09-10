package learning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testclass extends Baseclass {

	@Test
	public void login() throws Exception {
		//TODO: add webdrivver wait code
		Loginpage lp= new Loginpage(driver);
		lp.login();

		Homepage hp= new Homepage(driver);
	//	Assert.assertTrue(hp.elestartup.isDisplayed(), "Home page is displayed");
		Assert.assertTrue(hp.verifylogin());
		System.out.println("LoginPassed");

		hp.clickcontacts();

	}

}
