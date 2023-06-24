package steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayAdvanceSearch_Steps {
	public EbayAdvanceSearch_Steps(CommonSteps commonSteps) {
		this.driver = commonSteps.getDriver();

	}

	WebDriver driver;

	@Given("I am on Ebay Advanced Search Page")
	public void i_am_on_ebay_advanced_search_page() {
		driver.get("https://www.ebay.com/sch/ebayadvsearch");
	}

	@When("I click on Ebay Logo")
	public void i_click_on_ebay_logo() {
		driver.findElement(By.xpath("//a[@id='gh-la']")).click();
	}

	@Then("I am navigate to Ebay Home PAge")
	public void i_am_navigate_to_ebay_home_p_age() {
		String expectedUrl = "https://www.ebay.com/";
		String Url = driver.getCurrentUrl();
		if (!expectedUrl.equalsIgnoreCase(Url)) {
			Assert.fail("not match");

		}
	}

	@Given("I am On Ebay  Home Page")
	public void i_am_on_ebay_home_page() {
		driver.get("https://www.ebay.com/");
	}

	@When("I search for {string}")
	public void i_search_for_iphone(String str1) {
		WebElement enter = driver.findElement(By.cssSelector("#gh-ac"));
		enter.sendKeys(str1);
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
	}

	@Then("I validate atleast {int} search item present")
	public void i_validate_atleast_search_item_present(int int1) {
		String itemCount = driver
				.findElement(By.cssSelector("div[class='srp-controls__control srp-controls__count'] span:nth-child(1)"))
				.getText().trim();
		String itemCount2 = itemCount.replace(",", "");
		int itemCountInt = Integer.parseInt(itemCount2);
		// Integer.toString();- Convert int to string
		if (!(itemCountInt >= int1)) {
			Assert.fail("less then thosend shown");

		}

	}

	@When("I search for {string} in {string} category")
	public void i_search_for_in_category(String string, String string2) {
		WebElement enter = driver.findElement(By.cssSelector("#gh-ac"));
		enter.sendKeys(string);
		List<WebElement> cat = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		for (WebElement webElement : cat) {
			if (webElement.getText().equals(string2)) {
				webElement.click();
				break;

			}

		}

		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

	}

	@When("I advanced search an item")
	public void i_advanced_search_an_item(DataTable dataTable) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='_nkw']")).sendKeys(dataTable.cell(1, 0));
		driver.findElement(By.xpath("//input[@id='_ex_kw']")).sendKeys(dataTable.cell(1, 1));
		driver.findElement(By.id("s0-1-17-5[2]-@range-comp[]-@range-textbox[]-textbox")).sendKeys(dataTable.cell(1, 2));
		driver.findElement(By.id("s0-1-17-5[2]-@range-comp[]-@range-textbox[]_1-textbox")).sendKeys(dataTable.cell(1, 3));
		driver.findElement(
				By.xpath("//div[@class='adv-form__actions']//button[@type='submit'][normalize-space()='Search']"))
				.click();
		Thread.sleep(3000);

	}

}
