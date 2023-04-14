package com.zohocrm.testScript;



import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.zohocrm.generic.Baseclass;
import com.zohocrm.generic.FileLib;
import com.zohocrm.pom.CampaignsPage;
import com.zohocrm.pom.HomePage;
import com.zohocrm.pom.NewCampaign;



@Listeners (com.zohocrm.generic.ListenersImplimentation.class)
public class CreateCampaigns extends Baseclass 
{
	@Test (priority = 0)
	public void homePage()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Zoho CRM - Home Page"));
		
		String aTitle = driver.getTitle();
		String eTitle = "Zoho CRM - Home Page";
		assertEquals(aTitle, eTitle);
	}
	
	@Test (priority = 1)
	public void campaigns() throws Throwable
	{
		
		HomePage h = new HomePage(driver);
		h.getCampBtn().click();	
		
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		wait.until(ExpectedConditions.titleContains("Zoho CRM - Displaying Custom View Details"));
		String aResult = driver.getTitle();
		String eResult="Zoho CRM - Displaying Custom View Details";
		
		assertEquals(aResult, eResult);		
	}
	
	@Test (priority = 2)
	public void newCampaign() throws Throwable
	{
		
		HomePage h = new HomePage(driver);
		h.getCampBtn().click();
		
		CampaignsPage c = new CampaignsPage(driver);
		c.getNewCampBtn().click();
	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Zoho CRM - Create Campaign"));
		String aResult = driver.getTitle();
		String eResult = "Zoho CRM - Create Campaign";		
		assertEquals(aResult, eResult);
	}
	
	@Test (priority = 3)
	public void createNewCamp() throws Throwable 
	{
		FileLib f = new FileLib();
		String data = f.zohoExcelData("CreateCampaign", 1, 3);
		
		HomePage h = new HomePage(driver);
		h.getCampBtn().click();
		
		CampaignsPage c = new CampaignsPage(driver);
		c.getNewCampBtn().click();
		
		NewCampaign n = new NewCampaign(driver);
		n.getCampNameText().sendKeys(data);
		n.getSaveBtn().click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Zoho CRM - Campaign Details"));
		String aResult = driver.getTitle();
		String eResult = "Zoho CRM - Campaign Details";
		assertEquals(aResult, eResult);
	}
	
	@Test (priority = 4)
	public void numaricalValue() throws Throwable
	{
		FileLib f = new FileLib();
		String data = f.zohoExcelData("CreateCampaign", 2, 3);
		
		HomePage h = new HomePage(driver);
		h.getCampBtn().click();
		
		CampaignsPage c = new CampaignsPage(driver);
		c.getNewCampBtn().click();
		
		NewCampaign n = new NewCampaign(driver);
		n.getCampNameText().sendKeys(data);
		n.getSaveBtn().click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Zoho CRM - Campaign Details"));
		String aResult = driver.getTitle();
		String eResult = "Zoho CRM - Campaign Details";
		assertNotEquals(aResult, eResult);
	}
	
	@Test (priority = 5)
	public void alphaNumaricValue() throws Throwable
	{
		FileLib f = new FileLib();
		String data = f.zohoExcelData("CreateCampaign", 3, 3);
		
		HomePage h = new HomePage(driver);
		h.getCampBtn().click();
		
		CampaignsPage c = new CampaignsPage(driver);
		c.getNewCampBtn().click();
		
		NewCampaign n = new NewCampaign(driver);
		n.getCampNameText().sendKeys(data);		
		n.getSaveBtn().click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Zoho CRM - Campaign Details"));
		String aResult = driver.getTitle();
		String eResult = "Zoho CRM - Campaign Details";
		assertNotEquals(aResult, eResult);
	}
	
	@Test (priority = 6)
	public void blankValue() throws Throwable
	{
		FileLib f = new FileLib();
		String data = f.zohoExcelData("CreateCampaign", 4, 3);
		
		HomePage h = new HomePage(driver);
		h.getCampBtn().click();
		
		CampaignsPage c = new CampaignsPage(driver);
		c.getNewCampBtn().click();
		
		NewCampaign n = new NewCampaign(driver);
		n.getCampNameText().sendKeys(data);
		n.getSaveBtn().click();
		
		driver.switchTo().alert().accept();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Campaign"));
		String aResult = driver.getTitle();
		String eResult = "Zoho CRM - Campaign Details";
		assertNotEquals(aResult, eResult);
	}
	
	@Test (priority = 7) 
	public void specialCharacterValue() throws Throwable
	{
		FileLib f = new FileLib();
		String data = f.zohoExcelData("CreateCampaign", 5, 3);
		
		HomePage h = new HomePage(driver);
		h.getCampBtn().click();
		
		CampaignsPage c = new CampaignsPage(driver);
		c.getNewCampBtn().click();
		
		NewCampaign n = new NewCampaign(driver);
		n.getCampNameText().sendKeys(data);
		n.getSaveBtn().click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Zoho CRM - Campaign Details"));
		String aResult = driver.getTitle();
		String eResult = "Zoho CRM - Campaign Details";
		assertNotEquals(aResult, eResult);
	}
	
	@Test (priority = 8)
	public void emojisValue() throws Throwable
	{
		FileLib f = new FileLib();
		String data = f.zohoExcelData("CreateCampaign", 6, 3);
		
		HomePage h = new HomePage(driver);
		h.getCampBtn().click();
		
		CampaignsPage c = new CampaignsPage(driver);
		c.getNewCampBtn().click();
		
		NewCampaign n = new NewCampaign(driver);
		n.getCampNameText().sendKeys(data);
		n.getSaveBtn().click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Zoho CRM - Campaign Details"));
		String aResult = driver.getTitle();
		String eResult = "Zoho CRM - Campaign Details";
		assertNotEquals(aResult, eResult);
	}
}
