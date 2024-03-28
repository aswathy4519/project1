package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginvistara {
	
	public  WebDriver driver;

	@FindBy (xpath="//*[@id=\"flyerid\"]")
	WebElement mail;

	@FindBy (xpath="//*[@id=\"password\"]")
	WebElement pass;
	
	@FindBy (xpath="//*[@id=\"login\"]/div/div[1]/div/div[2]/form/div[2]/button")
	WebElement login;

	
	
	public Loginvistara (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setvalues (String email,String password )
	{
		mail.sendKeys(email);
		pass.sendKeys(password);
	}
	
	public void login()
	{
		login.click();
	}
	
	public void clear()
	{
		mail.clear();
	//	pass.clear();
	}
}
 