package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayHome_Elements {
	WebDriver driver;
	@FindBy(xpath = "//a[@id='gh-as-a']")
	public WebElement advancedLinkElement;

	public EbayHome_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
