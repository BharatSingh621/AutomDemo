package SauceDemoPageObject.TestCase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import SauceDemoPageObject.PageObject.LoginPageObject;

public class LoginTestCase {
	
	
	WebDriver driver;
	
	@BeforeMethod
	public void Setup() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	@Test
	public void LoginTest1() 
	{
		LoginPageObject login = new LoginPageObject(driver);
		login.EnterUserName("standard_user");
		login.EnterPassword("secret_sauce");
		login.ClickLoginButton();
	}
	
	@Test
	public void LoginTest2()  
	{
		LoginPageObject login = new LoginPageObject(driver);
		login.EnterUserName("locked_out_user");
		login.EnterPassword("secret_sauce");
		login.ClickLoginButton();
	}
	
	
	@Test
	public void LoginTest3() throws InterruptedException 
	{
		LoginPageObject login = new LoginPageObject(driver);
		login.EnterUserName("problem_user");
		login.EnterPassword("secret_sauce");
		login.ClickLoginButton();
	}
	
	
	
	@AfterMethod
	public void TeadDown() throws InterruptedException 
	{
		Thread.sleep(1000);
		driver.quit();
	}

}
