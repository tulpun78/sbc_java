package SeleniumSession;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //FF browser:
     //geckodriver
	  // System.setProperty("webdriver.gecko.driver","/users/tulpu/Downloads/geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		// chrome browser
		//System.setProperty("webdriver.chrome.driver","\\Users\\tulpu\\Desktop\\New folder\\chromedriver.exe");
	//	WebDriver driver=new ChromeDriver(); // launch chrome
	//	driver.get("http:www.google.com");//enter URL
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
		
		// FF browser
		System.setProperty("webdriver.gecko.driver","C:\\Users\\tulpu\\Desktop\\New folder\\geckodriver.exe");
		WebDriver foxdriver=new FirefoxDriver();
		foxdriver.get("http:www.google.com");
		
	}
	}

