package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassAndObject1 {
	public static void main(String[] args) {
		

	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	String url= "https://www.google.com";
	driver.get(url);
	driver.findElement(By.id("identifierId")).sendKeys("tulpun78@gmail.com");
	driver.findElement(By.id("identifierNext")).click();
/*	WebDriverManager.firefoxdriver().setup();
	WebDriver foxdriver= new FirefoxDriver();
	String url= "https://www.Gmail.com";
	foxdriver.get(url);
	foxdriver.findElement(By.id("identifierId")).sendKeys("tulpun78@gmail.com");
	foxdriver.findElement(By.id("identifierNext")).click();*/
	
	}

}
