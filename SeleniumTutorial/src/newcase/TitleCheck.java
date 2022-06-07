package newcase;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class TitleCheck {
	public static void main(String[] args) throws InterruptedException {
				
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\tulpu\\Documents\\SeleniumJarFiles\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  String baseUrl = "https://linkedin.com";
		  //String expectedTitle = "LinkedIn: Log In or Sign Up";
		  //String actualTitle= "";
		  driver.get(baseUrl);
		  //actualTitle = driver.getTitle();
	/*	  
		  if (actualTitle.contentEquals(expectedTitle)) {	 
			  System.out.println("Everything is Good");
		  }
		  else {
			  System.out.println("No Good!!!");
		  }
		 
	*/	  
		  
		  
		   driver.findElement(By.id("session_key")).sendKeys("tulbahadur.p18@gmail.com");
		  
		   driver.findElement(By.id("session_password")).sendKeys("Associates2022");
		 
		   driver.findElement(By.className("sign-in-form__submit-button")).click();
		   Thread.sleep(1500);
		   driver.findElement(By.id("ember19")).click();
		  
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   List<WebElement> elements = driver.findElements(By.className("job-card-container"));
		  
		   for(WebElement e: elements) {
			   if(e.getText().contains("Actively recruiting")) {
				   e.findElement(By.className("jobs-save-button")).click();
			   }
		   }
	}
}
		   
		   
		   
		   
		   //WebElement Search= driver.findElement(By.id("global-nav-typeahead"));
		   //System.out.println("display status:"+ Search.isDisplayed());
		   //System.out.println("enable status:"+ Search.isEnabled());
		   
		   
