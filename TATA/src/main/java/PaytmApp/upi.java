package PaytmApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upi {

	WebDriver driver;
	@FindBy (xpath = "// img [@ alt='logo']")
	private WebElement paytt;
	
	public upi(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickonupi() {
		paytt.click();
	}
}
