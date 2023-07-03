package actions;

import org.openqa.selenium.WebDriver;

import elements.EbayHome_Elements;
import steps.CommonSteps;

public class EbayHome_actions {
	private WebDriver driver;
	EbayHome_Elements ebayHome_Elements;

	public EbayHome_actions(CommonSteps commonSteps) {
		this.driver = commonSteps.getDriver();
		ebayHome_Elements = new EbayHome_Elements(driver);

	}

	public void clickAdvancedLink() {
		ebayHome_Elements.advancedLinkElement.click();
	}
	
	
	

}
