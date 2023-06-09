package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class util {
	
	public static void browser_alertpopup(WebDriver driver) {
		driver.switchTo().alert().dismiss();

	}
	
	public static void frame(WebDriver driver) {
		driver.switchTo().frame(1);	}
	
	public static void waitmethod(WebDriver driver,WebElement element,int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	
}
