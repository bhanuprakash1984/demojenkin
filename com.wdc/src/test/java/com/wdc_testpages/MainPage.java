package com.wdc_testpages;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wdc_main.BaseClass;

public class MainPage extends BaseClass {
	
	
//	public MainPage()
//	{
//		super();
//	}
	
	
	
	@Test(priority=1)
	public void mainpagetest() throws InterruptedException
	{
			
			login();
			//PIM();
			emplist();
				
		}
		
			
			
		public void login()
		{
			//WebElement m = driver.findElement(By.partialLinkText("My Account"));
		    //  m.click();
		     // System.out.println("Current page title : " + driver.getTitle());
				WebElement username = driver.findElement(By.xpath("//input[@Name='username']"));
				WebElement password = driver.findElement(By.xpath("//input[@Name='password']"));
				WebElement signin = driver.findElement(By.xpath("//*[@id=\"app\"]//button"));
				username.sendKeys("Admin");
				password.sendKeys("admin123");
				signin.click();
			
		}
		
		public void PIM()
		{
			String url = driver.getCurrentUrl();
			System.out.println(url);
			WebElement add = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));
			add.click();
			WebElement addfirstname = driver.findElement(By.cssSelector("input[name='firstName']"));addfirstname.sendKeys("BHANU");
			WebElement addmiddlename = driver.findElement(By.cssSelector("input[name='middleName']"));addmiddlename.sendKeys("PRAKASH");
			WebElement addlastname = driver.findElement(By.cssSelector("input[name='lastName']"));addlastname.sendKeys("SG");
			WebElement chkbox = driver.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']"));
			boolean isSelected = chkbox.isSelected();
			if(isSelected == false) {
				chkbox.click();
			}
			
//			WebElement imgbox = driver.findElement(By.xpath("//button[@class='oxd-icon-button employee-image-action']"));
//			File file=new File("C:\\Java Selenium\\passport.png");
//			imgbox.sendKeys(file.getAbsolutePath());
			WebElement addusername = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input"));addusername.sendKeys("bhanu123");
			//WebElement addpassword = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input[2]"));addpassword.sendKeys("Bhanu@123#$");
			WebElement addcnfpwd = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/input[1]"));addcnfpwd.sendKeys("Bhanu@123#$");
			WebElement addcnfpwd2 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[4]/div[1]/div[2]/div[1]/div[2]/input[1]"));addcnfpwd2.sendKeys("Bhanu@123#$");		
			WebElement save = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/button[2]"));save.click();
//		     // System.out.println("Current page title : " + driver.getTitle());
//				WebElement username = driver.findElement(By.xpath("//input[@Name='username']"));
//				WebElement password = driver.findElement(By.xpath("//input[@Name='password']"));
//				WebElement signin = driver.findElement(By.xpath("//*[@id=\"app\"]//button"));
//				username.sendKeys("Admin");
//				password.sendKeys("admin123");
//				signin.click();
			
		}
		
		public void emplist() throws InterruptedException
		{
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList"); 
			WebElement dropdown = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]"));dropdown.click();
			Thread.sleep(5000);
			//driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i")).click();
			
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//div[@class='oxd-select-text-input'][normalize-space()='Full-Time Contract']"))).click().build().perform();
			
			
			
		}
		

}
