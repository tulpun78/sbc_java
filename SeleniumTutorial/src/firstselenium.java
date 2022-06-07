
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
;

public class firstselenium {
	public static void main(String[] rgs) {
				
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\tulpu\\Documents\\SeleniumJarFiles\\chromedriver.exe");
		  ChromeDriver driver= new ChromeDriver();
		  String url= "https://linkedin.com";
		  String expectedTitle="LinkedIn: Log In or Sign up";
		  String actualTitle= "";
		  driver.get(url);
		  actualTitle=driver.getTitle();
		 // System.out.println(actualTitle);
		  
	  if (actualTitle.contentEquals(expectedTitle)){
		  System.out.println(" everything is good");
	  }else {
		  System.out.println(" not good");
	  }
		  
	}
	
}

	//* System.setProperty("webdriver.gecko.driver", "C:\\Users\\tulpu\\Documents\\SeleniumJarFiles\\geckodriver.exe"); 
	// WebDriver driver= new FirefoxDriver(); 
	// driver.get("https://www.linkedin.com/");*/
	// WebDriver driver= new SafariDriver();
	 //
	


