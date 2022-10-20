package com.blogspot.qa.Test;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.automate.qa.baseclass.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UrlTest  {

	WebDriver driver;
	
	
	
	public void chromeTest() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://amazon.in");
//		driver.findElement(By.xpath("//i[@class='nav-icon']")).click();
		int i = driver.findElements(By.tagName("iframe")).size();
		System.out.println(i);
		Select dp = new Select(driver.findElement(By.xpath("//*[@id='searchDropdownBox']")));
		Thread.sleep(2000);
		dp.selectByIndex(4);
		Thread.sleep(5000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("cooker");
		driver.findElement(By.id("nav-search-submit-button")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getClass());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getClass()+"--- Driver Class-----"+Thread.currentThread().getId());
		Thread.sleep(5000);
		driver.quit();
		//i[@class='nav-icon']
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.MILLISECONDS);
//		
//		WebDriver newWindow = driver.switchTo().newWindow(WindowType.WINDOW);
//		newWindow.get("https://www.google.com");
		
//		wait = new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
		
//		
//		driver.navigate().forward();
//		driver.navigate().to("https://www.browserstack.com/guide/wait-commands-in-selenium-webdriver");
//		System.out.println(driver.getTitle());
	//	driver.navigate().refresh();
		
	
	}
	
	
	@Test
	public void fireFoxTest() throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://amazon.in");
		int i = driver.findElements(By.tagName("iframe")).size();
		System.out.println(i);
//		WebDriverWait w= new WebDriverWait(driver, 7);
//		w.until(ExpectedConditions. elementToBeClickable (By.id("searchDropdownBox")));
//		//alternate solution
//		w.until(ExpectedConditions
//		. invisibilityOfElementLocated(By.id("id of overlay element")));
//		
		Select st = new Select(driver.findElement(By.id("searchDropdownBox")));
		Thread.sleep(2000);
		st.selectByIndex(7);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("cooker");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button'")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getClass());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getClass()+"--- Driver Class-----"+Thread.currentThread().getId());
		driver.quit();
		
	}
	
	
	
}
