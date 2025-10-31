package com.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.pageObjects.AddCustomerPage;
import com.pageObjects.LoginPage;

public class Tc_AddCustomerTest_002 extends BaseClass{

	@Test
	public void addNewCustomer() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("providing username");
		lp.setPassword(password);
		logger.info("providing password");
		lp.clickSubmit();
		
		
		AddCustomerPage addcust = new AddCustomerPage(driver);
		addcust.clickAddNewCustomer();
		logger.info("providing customer details");
		addcust.custName("john");
		addcust.custGender();
		addcust.custDob("10", "24", "2024");
		Thread.sleep(1000);
		addcust.custAddress("nagar");
		addcust.custCity("goa");
		addcust.custState("Maharastra");
		addcust.custPinno("37464738");
		addcust.custTelephoneno("1233455");
		
		String email =randomstring()+"@gmail.com";
		addcust.custEmailid(email);
		addcust.custSubmit();
		logger.info("customer creted");
				
	}
	
	public String randomstring() {
		String generatestring =RandomStringUtils.randomAlphabetic(5);
		return(generatestring);
	}
	
}
