package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver driver;
	
	public AddCustomerPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[normalize-space()='New Customer']")
	WebElement newCustomer;

	@FindBy(xpath="//input[@name='name']") 
	WebElement name;
	
	@FindBy(xpath="//tbody/tr[5]/td[2]/input[1]") 
	WebElement radgender;
	
	@FindBy(xpath="//input[@id='dob']") 
	WebElement dob;
	
	@FindBy(xpath="//textarea[@name='addr']") 
	WebElement addr;
	
	@FindBy(xpath="//input[@name='city']") 
	WebElement city;
	
	@FindBy(xpath="//input[@name='state']") 
	WebElement state;
	
	@FindBy(xpath="//input[@name='pinno']") 
	WebElement pinno;
	
	@FindBy(xpath="//input[@name='telephoneno']") 
	WebElement telephoneno;
	
	@FindBy(xpath="//input[@name='emailid']") 
	WebElement emailid;
	
	@FindBy(xpath="//input[@name='sub']") 
	WebElement submit;
	
	public void clickAddNewCustomer() {
		newCustomer.click();
	}
	
	public void custName(String cname) {
		name.sendKeys(cname);
	}
	
	public void custGender() {
		radgender.click();
	}
	
	public void custDob(String mm, String dd, String yy) {
		dob.sendKeys(mm);
		dob.sendKeys(dd);
		dob.sendKeys(yy);
	}
	
	public void custAddress(String caddress) {
		addr.sendKeys(caddress);
	}
	
	public void custCity(String ccity) {
		city.sendKeys(ccity);
	}
	
	public void custState(String cstate) {
		state.sendKeys(cstate);
	}
	
	public void custPinno(String cpin) {
		pinno.sendKeys(cpin);
	}
	
	public void custTelephoneno(String ctel) {
		telephoneno.sendKeys(ctel);
	}
	
	public void custEmailid(String cemail) {
		emailid.sendKeys(cemail);
	}
	
	public void custSubmit() {
		submit.click();
	}
}
