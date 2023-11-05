package SauceDemoPageObject.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SauceDemoPageObject.PageObject.LoginPageObject;
import SauceDemoPageObject.PageObject.ProductPageObject;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductTestCase {
	
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
	public void ProductTestCase1() throws InterruptedException 
	{
		LoginPageObject login = new LoginPageObject(driver);
		ProductPageObject product = new ProductPageObject(driver);
		
		login.EnterUserName("standard_user");
		login.EnterPassword("secret_sauce");
		login.ClickLoginButton();
		Thread.sleep(1000);
		
		product.ClickProduct1Button();
		Thread.sleep(2000);
		
	}
	
	@AfterMethod
	public void TeadDown() 
	{
		driver.quit();
	}

}
