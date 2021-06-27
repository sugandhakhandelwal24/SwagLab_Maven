package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import test.Baseclass;

public class ProductPage {
	
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	
	/*@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
	WebElement addToCartItem;*/
	
	
			

	public ProductPage()
	{
		driver = Baseclass.driver;
		report = Baseclass.report;
		test = Baseclass.test;
		PageFactory.initElements(driver, this);
		
	}
	
	public void addToCart(String product)
	{
		
		WebElement buttonProductSelect = driver.findElement(By.xpath("//*[text()= '" + product + "']//following::button[1]"));
		buttonProductSelect.click();
		
	
	}
	
	
	
}
