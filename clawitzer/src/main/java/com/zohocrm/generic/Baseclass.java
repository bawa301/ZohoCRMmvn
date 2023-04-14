package com.zohocrm.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.zohocrm.pom.HomePage;
import com.zohocrm.pom.LoginPage;

public class Baseclass 
{

	static 
	{
		System.setProperty("webdriver.chrome.driver", "./src\\main\\resources/driver/chromedriver.exe");
	}
	
	public static WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
	@BeforeMethod
	public void logIn() throws Throwable
	{
		FileLib f = new FileLib();
		String url = f.zohoData("url");
		String un = f.zohoData("username");
		String pw = f.zohoData("password");
		
		driver.get(url);
		
		LoginPage l = new LoginPage(driver);
		l.getUserName().sendKeys(un);
		l.getPassword().sendKeys(pw);
		l.getSignInBtn().click();
		
	}
	
	@AfterMethod
	public void logOut()
	{
		HomePage h = new HomePage(driver);
		h.setLogOutBtn();
	}

	public void onTestStart(ITestResult result) {
		
	}
}
