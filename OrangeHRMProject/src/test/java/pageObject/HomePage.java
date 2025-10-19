package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	
	public HomePage(WebDriver driver){
		super(driver);
	}
	
	

	@FindBy(xpath="//input[@placeholder='Password']") 
	WebElement txt_password;
	
	@FindBy(xpath="//input[@placeholder='Username']")  
	WebElement txt_username;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_login;
	
	
	
	public void setPassword(String pwd) {
		txt_password.sendKeys(pwd);
	}
	
	public void setUsername(String user) {
		txt_username.sendKeys(user);
	}
	
	public void clickLogin() {
		btn_login.click();
	}

}
