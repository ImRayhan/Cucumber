package elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayAdvanchedSearch_Elements {
	WebDriver driver;
	
	public EbayAdvanchedSearch_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@xpid='gh-la']")
	public WebElement ebayHomeLogoElement;

	@FindBy(css = "#gh-ac")
	public WebElement searchElement;

	@FindBy(xpath = "//input[@id='gh-btn']")
	public WebElement searchBtnElement;

	@FindBy(css = "div[class='srp-controls__control srp-controls__count'] span:nth-child(1)")
	public WebElement presentElement;

	@FindBy(xpath = "//select[@id='gh-cat']/option")
	public List<WebElement> listCatagoryElement;

	@FindBy(xpath = "//input[@id='_nkw']")
	public WebElement enterKeywordItemNUmElement;

	@FindBy(xpath = "//input[@id='_ex_kw']")
	public WebElement excludeWordFAROMsEEARCHElement;

	@FindBy(css =  "body > div:nth-child(3) > div:nth-child(1) > main:nth-child(4) > form:nth-child(1) > fieldset:nth-child(4) > div:nth-child(2) > div:nth-child(3) > span:nth-child(2) > span:nth-child(2) > input:nth-child(1)")
	public WebElement minPriceElement;

	@FindBy(id  = "s0-1-17-5[2]-@range-comp[]-@range-textbox[]_1-textbox")
	public WebElement maxPriceElement;

	@FindBy(xpath = "//div[@class='adv-form__actions']//button[@type='submit'][normalize-space()='Search']")
	public WebElement advancedsearchElement;
	
	

}
