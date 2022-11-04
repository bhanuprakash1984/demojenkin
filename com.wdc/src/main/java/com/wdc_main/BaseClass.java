package com.wdc_main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BaseClass {
	
	public WebDriver driver;
		

	



	@BeforeMethod
	public void basepage() throws InterruptedException
	
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sgbha\\eclipse-workspace\\com.wdc\\src\\main\\resources\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
	
	}
	

}

