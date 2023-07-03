package actions;

import org.openqa.selenium.WebDriver;

import steps.CommonSteps;

public class CommonAction {
	WebDriver driver;

	public CommonAction(CommonSteps commonSteps) {
		this.driver = commonSteps.getDriver();
	}

	public void gotoUrl(String url) {
		driver.get(url);

	}

	public String getCurentTitle() {
		return driver.getTitle();

	}

	public String getCurentUrl() {
		return driver.getCurrentUrl();

	}

	public void quitWebdriver() {
		driver.quit();

	}
	
	

}
