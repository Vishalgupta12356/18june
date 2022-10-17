package PaytmApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signup {

   WebDriver driver; 

	@FindBy (xpath = "// div [ @ class='_1YP_']")
	private WebElement Sign;
	
	public signup(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sig() {
			Sign.click();
			driver.quit();
	}
}
