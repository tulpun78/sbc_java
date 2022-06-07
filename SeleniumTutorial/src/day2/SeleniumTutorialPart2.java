package day2;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTutorialPart2 {
    private static WebDriver driver;
	public static void main(String[] args) {
     
       System.out.println("Enter browser type to check");
	   Scanner scan= new Scanner(System.in);
	    String browser= scan.nextLine();
		 
	   System.out.println("Close browser after execution?");
	   String closebrowser= scan.nextLine();
	   System.out.println(browser);
		 
		 
	     if(browser.contains("chrome")) {
			 System.setProperty("webdriver.chrome.driver","C:\\users\\tulpu\\Documents\\SeleniumJarFiles\\chromedriver.exe");
			 driver = new ChromeDriver();
		 }else if (browser.contains("firefox")) {
			 System.setProperty("webdriver.gecko.driver","C:\\users\\tulpu\\Documents\\SeleniumJarFiles\\geckodriver.exe");
			 driver= new FirefoxDriver();
		 }else {
			 System.out.println("No correct browser type entered, selecting default browser to be chrome");
			 System.setProperty("webdriver.gecko.driver","C:\\users\\tulpu\\Documents\\SeleniumJarFiles\\geckodriver.exe");
			 driver= new FirefoxDriver();
		 }
		   driver.get("https://linkedin.com");
		   
		   driver.getTitle();
		   System.out.println(driver.getTitle());
		  // System.out.println(driver.getCurrentUrl());
		   
		   // WebElement usernameInput=driver.findElement(By.xpath("//input[@autocomplete='username']"));
		   // usernameInput.sendKeys("tul123");
		   
		   driver.findElement(By.id("session_key")).sendKeys("tulbahadur.p18@gmail.com");
		   driver.findElement(By.id("session_password")).sendKeys("Associates2022");
		   driver.findElement(By.className("sign-in-form__submit-button")).click();
		   driver.findElement(By.id("ember19")).click();
		   
		   
		   // we can select or erxtract the web elements using ID and class or name without using xpath right???
		  

		   
		 
		 }
	}
	

