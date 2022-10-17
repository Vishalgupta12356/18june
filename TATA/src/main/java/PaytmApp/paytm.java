package PaytmApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class paytm {
	WebDriver driver;
	
	@FindBy(xpath = "// a [text() ='Paytm for Consumer']")
	private WebElement carrer;
	
	@FindBy (xpath ="(// div [@ class='_3Q2wc'])[5]" )
	private WebElement Pay;
	
	
	public paytm(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void action() {
		WebElement Carrer = driver.findElement(By.xpath("// a [text() ='Paytm for Consumer']"));
		Actions act = new Actions(driver);
		act.moveToElement(Carrer).perform();
	}
	
	public void clickon() {
		Pay.click();
		
	}
	
}
