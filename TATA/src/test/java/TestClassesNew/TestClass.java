package TestClassesNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.Baseclass;
import PaytmApp.learnmore;
import PaytmApp.paytm;
import PaytmApp.signup;
import PaytmApp.upi;
public class TestClass extends Baseclass{
	//Declare Global reference variables of all pom classes
	WebDriver driver;
	learnmore learn;
	upi postp;
	paytm payt;
	signup signups;
	
	
	
	@BeforeClass
	
	
	
   public void launchBrowser() throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");  //provides path of executable browser file
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://paytm.com/");
		
		Thread.sleep(1000);
		//Create objects of all pom classes And assign to all global reference  variables
		learn = new learnmore(driver);
		postp = new upi (driver);
		payt = new paytm(driver);
		signups = new signup (driver);
		System.out.println("BeforeClass");
	}
	
	
	
	@BeforeMethod
	public void TC02() {
		System.out.println("BeforeMethod");
	}
	
	@Test(priority =01)
	public void TC03() throws InterruptedException {
		payt.action();
		payt.clickon();
		Thread.sleep(10000);
	}
	
	@Test(priority =02)
	public void TC04() throws InterruptedException {
		learn.scrolldo();
		Thread.sleep(50000);
		learn.how();
		
		learn.scrollup();
		Thread.sleep(10000);
	}
	
	@Test(priority =03)
	public void TC05() throws InterruptedException {
	postp.clickonupi();
		Thread.sleep(10000);
	}
	
	@Test(priority =04)
	public void TC08() {
		signups.sig();
	}
	
	@AfterMethod
	public void TC06(ITestResult result) {
		
		if (result.getStatus() == ITestResult.FAILURE ) {
			
		}
	}
	
	@AfterClass
		public void TC07() {
		System.out.println("AfterClass");
	}
	
}
