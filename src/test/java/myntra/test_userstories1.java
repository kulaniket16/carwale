package myntra;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.homepage;


public class test_userstories1 {

	WebDriver driver;
	homepage hp;
	
	@BeforeClass
	public void beforeclass() {
		driver=Baseclass.browsersetup.browser_initilization();
		
	}
	@BeforeMethod
	public void beforemethod() {
		hp=new homepage(driver);
		
	}
	@Test
	public void verify_user_can_login_successfully() throws InterruptedException {
		
		hp.enter_mail();
		hp.enter_password();
		hp.button();
		Thread.sleep(30000);
		System.out.println(hp.username());
		Assert.assertEquals(hp.username(),"abk");
	}
	@AfterMethod
	public void aftermethod() {
		
	}
	@AfterClass
	public void afterclass() {
		
	}
	
	
}
