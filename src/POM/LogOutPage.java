package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {

	@FindBy (xpath= "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	private WebElement profile;
	
	@FindBy (xpath= "//a[text()='Logout']")
	private WebElement LogOut;
	
	public void clickOnProfile() 
	{
		profile.click();
	}
	public void clickOnLogOut() 
	{
		LogOut.click();
	}
	
	public LogOutPage (WebDriver d2) 
	{
		PageFactory.initElements(d2, this);
	}
	
	
	
	
}
