package com.automate.qa.pageclassobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableElements {
	
	WebDriver driver;
	public WebTableElements(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//tbody/tr[3]/td[2]")
	WebElement webtable;
	
	
	public WebElement webTableElement()
	{
		return webtable;
		
	}

}
