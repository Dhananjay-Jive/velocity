package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy (xpath= "//input[@name='username']")
	private WebElement UserId;
	
	@FindBy (xpath= "//input[@name='password']")
	private WebElement Password;
	
	@FindBy (xpath= "//button[@type='submit']")
	private WebElement Loginbtn;
	
 	public void sendUserId() 
	  {
		UserId.sendKeys("Admin");
	  }
	public void sendPass() 
	  {
		Password.sendKeys("admin123");
	  }
	public void clickOnLBtn() 
	{
		Loginbtn.click();
	}
	
	public LoginPage (WebDriver d1) 
	{
		PageFactory.initElements(d1, this);
	} 
	
}
