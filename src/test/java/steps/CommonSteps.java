package steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CommonSteps {
	private WebDriver driver;

	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@After
	public void tearDown() throws InterruptedException {
		driver.quit();
		Thread.sleep(1000);

	}

	@Before("@beforespecificHooks")
	public void beforespecificHooks() {
		System.out.println("before scebario soecific");

	}

	@After("@afterspecificHooks")
	public void afterspecificHooks() {
		System.out.println("after scebario soecific");

	}

	public WebDriver getDriver() {
		return driver;

	}

}
