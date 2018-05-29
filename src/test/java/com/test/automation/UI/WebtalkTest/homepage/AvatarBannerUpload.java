package com.test.automation.UI.WebtalkTest.homepage;
/**
 * @author usman
 *
 */
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AvatarBannerUpload {
	
	WebDriver driver;
	
	String dev="https://dev.webtalk.co/o/signin";
	String dev2="https://dev2.webtalk.co/o/signin";
	
	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\mozzila_driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		
	
	}
	
	@Test(priority=1)	
	public void AvatarUpload() {
		driver.get(dev2);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/section/wt-signin/wt-default-onboarding-page/div/div/table/tbody/tr[2]/td/span/main-content/div/div[2]/form/div[1]/input")).sendKeys("usman@myfake.tk");
		driver.findElement(By.xpath("/html/body/section/wt-signin/wt-default-onboarding-page/div/div/table/tbody/tr[2]/td/span/main-content/div/div[2]/form/div[2]/input")).sendKeys("Pmasuaar1@#$");
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		
     	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		
		driver.findElement(By.xpath("/html/body/section/wt-default-page/div[3]/div[1]/header-content/wt-header-container/div/header/div[1]/h1/a[3]")).click();
		
		driver.findElement(By.xpath("/html/body/section/wt-default-page/div[3]/div[1]/header-content/wt-header-container/div/header/div[1]/h1/ul/li[3]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"showEditProfile\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"editAvatorImageIcon\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		driver.findElement(By.xpath("//*[@id=\"myAvatarImageField\"]")).sendKeys("C:\\Users\\True Meridian\\Desktop\\usman.png");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		
		
		
		driver.findElement(By.xpath("//*[@id=\"updateProfileAvatarBannerBtn\"]")).click();
		//we ll aplly wait here as it take bit of time to upload avatar
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		
		
		driver.findElement(By.cssSelector("#updateProfileAvatarBannerBtn")).click();
		
		driver.findElement(By.xpath("//*[@id=\"showEditProfile\"]")).click();
		
		

		
		
		
		
		
	}
	
	

	
   @AfterTest
	public void endTest() {
		
		//driver.close();
	}

}
