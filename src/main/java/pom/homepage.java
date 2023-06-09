package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class homepage  {
	
	WebDriver driver;
	
	@FindBy(xpath="(//span[@class='o-eemiLE o-cKuOoN o-lIIwF o-cWRslo o-bTDyCI o-fzpimw o-fzpibK '])[1]")
	private WebElement lan;
	
	@FindBy(xpath="//div[@class='o-fzptZU o-cONQOm']")
	private WebElement icon;
	
	@FindBy(xpath="(//input[@type='email'])[2]")
	private WebElement entermail;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement submit;
	
	@FindBy(xpath="//div[@class='o-bkmzIL o-fzpihx o-fzpilz o-tvvmc']")
	private WebElement name;
	
	
	public homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}


	public void enter_mail() {
		
		utilities.util.waitmethod(driver, lan,5);
		lan.click();
		icon.click();
		utilities.util.waitmethod(driver, entermail,5);
		entermail.sendKeys("aniket1615@gmail.com");
		
	}
	
	public void enter_password() {
		password.sendKeys("aniket@1615");
	}
	
	public void button() {
		submit.click();
	}
	
	public String username() {
	
		icon.click();
		return name.getText();
	}
	
	
}
