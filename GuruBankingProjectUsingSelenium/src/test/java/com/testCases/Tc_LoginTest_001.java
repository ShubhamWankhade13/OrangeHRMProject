package com.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageObjects.LoginPage;

public class Tc_LoginTest_001 extends BaseClass{

	@Test
	public void loginTest() {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		lp.setPassword(password);
		logger.info("Entered password");
		lp.clickSubmit();
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("GTPL Bank Manager HomePage"))
		{
			AssertJUnit.assertTrue(true);
			logger.info("login test pass");
		}
		else {
			AssertJUnit.assertTrue(false);
		}
	}
}
