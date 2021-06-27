package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.LoginPage;
import pages.ProductPage;


public class ProductSelection extends Baseclass{
public static WebDriver driver;
	
	@Test
	public void login()
	{
		LoginPage loginPageObj= new LoginPage();
		String uname = sheet.getRow(1).getCell(0).getStringCellValue();
        String pwd = sheet.getRow(1).getCell(1).getStringCellValue();
		loginPageObj.login(uname, pwd);
		
		
	}
	@Test(dependsOnMethods="login")
	public void addtocart()
	{
		ProductPage productPageObj = new ProductPage();
		String product = sheet.getRow(1).getCell(2).getStringCellValue();
		productPageObj.addToCart(product);
	}
	
	@Test(dependsOnMethods="addtocart")
	public void cart()
	{
		CartPage cartPageObj = new CartPage();
		String product = sheet.getRow(1).getCell(2).getStringCellValue();
		cartPageObj.verifyProduct(product);
		
	}
	
	
}
