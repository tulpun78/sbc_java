package SeleniumSession;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\tulpu\\Desktop\\New folder\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		
		Assert.assertTrue(false);
	}

}
