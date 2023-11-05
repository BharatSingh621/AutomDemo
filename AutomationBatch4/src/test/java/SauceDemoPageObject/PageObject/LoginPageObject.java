package SauceDemoPageObject.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObject {

	private WebDriver driver;
	
	public LoginPageObject(WebDriver Driver) 
	{
		this.driver=Driver;
	}
	
//	this is loginpage Object
	By usernameInput = By.id("user-name");	
	By passwordInput  = By.id("password");
	By loginButton = By.xpath("//input[@id='login-button']");
	
	
	public void EnterUserName(String username) 
	{
		driver.findElement(usernameInput).sendKeys(username);
	}
	
	
	public void EnterPassword(String password) 
	{
		driver.findElement(passwordInput).sendKeys(password);
	}
	
	public void ClickLoginButton() 
	{
		driver.findElement(loginButton).click();
	}
}
