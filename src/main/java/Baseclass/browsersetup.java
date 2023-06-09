package Baseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browsersetup {

	static WebDriver driver;
	public static WebDriver browser_initilization() {
		
		
	
		WebDriverManager.chromedriver().setup();
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 driver=new ChromeDriver(options);
		driver.get("https://www.carwale.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
		 
	}
	
	
	
	
}
