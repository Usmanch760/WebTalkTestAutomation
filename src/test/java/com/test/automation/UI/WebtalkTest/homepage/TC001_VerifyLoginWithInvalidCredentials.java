/**
 * 
 */
package com.test.automation.UI.WebtalkTest.homepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author usman
 *
 */
public class TC001_VerifyLoginWithInvalidCredentials {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\mozzila_driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		
		
	
	}
	
	@Test(priority=1)	
	public void VerifyLoginWithInvalidCredentials() {
		driver.get("https://dev.webtalk.co/o/signin");
		driver.findElement(By.xpath("/html/body/section/wt-signin/wt-default-onboarding-page/div/div/table/tbody/tr[2]/td/span/main-content/div/div[2]/form/div[1]/input")).sendKeys("usman@myfake.tk");
		driver.findElement(By.xpath("/html/body/section/wt-signin/wt-default-onboarding-page/div/div/table/tbody/tr[2]/td/span/main-content/div/div[2]/form/div[2]/input")).sendKeys("Pmasuaar1@#$ss");
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"signInInvalidCredentials\"]")).getText(), "Invalid credentials"); 
		
		
	}
	
	
	@Test(priority=2)	
	public void VerifyLoginWithValidCredentials() {
		driver.get("https://dev.webtalk.co/o/signin");
		driver.findElement(By.xpath("/html/body/section/wt-signin/wt-default-onboarding-page/div/div/table/tbody/tr[2]/td/span/main-content/div/div[2]/form/div[1]/input")).sendKeys("usman@myfake.tk");
		driver.findElement(By.xpath("/html/body/section/wt-signin/wt-default-onboarding-page/div/div/table/tbody/tr[2]/td/span/main-content/div/div[2]/form/div[2]/input")).sendKeys("Pmasuaar1@#$");
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		Assert.assertEquals(driver.findElement(By.xpath("/html/body/section/wt-default-page/div[3]/div[2]/div/div/div[1]/span/main-content/wt-home-page-view/div[1]/form/wt-talk-box/div/div[1]/div[6]/div[2]/div/button")).getText(), "Talk");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
	}
	
   @AfterTest
	public void endTest() {
		
		//driver.close();
	}

}
