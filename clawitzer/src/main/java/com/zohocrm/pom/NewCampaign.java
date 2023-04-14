package com.zohocrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCampaign 
{

	@FindBy (name = "property(Campaign Name)")
	private WebElement campNameText;
	
	@FindBy (xpath = "//input[@class='button' and @name='Button' and @type='submit']")
	private WebElement saveBtn;
	
	public NewCampaign(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCampNameText() {
		return campNameText;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

}
