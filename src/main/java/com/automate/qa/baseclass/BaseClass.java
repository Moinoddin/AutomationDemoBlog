package com.automate.qa.baseclass;



import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.automate.qa.configutil.PropConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public PropConfig propcon;
	public WebDriverWait wait;
	
	@BeforeMethod()
	@Parameters("browser")
	public void setup(@Optional("chrome") String browser) throws IOException
	{
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			propcon = new PropConfig();
			driver.manage().window().maximize();
			driver.get(propcon.url());
			
		}
		
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			propcon = new PropConfig();
			driver.manage().window().maximize();
			driver.get(propcon.url());
			
		}
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
	
}
