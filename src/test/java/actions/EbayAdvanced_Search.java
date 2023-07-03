package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import elements.EbayAdvanchedSearch_Elements;
import steps.CommonSteps;

public class EbayAdvanced_Search {
	WebDriver driver;
	EbayAdvanchedSearch_Elements ebayAdvancedElements;

	public EbayAdvanced_Search(CommonSteps commonSteps) {
		this.driver = commonSteps.getDriver();
		PageFactory.initElements(driver, this);
		ebayAdvancedElements = new EbayAdvanchedSearch_Elements(driver);
	}

	public void clickOnLogo() {
		ebayAdvancedElements.ebayHomeLogoElement.click();

	}

	public void searChing(String str1) {
		ebayAdvancedElements.searchElement.sendKeys(str1);

	}

	public void clickSearch() {
		ebayAdvancedElements.searchBtnElement.click();

	}

	public void enterItemNum(String st1) {
		ebayAdvancedElements.enterKeywordItemNUmElement.sendKeys(st1);

	}

	public void excludeWordSearch(String st3) {
		ebayAdvancedElements.excludeWordFAROMsEEARCHElement.sendKeys(st3);

	}

	public void minPrice(String st5) {
		ebayAdvancedElements.minPriceElement.sendKeys(st5);

	}

	public void maxPrice(String st6) {
		ebayAdvancedElements.maxPriceElement.sendKeys(st6);

	}

	public void clickSearchad() {
		ebayAdvancedElements.advancedsearchElement.click();

	}

}
