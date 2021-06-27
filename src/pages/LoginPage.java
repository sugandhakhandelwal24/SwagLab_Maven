package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import test.Baseclass;



public class LoginPage {
WebDriver driver;
ExtentReports report;
ExtentTest test;

	@FindBy(id="user-name")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(id="login-button")
	WebElement loginButton;

	public LoginPage()
	{
		driver = Baseclass.driver;
		report = Baseclass.report;
		test = Baseclass.test;
		PageFactory.initElements(driver, this);
		
	}
	public void login(String uname, String pwd)
	{
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginButton.click();
		
		String HomePageTitle = driver.getTitle();
		System.out.println("Title of the homepage is : " + HomePageTitle);
	}
}
