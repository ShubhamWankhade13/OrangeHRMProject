package com.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pageObjects.LoginPage;
import com.utilities.XLUtils;

public class Tc_LoginTestDDt extends BaseClass {

	@Test(dataProvider="loginData")
	public void loginDDT(String username, String password) {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("user name provided");
		lp.setPassword(password);
		logger.info("user pwd provided");
		lp.clickSubmit();
		
		if(isAlertPresent()==true) {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("login failed");
		}
		else {
			Assert.assertTrue(true);
			logger.warn("login passed");
			lp.clickLogout();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}
	}
	
	public boolean isAlertPresent() {
		
		try {
			driver.switchTo().alert();
			return true;
		}
		catch(NoAlertPresentException e){
			return false;
		}
	}
	
	@DataProvider(name="loginData")
	String[][] getData() throws IOException{
		String path = System.getProperty("user.dir")+"/src/test/java/com/testData/UserCredentials.xlsx";
		
		int rownum= XLUtils.getRowCount(path, "sheet1");
		int colcount= XLUtils.getCellCount(path, "sheet1", 1);
		
		String logindata[][]=  new String[rownum][colcount];
		
		for(int i=1; i<=rownum;i++) {
			for(int j=0; j<colcount;j++) {
				logindata[i-1][j]= XLUtils.getCellData(path, "sheet1", i, j);
			}
		}
		return logindata;
	}
}
