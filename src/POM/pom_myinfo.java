package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_myinfo {

	@FindBy(xpath="//a[@class='oxd-main-menu-item active']")
	private WebElement myinfo;
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement fname;
	
	@FindBy(xpath="//input[@name='middleName']")
	private WebElement Mname;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement Lname;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2])")
	private WebElement Nickname;
	
	@FindBy(xpath="(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[1]")
	private WebElement licenExperyDate;
	
	public void ClickOnMyinfo() 
	{
		 myinfo.click();
	}
	public void sendfname() 
	{
		 fname.sendKeys("Rudra");
	}
	public void sendMname() 
	{
		 Mname.sendKeys("Ambadas");
	}
	public void sendLname() 
	{
		 Lname.sendKeys("mhaske");
	}
	public void sendNickname() 
	{
		 Nickname.sendKeys("taklu");
	}
	public void ClickOnLicensExpiryDate() 
	{
		 licenExperyDate.click();
	}
	
	
	public  pom_myinfo (WebDriver d3) 
	{
		PageFactory.initElements(d3, this);
	}
}
