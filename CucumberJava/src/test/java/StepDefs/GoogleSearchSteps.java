package StepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSteps {
	WebDriver driver = null;

	@Given("Browser is open")
	public void browser_is_open() {
		System.out.println("Inside Step : Browser is open");
		// WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();
		// driver.get("http://www.google.com/");
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath + "/src/test/resources/drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@And("User is on Google Search Page")
	public void user_is_on_google_search_page() {
		System.out.println("Inside Step : User is on Google Search Page");
		driver.navigate().to("http://www.google.com/");
	}

	@When("User enters text to search")
	public void user_enters_text_to_search() {
		System.out.println("Inside Step : User enters text to search");
		driver.findElement(By.name("q")).sendKeys("SDET");
	}

	@And("User hit Enter")
	public void user_hit_enter() {
		System.out.println("Inside Step : User hit Enter");
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).sendKeys(Keys.RETURN);
	}

	@Then("User navigate to search results")
	public void user_navigate_to_search_results() {
		System.out.println("Inside Step : User navigate to search results");
		System.out.println("Page Title : " + driver.getTitle());
		driver.getPageSource().contains("Difference Between SDET And TESTER?");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		driver.quit();
	}

}
