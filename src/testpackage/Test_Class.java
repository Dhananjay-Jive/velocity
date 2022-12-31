package testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POM.LogOutPage;
import POM.LoginPage;
import POM.pom_myinfo;

public class Test_Class {   
     WebDriver driver;
     LoginPage login;
     LogOutPage logout;
     SoftAssert s;
     pom_myinfo my;
	private OutputType OutputType;
	private org.openqa.selenium.OutputType FILE;
    @BeforeTest
    public void LaunchBrowser() throws InterruptedException 
    {
    	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	     driver=new ChromeDriver();
		 Thread.sleep(3000);
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
    }
    @BeforeClass
    public void ObjectCreation() 
    {  
    	login=new LoginPage(driver);
        logout= new LogOutPage(driver);
        s=new SoftAssert();
        my=new pom_myinfo(driver);
    }
    @BeforeMethod
    public void loginFunctionality() throws InterruptedException 
    {
		 login.sendUserId();
		 Thread.sleep(3000);
		 login.sendPass();
		 Thread.sleep(3000);
		 login.clickOnLBtn();
		 
    }
	@Test 
	public void test() throws InterruptedException 
	{
		String  loginlink="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String LogoutLink="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		Thread.sleep(3000);
		s.assertNotEquals(loginlink,LogoutLink);	 
	}
	@Test
	public void MyInfo() 
	{
	  
	   my.ClickOnMyinfo();
	   my.sendfname();
	   my.sendMname();
	   my.sendLname();
	   my.sendNickname();
	   my.ClickOnLicensExpiryDate();
	 System.out.println("sucessfully enter data");
	  	 
	}
	@AfterMethod
	public void LogOutFunctionality() throws InterruptedException 
	{
		 logout.clickOnProfile();
		 Thread.sleep(3000);
		 logout.clickOnLogOut();	
		 s.assertAll();
	}
	@AfterClass
	public void ClearObjects() 
	{
		login=null;
		logout=null;
			 
	}
	@AfterTest
	public void ClearDriver() 
	{
	   driver.quit();
	   driver=null;
		System.gc();	 
	}
	
}
