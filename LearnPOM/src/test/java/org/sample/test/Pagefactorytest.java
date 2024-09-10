package org.sample.test;

import org.sample.pages.SignuppageWithPagefactory;
import org.testng.annotations.Test;

import base.Baseclass;

public class Pagefactorytest extends Baseclass {
	
	@Test
	public void Logintest() {
		SignuppageWithPagefactory sign= new SignuppageWithPagefactory();
		sign.enterusername("Testing");
		
	}

}
