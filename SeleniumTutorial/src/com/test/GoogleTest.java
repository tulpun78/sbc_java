package com.test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
WebDriver driver;



@BeforeMethod
public void setUP() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\tulpu\\Documents\\SeleniumJarFiles\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	  driver.get("http://www.google.com");
}
	 @Test 
	 public void googleTitleTest() {
		 String title= driver.getTitle();
		 System.out.println(title);
	 }
	 @Test
	 public void googleLogoTest() {
	boolean b= driver.findElement(By.className("lnXdpd")).isDisplayed();
	 }
	 @Test
	 public void mailLinkTest() {
	boolean b= driver.findElement(By.linkText("mail")).isDisplayed();
	 }
	 
	  @AfterMethod
	  public void tearDown() {
		  driver.quit();
	  }
	  

}
