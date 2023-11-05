package SauceDemoPageObject.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPageObject {
	
	private WebDriver driver;
	
	public ProductPageObject(WebDriver Driver) 
	{
		this.driver=Driver;
	}
	
	By productTitle = By.xpath("//span[contains(text(),'Products')]");
	
	By SauceProduct1Button= By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	
	
	public String GetProductTitle() 
	{
		return driver.findElement(productTitle).getText();
	}

	
	public void ClickProduct1Button() 
	{
		driver.findElement(SauceProduct1Button).click();
	}
}
