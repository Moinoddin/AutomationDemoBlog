package com.blogspot.qa.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ManagerTest {
	
	
	@Test
	public void chromeTest()
	{
		
		ChromeOptions co = new ChromeOptions();
		co.setHeadless(true);
		
		WebDriverManager.chromedriver().setup();

		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println(driver.getTitle());
		
		
		String first = "//*[@id=\"HTML1\"]/div[1]/table/tbody/tr[";
		String middle  = "]/td[";
		String last ="]";
		
		int r = driver.findElements(By.tagName("/table/tbody/tr")).size();
		int s = driver.findElements(By.tagName("/table/tbody/")).size();
		System.out.println(r);
		System.out.println(s);
		for(int i=2; i<8; i++)
		{
			for(int j=1; j<=4; j++)
			{
					String xpath = first+i+middle+j+last;
			
					WebElement we = driver.findElement(By.xpath(xpath));
					//String match = we.getText();
					
					//if(match.equals("2000"))
					if(i==6 && j==4)
					{
						
						System.out.println(we.getText());
						
					}
			}
		}
		
		System.out.println("--------------------------------------------------------------------");
		
		//System.out.println(driver.findElement(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr[3]/td[2]")).getText());
		
		System.out.println("--------------------------------------------------------------------");
		
		
		
		
		
		
		driver.close();
		
		
	}
	
	
	

}
