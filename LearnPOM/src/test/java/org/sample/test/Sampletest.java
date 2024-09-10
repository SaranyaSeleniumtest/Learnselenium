package org.sample.test;

import java.util.NoSuchElementException;

import org.sample.pages.RegisterPage;
import org.sample.pages.Signuppage;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Baseclass;

public class Sampletest extends Baseclass {

	@Test
	public void signuptest() throws Exception {
		Signuppage sp= new Signuppage();
		RegisterPage rp= new RegisterPage();
		try {
			sp.Register();
			sp.enterusername("test");
			sp.enteremail("test@gmail.com");
			sp.clicksignup();
			boolean validateregis = rp.validateregis();
			System.out.println(validateregis);
			Assert.assertEquals(validateregis, true);
			System.out.println("Register to application completed");
		} catch (Exception e) {
			System.out.println("Register to application Failed");
			System.err.println(e.getMessage());
			

		}



	}

}
