package com.zohocrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy (xpath = "//a[text()='Logout [rashmi@dell.com]']")
	private WebElement logOutBtn;
	
	@FindBy (xpath = "//a[text()='Campaigns']")
	private WebElement campBtn;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public void setLogOutBtn() {
		logOutBtn.click();
	}
	
	public WebElement getCampBtn() {
		return campBtn;
	}


	
	
	
	
	
	
}
