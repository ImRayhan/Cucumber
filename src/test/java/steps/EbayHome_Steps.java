package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayHome_Steps {
	public EbayHome_Steps(CommonSteps commonSteps) {
		this.driver = commonSteps.getDriver();

	}

	WebDriver driver;

	@Given("I am on Ebay Home Page")
	public void i_am_on_ebay_home_page() {
		driver.get("https://www.ebay.com/");
	}

	@When("I click on Advanced Link")
	public void i_click_on_advanced_link() {
		driver.findElement(By.xpath("//a[@id='gh-as-a']")).click();
	}

	@Then("I navigate to Advanced Search")
	public void i_navigate_to_advanced_search() {
		String url = "https://www.ebay.com/sch/ebayadvsearch";
		String actualUrl = driver.getCurrentUrl();
		if (!url.equalsIgnoreCase(actualUrl)) {
			Assert.fail("not same");

		}

	}

}
