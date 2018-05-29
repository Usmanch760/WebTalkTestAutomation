package com.test.automation.UI.WebtalkTest.homepage;
/**
 * @author usman
 *
 */
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Onboarding {
	
	
	WebDriver driver;
	
	String dev="https://dev.webtalk.co/o/signin";
	String dev2="https://dev2.webtalk.co/o/signin";
	
	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\mozzila_driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		
	
	}
	
	@Test(priority=1)	
	public void OnboardingSignUp() {
		driver.get(dev2);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/section/wt-signin/wt-default-onboarding-page/div/div/table/tbody/tr[2]/td/span/main-content/wt-call-to-sign-up/div/a")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("/html/body/section/wt-sign-up/wt-default-onboarding-page/div/div/table/tbody/tr[2]/td/span/main-content/div/div[2]/div/div/section[1]/form/div[1]/div[1]/input")).sendKeys("usman");
		driver.findElement(By.xpath("/html/body/section/wt-sign-up/wt-default-onboarding-page/div/div/table/tbody/tr[2]/td/span/main-content/div/div[2]/div/div/section[1]/form/div[1]/div[2]/input")).sendKeys("Ahmad ch");
		driver.findElement(By.xpath("/html/body/section/wt-sign-up/wt-default-onboarding-page/div/div/table/tbody/tr[2]/td/span/main-content/div/div[2]/div/div/section[1]/form/div[2]/input")).sendKeys("usman60@armyspy.com");
		driver.findElement(By.xpath("/html/body/section/wt-sign-up/wt-default-onboarding-page/div/div/table/tbody/tr[2]/td/span/main-content/div/div[2]/div/div/section[1]/form/div[3]/input")).sendKeys("Pmasuaar1@#$");
		
		driver.findElement(By.xpath("/html/body/section/wt-sign-up/wt-default-onboarding-page/div/div/table/tbody/tr[2]/td/span")).click();
		
		WebElement element_p = (new WebDriverWait(driver, 3))
	      .until(ExpectedConditions.visibilityOfElementLocated(By
	         .xpath("/html/body/section/wt-sign-up/wt-default-onboarding-page/div/div/table/tbody/tr[2]/td/span/main-content/div/div[2]/div/div/section[1]/form/div[4]/button")));
	               element_p.sendKeys(Keys.RETURN);
	               driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	              
	               
	    Assert.assertEquals(driver.findElement(By.cssSelector("html.ng-scope body.onBoarding-body section.body-wrapper.ng-scope wt-sign-up.ng-scope.ng-isolate-scope wt-default-onboarding-page.ng-isolate-scope div.content-wrapper div.onBoarding-wrapper table tbody tr.right-row td span.on-boarding-signup-screen main-content.ng-scope div.join-form-wrapper div.join-inputs div.ng-isolate-scope div.steps.ng-scope section.step.ng-scope.ng-isolate-scope.current form.ng-pristine.ng-scope.ng-invalid.ng-invalid-required p.referred-label")).getText() , "Who invited you?");          
		
	    
		
	}
	
	

	
   @AfterTest
	public void endTest() {
		
		//driver.close();
	}

}
