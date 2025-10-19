package testCases;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObject.HomePage;

public class Test1 {
	
	public WebDriver driver;
	public Properties p;
	
	
	@BeforeClass
	void setup() throws IOException{
		
		
		FileReader file = new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("appURL"));
		driver.manage().window().maximize();
		
	}
	@Test
	void testHome() {
		
		
		
		HomePage hp = new HomePage(driver);
		
		hp.setUsername(p.getProperty("username"));
		hp.setPassword(p.getProperty("password"));
		hp.clickLogin();
		
	}
	
	void teardown() {
		
	}

}
