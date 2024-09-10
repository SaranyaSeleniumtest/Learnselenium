package com.netBanking.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.netBanking.pageobjects.Loginpage;
import com.netBanking.pageobjects.LoginpageUsingHow;

public class TC001_Login extends Baseclass {
	
	@Test(DataProvider.class=DataProviders,dataProvider="")
	void login(String user,String pass) throws Exception {
		LoginpageUsingHow lp= new LoginpageUsingHow(driver);
		lp.enteruser(user);
		lp.enterpass(pass);
		lp.clicklogin();
		
		String alertmsg = handlealert();
		System.out.println(alertmsg);
		if (alertmsg.equals("User or Password is not valid")) {
			Assert.assertFalse(true);
			System.err.println("Homepage not displayed.");
		}
		
		
	}
	
	//@DataProvider(name="login",indices = {1,2})
	//@DataProvider(name="login")
	String[][] logindata() {
		String[][]data=new String[3][2];
		data[0][0]= "test";
		data[0][1]="pass22";
		data[1][0]="sam";
		data[1][1]="pass88";
		data[2][0]="tom";
		data[2][1]="pass77";
		return data;
		
		
	}

}
