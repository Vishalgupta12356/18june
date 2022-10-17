package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {
	
static WebDriver driver;
	
	public static void launchBrowser(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
  }
		
		else if(browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	}}
