package PaytmApp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class learnmore {
 WebDriver driver;
	@FindBy (xpath = "// h4 [@class='_faq_question']")
	private WebElement HOTA;
	
	
	public learnmore(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void scrolldo() {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,1800)");
		
	}
	
	public void how() {
		HOTA.click();
	}
	
	public void scrollup() {
		JavascriptExecutor ju = (JavascriptExecutor) driver;
		ju.executeScript("window.scrollBy(0,-1800)");
		
	}
}
